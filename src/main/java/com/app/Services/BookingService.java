package com.app.Services;


import com.app.Entities.Booking;
import com.app.Dao.BookingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingDao bookingDao;

    public List<Booking> getAllBookings() {
        return bookingDao.findAll();
    }

    public Booking getBookingById(Long bookingId) {
        return bookingDao.findById(bookingId).orElse(null);
    }

    public Booking createBooking(Booking booking) {
        return bookingDao.save(booking);
    }

    public Booking updateBooking(Long bookingId, Booking booking) {
        if (bookingDao.existsById(bookingId)) {
            booking.setId(bookingId);
            return bookingDao.save(booking);
        } else {
            return null; // Handle not found scenario
        }
    }

    public void deleteBooking(Long bookingId) {
        bookingDao.deleteById(bookingId);
    }

    // Additional custom method example
    public List<Booking> getBookingsByUser(Long userId) {
        return bookingDao.findByUserId(userId);
    }
}

