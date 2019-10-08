package com.xxx.integrate.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configuration
public class MyConfig {
    @Bean
    public GsonHttpMessageConverter gsonHttpMessageConverter(){
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        GsonBuilder builder = new GsonBuilder();
        builder.setDateFormat("yyyy年MM月dd");
        Gson gson = builder.create();
        converter.setGson(gson);
        return converter;
    }

    @WebFilter("/*")
    public class MyFilter implements Filter{

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            System.out.println("doFilter method");
        }
    }
    @WebListener
    public class MyListener implements ServletRequestListener{
        @Override
        public void requestInitialized(ServletRequestEvent sre) {
            System.out.println("requestInitialized method");
        }
    }

}
