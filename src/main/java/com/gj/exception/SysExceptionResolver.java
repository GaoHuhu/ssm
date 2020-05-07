package com.gj.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView=new ModelAndView();

        SysException ex=null;

        if(e instanceof SysException){
            ex=(SysException)e;
        }else {
            ex=new SysException("系统维护");
        }
        modelAndView.addObject("errorMsg",ex.getMessage());
        modelAndView.setViewName("error");

        return modelAndView;
    }
}
