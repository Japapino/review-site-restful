package com.murakami.reviewsiterestful;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

//    Collection<Review> findOne(Long id);

}
