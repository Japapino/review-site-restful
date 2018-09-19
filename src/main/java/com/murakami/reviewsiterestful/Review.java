package com.murakami.reviewsiterestful;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Category category;

    private String title = "Test Title";
    private String description = "Test description";
    private String coverURL = "url";

    private Review(){}

    public Review(String title){
        this.title = title;
    }

    public Review(String title, Category category){
        this.title = title;
        this.category = category;
    }


    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCoverURL(String url){
        this.coverURL = url;
    }

    public void setCategory(Category category){
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
        return category.getName();
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
