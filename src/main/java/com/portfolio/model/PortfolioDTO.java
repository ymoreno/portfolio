package com.portfolio.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.social.twitter.api.Tweet;

import java.util.List;

@Getter
@Setter
@Builder
public class PortfolioDTO {

    private String description;
    private String imageUrl;
    private String twitterUserName;
    private List<Tweet> tweets;
}
