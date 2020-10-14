package com.portfolio.controller;

import com.portfolio.exceptions.PortfolioNotFoundException;
import com.portfolio.model.Portfolio;
import com.portfolio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class PortfolioController {

    private PortfolioService portfolioService;

    @Autowired
    public void setPortfolioService(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @GetMapping("/{id}")
    public Portfolio getPortfolio(@PathVariable String id) throws PortfolioNotFoundException {
        return portfolioService.getPortfolio(Long.valueOf(id));
    }

    @PutMapping("/")
    public Portfolio setPortfolio(@RequestBody Portfolio portfolio) {
        return portfolioService.updatePortfolio(portfolio);

    }
}
