package com.seguritech.config.swagger;

import static springfox.documentation.builders.PathSelectors.regex;

import javax.servlet.ServletContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.common.collect.ImmutableList;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	final static String PACKAGE_CONTROLLER = "com.seguritech.controller";
	
	@Bean
	public Docket productApi(ServletContext servletContext) {

		Docket docket = new Docket(DocumentationType.SWAGGER_2);

		docket.select().apis(RequestHandlerSelectors.basePackage(PACKAGE_CONTROLLER))
			.paths(PathSelectors.any())
				.build().apiInfo(metaData());

		docket.useDefaultResponseMessages(false).
		globalResponseMessage(RequestMethod.GET, ImmutableList.of(
						new ResponseMessageBuilder()
							.code(400).message("Bad Request")
							.build(),
						new ResponseMessageBuilder()
							.code(500)
							.message("Server Error")
							.responseModel(new ModelRef("Error"))
							.build()));

		return docket;

	}

	private ApiInfo metaData() {
		ApiInfo apiInfo = new ApiInfo(
				"API CATALOGO DE CATALOGOS", 
				"API REST", 
				"1.0", 
				"Terms of service",
				new Contact(
						"Seguritech", 
						"https://seguritech.com", 
						"juan.bucio@seguritech.com"),
				"Apache License Version 2.0", 
				"https://www.apache.org/licenses/LICENSE-2.0");
		return apiInfo;
	}

}


