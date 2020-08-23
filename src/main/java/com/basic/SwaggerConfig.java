package com.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.collect.Sets.newHashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



// end point url : http://localhost:8080/swagger-resources/
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	public static final Contact DEFAULT_CONTACT = new Contact("ranjan", "ranjan8125@gmail.com", "80800000");
	  public static final ApiInfo DEFAULT_API_NFO = new ApiInfo("Api Description", "Api Documentation", "1.0", "urn:tos",
	          DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
	  private static final Set<String> produces = new HashSet<String>(Arrays.asList("application/json","application/xml"));
	  private final Set<String> consumes = new HashSet<String>(Arrays.asList("application/json","application/xml"));
	@Bean
	public Docket config(){
		ApiInfo apiInfo;
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_NFO).produces(produces).consumes(consumes);
	}

}
