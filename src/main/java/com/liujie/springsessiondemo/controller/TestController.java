package com.liujie.springsessiondemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/*** All rights Reserved, Designed By www.info4z.club
 * <p>title:com.liujie.springsessiondemo.controller</p> 
 * <p>ClassName:TestController</p> 
 * <p>Compony:Info4z</p> 
 * author:poker_heart 
 * date:2020/11/5 
 * version:1.0 
 */
@RestController
public class TestController {
    @GetMapping("/set")
    public String setSession(HttpSession session) {

        session.setAttribute("key", "value");
        return "ok!";
    }
 @GetMapping("/get")
    public String getSession(HttpSession session){
        return (String) session.getAttribute("key");

 }

}
