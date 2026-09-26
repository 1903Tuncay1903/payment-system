package com.example.demo.service;

import com.example.demo.model.PaymentRequest;
import com.example.demo.model.PaymentResponse;

public interface PaymentProcessor {

    PaymentResponse createPayment(PaymentRequest request);

    PaymentResponse getPaymentById(String id);
}
