package com.wetheasians.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Joseph Yuanhao Li
 * @date 8/13/21 12:44 PM
 */

@Controller
public class ideaController {
    @GetMapping("info")
    @ResponseBody
    public String getInfoFromIdea() {
        return "this is a spring boot project from idea";
    }

}
