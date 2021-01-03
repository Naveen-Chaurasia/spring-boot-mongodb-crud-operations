package com.naveen.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class ApplicationSecurity extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/**");

		//ObjectMapper mapper = new ObjectMapper();
		// either via module
		//mapper.registerModule(new ParanamerModule());
	}

}
