package com.murakami.reviewsiterestful;

public class Review {

    private String title = "Test Title";
    private String description = "Test description";
    private String coverURL = "url";
    private String category = "category";

    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCoverURL(String url){
        this.coverURL = url;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public String getCoverURL(){
        return coverURL;
    }

    public String getCategory(){
        return category;
    }


}
