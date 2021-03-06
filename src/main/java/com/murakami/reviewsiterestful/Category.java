package com.murakami.reviewsiterestful;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private long id;

    @OneToMany(mappedBy="category")
    private Collection<Review> reviews;

    private String name;

    private Category(){}

    public Category(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public long getId(){
        return id;
    }

    public Collection<Review> getReviews(){
        return reviews;
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

        return id == ((Category) obj).id;
    }


}
