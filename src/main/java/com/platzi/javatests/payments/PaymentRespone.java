package com.platzi.javatests.payments;

public class PaymentRespone {

    enum PaymentStatus {
        OK, ERROR
    }

    private PaymentStatus status;

    public PaymentRespone(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
