package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
public class myController {

    @GetMapping("/hello")
    public String hello(){
        return "spring boot run successfully";
    }

    @RequestMapping("/enterBill")
    public void enter(HttpServletResponse response){
        try {
            response.sendRedirect("templates/index.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
