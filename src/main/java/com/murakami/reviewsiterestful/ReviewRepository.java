package com.murakami.reviewsiterestful;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Set;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

    Collection<Review> findByCategory(Category category);

    @Override
    Set<Review> findAll();


}
