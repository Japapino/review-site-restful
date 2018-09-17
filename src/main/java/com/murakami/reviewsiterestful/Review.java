package com.murakami.reviewsiterestful;

public class Review {

    private String title = "Test Title";
    private String description = "Test description";

    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }


}
