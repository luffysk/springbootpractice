package com.xxx.integrate.custom;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@ControllerAdvice
public class CustomException {
    /*@ExceptionHandler(MaxUploadSizeExceededException.class)
    public ModelAndView uploadException(MaxUploadSizeExceededException e, HttpServletResponse resp)throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","自定义异常测试！");
        mv.setViewName("error");
        return mv;

    }*/
}
