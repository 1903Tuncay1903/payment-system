package com.example.demo.mapper;

import com.example.demo.entity.Payment;
import com.example.demo.model.PaymentRequest;
import com.example.demo.model.PaymentResponse;

public class PaymentMapper {

    public static PaymentResponse mapToPaymentResponse(Payment payment){
        var paymentResponse = new PaymentResponse();
        paymentResponse.setPaymentMethod(payment.getPaymentMethod());
        paymentResponse.setAmount(payment.getAmount());
        paymentResponse.setEmail(payment.getEmail());
        paymentResponse.setUserName(payment.getUserName());
        paymentResponse.setId(payment.getId());
        return paymentResponse;
    }

    public static Payment mapToPayment(PaymentRequest request){
        var payment = new Payment();
        payment.setPaymentMethod(request.getPaymentMethod());
        payment.setAmount(request.getAmount());
        payment.setEmail(request.getEmail());
        payment.setUserName(request.getUserName());
        return payment;
    }
}
