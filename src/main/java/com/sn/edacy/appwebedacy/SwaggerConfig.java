package com.sn.edacy.appwebedacy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.*;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static String AUTH_SERVER="";
    private static String CLIENT_ID="";
    private static String CLIENT_SECRET="";


    @Bean
    public Docket nessicoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sn.edacy.appwebedacy"))
                .paths(PathSelectors.regex("/api*"))
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Edacy API",
                "description des API nessico.",
                "API V1",
                "Terms of service",
                new Contact("Ndongo SAMB", "www.orange-sonatel.com", "sambndongo@orange-sonatel.com"),
                "License of API", "API license URL", Collections.emptyList());
    }



}
