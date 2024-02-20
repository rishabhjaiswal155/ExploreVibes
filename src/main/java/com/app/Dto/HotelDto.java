package com.app.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HotelDto {
    private Long hotelId;
    private String name;
    private String location;
    private String rating;
    }

