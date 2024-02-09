package com.vh.ratingservice.impl;

import com.vh.ratingservice.entities.Rating;
import com.vh.ratingservice.repositories.RatingRepository;
import com.vh.ratingservice.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {


    @Autowired
    private RatingRepository ratingRepository;


    @Override
    public Rating create(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepository.findByUserId(userId) ;
    }

    @Override
    public List<Rating> getRatingByHotelId(String userId) {
        return ratingRepository.findByHotelId(userId);
    }

}
