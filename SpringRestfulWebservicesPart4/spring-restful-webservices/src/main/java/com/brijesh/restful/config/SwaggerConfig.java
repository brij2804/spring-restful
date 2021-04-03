package com.brijesh.restful.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//configuration
@Configuration
//enable swagger
@EnableSwagger2
public class SwaggerConfig {

    public static final Contact DEFAULT_CONTACT= new Contact("Brijesh","","brijesh@swaggertesting.com");

    public static final ApiInfo DEFAULT_API_INFO= new ApiInfo("Api Documentation","Api Documentation","1.0","urn:tos",DEFAULT_CONTACT,"Apache 2.0","http://www.apache.org/licenses/LICENSE-2.0",new ArrayList<>());

    private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES= new HashSet<String>(Arrays.asList("application/json","application/xml"));


    // bean -docket
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                .produces(DEFAULT_PRODUCES_AND_CONSUMES)
                .consumes(DEFAULT_PRODUCES_AND_CONSUMES);
    }
    //swagger 2
    //all paths
    //

}
