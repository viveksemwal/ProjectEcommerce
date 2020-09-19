package com.vivek.Ecommerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/myAccount")
    public ModelAndView myAccount(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("myAccount");
        return modelAndView
                ;
    }

}
