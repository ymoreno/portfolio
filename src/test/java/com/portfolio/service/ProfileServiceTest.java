package com.portfolio.service;

import com.portfolio.model.Portfolio;
import com.portfolio.model.PortfolioDTO;
import com.portfolio.repository.PortfolioRepository;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProfileServiceTest {

    private PortfolioService profileService;

    @Autowired
    public void setProfileService(PortfolioService profileService) {
        this.profileService = profileService;
    }

    @Mock
    private PortfolioRepository portfolioRepository;

    @DisplayName("Test twitter")
    @Test
    void getTwitterInfo() {
        //
        // Given
        // Valid user in application.yml

        //
        // When
        //
        PortfolioDTO twitterInfo = profileService.getTwitterInfo();

        //
        // Then
        //
        Assert.assertNotNull(twitterInfo);

        // de comment when valid user
        // Assert.assertEquals(5, twitterInfo.getTweets().size());
    }

    @DisplayName("Test JPA")
    @Test
    void getPortfolio() {
        //
        // Given
        //
        Portfolio portfolioMock = Portfolio.builder()
                .idPortfolio(1L)
                .twitterUserName("A name")
                .tittle("A tittle")
                .build();

        Mockito.when(portfolioRepository.findById(1L)).thenReturn(java.util.Optional.ofNullable(portfolioMock));

        //
        // When
        //

        Portfolio portfolio = profileService.getPortfolio(1L);

        //
        // Then
        //
        Assert.assertEquals("A name", portfolio.getTwitterUserName());
        Assert.assertEquals("A tittle", portfolio.getTittle());
        Assert.assertEquals(java.util.Optional.of(1L), portfolio.getIdPortfolio());
    }

}