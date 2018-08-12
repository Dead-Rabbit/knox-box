
package com.knoxupc.knoxweb.common;

/**
 * Created by wangzixiao on 2018.8.12
 * 
 * @param <T>
 */
public class RequestResult<T> {

    private boolean isSuccess;

    private String errorCode;

    private String errorMsg;

    private T result;

    public RequestResult(T result) {
        this.isSuccess = true;
        this.result = result;
    }

    public RequestResult(String errorCode, String errorMsg) {
        this.isSuccess = false;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public static <R> RequestResult<R> newInstance(R result) {
        RequestResult<R> requestResult = new RequestResult(result);
        return requestResult;
    }

    public static RequestResult newInstance(String errorCode, String errorMsg) {
        RequestResult requestResult = new RequestResult(errorCode, errorMsg);
        return requestResult;
    }

    public static RequestResult<Void> newVoidInstance() {
        RequestResult requestResult = new RequestResult((Void) null);
        return requestResult;
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
}
