package com.example.demo.model;

import java.math.BigDecimal;

public class PaymentResponse {

    private String id;
    private String userName;
    private String email;
    private BigDecimal amount;
    private PaymentMethod paymentMethod;

    public PaymentResponse(String id, String userName, String email, BigDecimal amount, PaymentMethod paymentMethod) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public PaymentResponse() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
