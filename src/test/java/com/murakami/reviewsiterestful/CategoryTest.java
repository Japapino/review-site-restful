package com.murakami.reviewsiterestful;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CategoryTest {

    @Test
    public void categoryShouldhaveName(){
        Category test = new Category("Action");
        assertThat(test.getName(), is("Action"));
    }
}
