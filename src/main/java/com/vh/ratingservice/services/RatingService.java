package com.vh.ratingservice.services;

import com.vh.ratingservice.entities.Rating;

import java.util.List;

public interface RatingService {


    Rating create(Rating rating);

    List<Rating> getAllRatings();


    List<Rating> getRatingByUserId(String userId);


    List<Rating> getRatingByHotelId(String hotelId);




}
