package com.portfolio.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

@Configuration
@ComponentScan("com.portfolio")
public class AppConfig {

    @Autowired
    AppProperties properties;

    @Bean
    TwitterTemplate getTwitterTemplate() {
        return new TwitterTemplate(properties.getApiKey(), properties.getSecretApiKey(), properties.getAccessToken(), properties.getAccessTokenSecret());
    }

}
