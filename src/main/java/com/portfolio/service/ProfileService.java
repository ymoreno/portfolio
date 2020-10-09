package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private Twitter twitter;

    public void getTwitterInfo() {
        String screenName = twitter.userOperations().getScreenName();
        String description = twitter.userOperations().getUserProfile().getDescription();
        String profileImageUrl = twitter.userOperations().getUserProfile().getProfileImageUrl();
        final List<Tweet> homeTimeline = twitter.timelineOperations().getHomeTimeline(5);
    }

}
