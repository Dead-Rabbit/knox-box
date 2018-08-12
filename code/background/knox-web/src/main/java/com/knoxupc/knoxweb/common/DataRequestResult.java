
package com.knoxupc.knoxweb.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by wangzixiao on 2018.8.12
 * 
 * @param <T>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataRequestResult<T> {

    private boolean isSuccess;

    private String errorCode;

    private String errorMsg;

    private T result;

    private DataRequestResult(T result) {
        this.isSuccess = true;
        this.result = result;
    }

    private DataRequestResult(String errorCode, String errorMsg) {
        this.isSuccess = false;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public static <R> DataRequestResult<R> newInstance(R result) {
        return new DataRequestResult<>(result);
    }

    public static DataRequestResult newInstance(String errorCode, String errorMsg) {
        return new DataRequestResult(errorCode, errorMsg);
    }

    public static DataRequestResult newInstance(String errorCode, Exception error) {
        return new DataRequestResult(errorCode, getStackTraceInfo(error));
    }

    public static DataRequestResult<Void> newVoidInstance() {
        return new DataRequestResult((Void) null);
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    /**
     * 获取e.printStackTrace() 的具体信息，赋值给String 变量，并返回
     *
     * @param e Exception
     * @return e.printStackTrace() 中 的信息
     */
    public static String getStackTraceInfo(Exception e) {
        StringWriter sw = null;
        PrintWriter pw = null;

        try {
            sw = new StringWriter();
            pw = new PrintWriter(sw);
            e.printStackTrace(pw);//将出错的栈信息输出到printWriter中
            pw.flush();
            sw.flush();

            return sw.toString();
        } catch (Exception ex) {

            return "发生错误";
        } finally {
            if (sw != null) {
                try {
                    sw.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (pw != null) {
                pw.close();
            }
        }

    }

}
