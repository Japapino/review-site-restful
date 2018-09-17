package com.murakami.reviewsiterestful;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import javax.annotation.Resource;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class reviewJpaTest {

    @Resource
    private TestEntityManager entityManager;

    @Resource
    private ReviewRepository reviewRepo;

    @Test
    public void shouldSaveAndLoadReview(){
        Review test =  new Review("Test");
        test = reviewRepo.save(test);
        long reviewId = test.getId();

        entityManager.flush();
        entityManager.clear();

        test = reviewRepo.findById(reviewId);
        assertThat(test.getTitle(), is("Test"));
    }
}
