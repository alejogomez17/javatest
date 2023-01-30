package com.platzi.javatests.payments;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount) {
        PaymentRespone respone = paymentGateway.requestPayment(new PaymentRequest(amount));
        if (respone.getStatus() == PaymentRespone.PaymentStatus.OK) {
            return true;
        } else {
            return false;
        }
    }
}
