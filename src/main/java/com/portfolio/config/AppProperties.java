package com.portfolio.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
public class AppProperties {
    @Value("${twitter.api_key}")
    private String apiKey;
    @Value("${twitter.api_secret_key}")
    private String secretApiKey;
    @Value("${twitter.access_token}")
    private String accessToken;
    @Value("${twitter.access_token_secret}")
    private String accessTokenSecret;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

}
