package com.portfolio.controller;

import com.portfolio.model.PortfolioDTO;
import com.portfolio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    private PortfolioService portfolioService;

    @Autowired
    public void setPortfolioService(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @RequestMapping(value = "/profile")
    public String index(Model model) {
        PortfolioDTO dto = portfolioService.getTwitterInfo();
        model.addAttribute("description", dto.getDescription());
        model.addAttribute("imageUrl", dto.getImageUrl());
        model.addAttribute("twitterUserName", dto.getTwitterUserName());
        model.addAttribute("tweets", dto.getTweets());
        return "profile";
    }


}
