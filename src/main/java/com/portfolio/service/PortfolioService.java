package com.portfolio.service;

import com.portfolio.model.Portfolio;
import com.portfolio.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {

    @Autowired
    private Twitter twitter;

    @Autowired
    private PortfolioRepository portfolioRepository;

    public void getTwitterInfo() {
        String screenName = twitter.userOperations().getScreenName();
        String description = twitter.userOperations().getUserProfile().getDescription();
        String profileImageUrl = twitter.userOperations().getUserProfile().getProfileImageUrl();
        final List<Tweet> homeTimeline = twitter.timelineOperations().getHomeTimeline(5);
    }

    public Portfolio getPortfolio(Long idPortfolio) {
        return portfolioRepository.findById(idPortfolio).orElse(null);
    }

    public Portfolio updatePortfolio(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }
}
