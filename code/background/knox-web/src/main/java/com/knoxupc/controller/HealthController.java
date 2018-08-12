package com.knoxupc.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by wangzixiao on 2018.8.12
 */
@RestController
public class HealthController {

    @CrossOrigin
    @RequestMapping(value = "health.do")
    @ResponseBody
    String healthCheck() {
        StringBuilder buf = new StringBuilder();
        buf.append("ok");
        return buf.toString();
    }
}
