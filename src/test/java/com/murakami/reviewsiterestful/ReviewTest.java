package com.murakami.reviewsiterestful;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class ReviewTest {

    Review test = new Review();

    @Test
    public void reviewsShouldContainNameAndDescription(){
        Review test = new Review();
        String testName = test.getTitle();
        String testDescription = test.getDescription();
        assertNotNull(testName);
        assertNotNull(testDescription);
    }

    @Test
    public void shouldBeAbleToAddOrModifyTitleAndDescriptionsAfterMakingReview(){

        test.setTitle("Batman");
        test.setDescription("Description here");
        assertThat(test.getTitle(), is("Batman"));
        assertThat(test.getDescription(), is("Description here"));
    }
}
