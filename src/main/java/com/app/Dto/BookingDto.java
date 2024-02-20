package com.app.Dto;


import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookingDto {
    private LocalDate date;
    private String paymentStatus;

    // DTOs for associated entities
    private UserDto user;
    private TourPackageDto tourPackage;
    private HotelDto hotel;
    private BusDto bus;
    private TrainDto train;
    private FlightDto flight;
    private List<PaymentDto> payments;

}

