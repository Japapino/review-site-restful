package com.murakami.reviewsiterestful;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class MappingTest {

    @Resource
    private TestEntityManager entityManager;

    @Resource
    private ReviewRepository reviewRepo;

    @Resource
    private CategoryRepository categoryRepo;


    @Test
    public void shouldSaveReviewToCategoryRelationship(){
        Category category = new Category("Test Category");
        category = categoryRepo.save(category);
        long categoryId = category.getId();

        Review review = new Review("Test Movie", category);
        review = reviewRepo.save(review);

        Review review2 = new Review("Test Movie2", category);
        review2 = reviewRepo.save(review2);

        entityManager.flush();
        entityManager.clear();

        category = categoryRepo.findOne(categoryId);

        assertThat(category.getReviews(), containsInAnyOrder(review, review2));
    }
}
