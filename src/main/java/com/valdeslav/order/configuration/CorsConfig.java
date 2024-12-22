package com.valdeslav.order.configuration;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Getter
@Configuration
@SuppressWarnings("unused")
public class CorsConfig {
    @Value("${appConfig.cors.allowedOrigins}")
    private List<String> allowedOrigins;
    @Value("${appConfig.cors.allowedHeaders}")
    private List<String> allowedHeaders;
    @Value("${appConfig.cors.allowedMethods}")
    private List<String> allowedMethods;
}