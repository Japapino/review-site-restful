package com.murakami.reviewsiterestful;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import javax.annotation.Resource;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;


@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class CategoryJpaTest {

    @Resource
    private TestEntityManager entityManager;

    @Resource
    private CategoryRepository categoryRepo;

    @Test
    public void ShouldSaveAndLoadCategory(){
        Category test = new Category("Test");
        test = categoryRepo.save(test);
        long categoryId = test.getId();

        entityManager.flush();
        entityManager.clear();

        test = categoryRepo.findOne(categoryId);
        assertThat(test.getName(), is("Test"));
    }

}
