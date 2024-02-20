package com.app.Services;
import com.app.Entities.Payment;
import com.app.Dao.PaymentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    public List<Payment> getAllPayments() {
        return paymentDao.findAll();
    }

    public Payment getPaymentById(Long paymentId) {
        return paymentDao.findById(paymentId).orElse(null);
    }

    public Payment createPayment(Payment payment) {
        return paymentDao.save(payment);
    }

    public Payment updatePayment(Long paymentId, Payment payment) {
        if (paymentDao.existsById(paymentId)) {
            payment.setId(paymentId);
            return paymentDao.save(payment);
        } else {
            return null; // Handle not found scenario
        }
    }

    public void deletePayment(Long paymentId) {
        paymentDao.deleteById(paymentId);
    }

    // Additional custom method example
    public List<Payment> getPaymentsByStatus(String paymentStatus) {
        return paymentDao.findByPaymentStatus(paymentStatus);
    }
}

