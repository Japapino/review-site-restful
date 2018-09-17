package com.murakami.reviewsiterestful;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

    Review findByName(String name);

    @Override
    Set<Review> findAll();


}
