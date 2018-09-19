package com.murakami.reviewsiterestful;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private ReviewRepository reviewRepo;

    @Resource
    private CategoryRepository categoryRepo;

    @Override
    public void run(String... args) throws Exception {
        Category memoir = new Category("Memoir");
        Category historicalDocumentary = new Category("Historical Documentary");
        Category sportsDocumentary = new Category("Sports Documentary");
        memoir = categoryRepo.save(memoir);
        historicalDocumentary = categoryRepo.save(historicalDocumentary);
        sportsDocumentary = categoryRepo.save(sportsDocumentary);

        Review superman = new Review("Superman", memoir);
        Review sherlock = new Review("Sherlock", historicalDocumentary);
        Review batman = new Review("Batman", sportsDocumentary);

        sherlock.setCoverURL("./images/sherlock.jpg");
        superman.setCoverURL("./images/superman.png");
        batman.setCoverURL("./images/batman.jpg");

        superman = reviewRepo.save(superman);
        sherlock = reviewRepo.save(sherlock);
        batman = reviewRepo.save(batman);
    }
}
