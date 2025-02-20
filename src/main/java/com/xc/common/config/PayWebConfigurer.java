package com.xc.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.xc.common.handler.ApiHandler;

@Configuration
public class PayWebConfigurer extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 拦截器适配
		registry.addInterceptor(new ApiHandler()).addPathPatterns("/api/**");
		registry.addInterceptor(new ApiHandler()).addPathPatterns("/cb/**");
		super.addInterceptors(registry);
	}
}
