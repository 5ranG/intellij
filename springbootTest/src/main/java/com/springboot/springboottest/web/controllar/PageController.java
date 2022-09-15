package com.springboot.springboottest.web.controllar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping({"/", "/index"}) //html찾아서 가져오기
    public String loadIndex(){
        return "index";
    }

    @ResponseBody //data 파일읽기
    @GetMapping("/name")
    public String getName(@RequestParam("myname") String myname){
        return myname;
    }

}


