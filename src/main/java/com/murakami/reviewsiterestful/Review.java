package com.murakami.reviewsiterestful;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Review {

    @Id
    @GeneratedValue
    private long id;


    private String title = "Test Title";
    private String description = "Test description";
    private String coverURL = "url";
    private String category = "category";

    private Review(){}

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

    public long getId(){
        return id;
    }

    @Override
    public int hashCode() {
        return ((Long) id).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        return id == ((Review) obj).id;
    }


}
