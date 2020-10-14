package com.portfolio.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "portfolio")
public class Portfolio {

    @Id
    @Column(name = "idportfolio")
    private Long idPortfolio;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "twitter_user_name")
    private String twitterUserName;

    @Column(name = "tittle")
    private String tittle;
}
