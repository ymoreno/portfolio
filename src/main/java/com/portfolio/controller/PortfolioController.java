package com.portfolio.controller;

import com.portfolio.model.Portfolio;
import com.portfolio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class PortfolioController {

    @Autowired
    PortfolioService portfolioService;

    @GetMapping("/{id}")
    public Portfolio getPortfolio(@PathVariable String id) {
        return portfolioService.getPortfolio(Long.valueOf(id));
    }

    @PutMapping("/{id}")
    public void setPortfolio() {


    }
}
