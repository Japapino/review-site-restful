package com.murakami.reviewsiterestful;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class ReviewRestController {

    @Resource
    ReviewRepository reviewRepo;

    @Resource
    CategoryRepository categoryRepo;

    @RequestMapping(path = "/reviews/{reviewId}", method = RequestMethod.GET)
    public Review getReview(@PathVariable("reviewId") long reviewId){
        Review displayReview = reviewRepo.findOne(reviewId);
        return displayReview;
    }

    @CrossOrigin("*")
    @RequestMapping(path = "/reviews", method = RequestMethod.GET)
    public Iterable<Review> getReviews(){
        return reviewRepo.findAll();
    }
}
