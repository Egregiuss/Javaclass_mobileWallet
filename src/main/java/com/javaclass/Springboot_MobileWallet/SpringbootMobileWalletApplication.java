package com.javaclass.Springboot_MobileWallet;

import io.swagger.models.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;
@Configuration
@EnableSwagger2
@SpringBootApplication
public class SpringbootMobileWalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMobileWalletApplication.class, args);
	}

	@Bean
	public Docket swaggerconfiguaration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(regex("/.*"))
				.apis(RequestHandlerSelectors.basePackage("com.javaclass"))
				.build()
				.apiInfo(apiDetails());



	}

	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Mobile Wallet API",
				"Mobile Wallet API for JavaClass",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("Java class","http://javaclass.com", "javaclasss@gmail.com"),
				"API License",
				"http://javaclass.com",
				Collections.emptyList());

	}
}



