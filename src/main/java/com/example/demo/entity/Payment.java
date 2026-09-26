package com.example.demo.entity;

import com.example.demo.model.PaymentMethod;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class Payment {

    private String id;
    private String userName;
    private String email;
    private BigDecimal amount;
    private PaymentMethod paymentMethod;

    public Payment(String userName, String email, BigDecimal amount, PaymentMethod paymentMethod) {
        this.id = UUID.randomUUID().toString();
        this.userName = userName;
        this.email = email;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public Payment(){
        this.id = UUID.randomUUID().toString();
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id) && Objects.equals(userName, payment.userName) && Objects.equals(email, payment.email) && Objects.equals(amount, payment.amount) && paymentMethod == payment.paymentMethod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, email, amount, paymentMethod);
    }
}
