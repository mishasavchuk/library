package com.lp.library.config;

import com.lp.library.controller.AuthorController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.hateoas.config.EnableEntityLinks;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@EnableEntityLinks
@ComponentScan(basePackageClasses = AuthorController.class)
@Import({ PersistenceConfig.class, RestConfig.class })
public class WebConfig extends WebMvcConfigurerAdapter
{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/client/**")
                .addResourceLocations("/client/");
    }
}