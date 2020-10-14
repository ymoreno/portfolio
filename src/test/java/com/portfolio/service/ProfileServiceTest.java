package com.portfolio.service;

import com.portfolio.model.Portfolio;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProfileServiceTest {

    @Autowired
    PortfolioService profileService;

    @DisplayName("Test twitter")
    @Test
    void getTwitterInfo() {
        profileService.getTwitterInfo();

    }

    @DisplayName("Test JPA")
    @Test
    void getPortfolio() {
        Portfolio portfolio = profileService.getPortfolio(1L);
        System.out.println(portfolio.getDescription());
    }

}