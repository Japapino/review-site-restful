package com.murakami.reviewsiterestful;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import javax.annotation.Resource;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class reviewJpaTest {

    @Resource
    private TestEntityManager entityManager;

    @Resource
    private ReviewRepository reviewRepo;


    public void shouldSaveAndLoadReview(){
        Review test =  new Review("Test");
        test = reviewRepo.save(test);
        long reviewId = test.getId();

        entityManager.flush();
        entityManager.clear();

        test = reviewRepo.findOne(reviewId);
        assertThat(test.getTitle(), is("Test"));
    }
}
