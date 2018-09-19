package com.murakami.reviewsiterestful;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ReviewController {

    @Resource
    ReviewRepository reviewRepo;

    @Resource
    CategoryRepository categoryRepo;

    @RequestMapping(path = "/reviews", method = RequestMethod.GET)
    public Review getReview(@PathVariable("reviewId") long reviewId){
        Review displayReview = reviewRepo.findOne(reviewId);
        return displayReview;
    }
}
