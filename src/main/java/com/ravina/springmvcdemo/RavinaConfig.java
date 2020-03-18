package com.ravina.springmvcdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.ravina.springmvcdemo")
public class RavinaConfig extends WebMvcConfigurationSupport {

 

    @Bean
    public InternalResourceViewResolver viewResolver() {

 

        InternalResourceViewResolver vr = new InternalResourceViewResolver();

 

        vr.setPrefix("/WEB-INF/view/");
        vr.setSuffix(".jsp");
        return vr;
    }
}
