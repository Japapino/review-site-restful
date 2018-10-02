package com.murakami.reviewsiterestful;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class ReviewTest {

    Review test = new Review("test");
    Category testCategory = new Category("action");

    @Test
    public void reviewsShouldContainNameAndDescription(){
        String testName = test.getTitle();
        String testDescription = test.getDescription();
        assertNotNull(testName);
        assertNotNull(testDescription);
    }

    @Test
    public void shouldBeAbleToAddOrModifyDetailsAfterMakingReview(){
        test.setTitle("Batman");
        test.setDescription("Description here");
        test.setCoverURL("URL");
        test.setCategory(testCategory);
        assertThat(test.getTitle(), is("Batman"));
        assertThat(test.getDescription(), is("Description here"));
        assertThat(test.getCoverURL(), is("URL"));
        assertThat(test.getCategory(), is(testCategory));
    }


}
