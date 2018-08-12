
package com.knoxupc.knoxweb;

import com.knoxupc.knoxweb.common.DataRequestResult;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wangzixiao on 2018.8.12
 */
@RestController
public class HealthController {

    /**
     * 健康测试
     * 
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "health.do")
    @ResponseBody
    DataRequestResult healthCheck() {

        String result = "ok";
        return DataRequestResult.newInstance(result);
    }
}
