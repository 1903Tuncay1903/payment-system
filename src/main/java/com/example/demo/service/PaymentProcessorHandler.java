package com.example.demo.service;

import com.example.demo.entity.Payment;
import com.example.demo.mapper.PaymentMapper;
import com.example.demo.model.PaymentRequest;
import com.example.demo.model.PaymentResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PaymentProcessorHandler implements PaymentProcessor {

    public List<Payment> payments = new ArrayList<>();

    @Override
    public PaymentResponse createPayment(PaymentRequest request) {
        var payment = PaymentMapper.mapToPayment(request);
        payments.add(payment);
        return PaymentMapper.mapToPaymentResponse(payment);
    }

    @Override
    public PaymentResponse getPaymentById(String id) {
        Optional<Payment> optionalPayment = payments.stream()
                .filter(payment -> payment.getId().equals(id))
                .findFirst();

        if (optionalPayment.isPresent()) {
            var payment = optionalPayment.get();
            return PaymentMapper.mapToPaymentResponse(payment);
        } else {
            return null;
        }
    }
    }