package com.peppy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.peppy.login","com.peppy.login.registration"})
@EnableWebMvc
public class ViewConfig {

	@Bean
	InternalResourceViewResolver viewRes() {
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix("/WEB-INF/views/");
		irvr.setSuffix(".jsp");

		return irvr;
	}

	public ViewConfig() {
		System.out.println("ViewConfig.ViewConfig()");
	}

}
