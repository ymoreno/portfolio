package com.portfolio.service;

import com.portfolio.exceptions.PortfolioNotFoundException;
import com.portfolio.model.Portfolio;
import com.portfolio.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {

    private Twitter twitter;

    @Autowired
    public void setTwitter(Twitter twitter) {
        this.twitter = twitter;
    }

    private PortfolioRepository portfolioRepository;

    @Autowired
    public void setPortfolioRepository(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    public void getTwitterInfo() {
        String screenName = twitter.userOperations().getScreenName();
        String description = twitter.userOperations().getUserProfile().getDescription();
        String profileImageUrl = twitter.userOperations().getUserProfile().getProfileImageUrl();
        final List<Tweet> homeTimeline = twitter.timelineOperations().getHomeTimeline(5);
    }

    public Portfolio getPortfolio(Long idPortfolio) throws PortfolioNotFoundException {
        return portfolioRepository.findById(idPortfolio)
                .orElseThrow(() -> new PortfolioNotFoundException(String.format("Portfolio id %s Not Found", idPortfolio.toString())));
    }

    public Portfolio updatePortfolio(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }
}
