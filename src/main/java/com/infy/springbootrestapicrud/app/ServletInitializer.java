package com.infy.springbootrestapicrud.app;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
 {		system.out.println("hello this is git practice")
		return application.sources(SpringbootrestapicrudApplication.class);
	}

}
