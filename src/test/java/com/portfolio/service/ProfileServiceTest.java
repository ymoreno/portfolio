package com.portfolio.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProfileServiceTest {

    @Autowired
    ProfileService profileService;

    @DisplayName("Test twitter")
    @Test
    void getTwitterInfo() {
        profileService.getTwitterInfo();

    }
}