package com.vh.ratingservice.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rating {


    @Id
    @Column(name="uuid")
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;
    private String userId;

    private String hotelId;
    private Integer rating;
    private String feedback;


}
