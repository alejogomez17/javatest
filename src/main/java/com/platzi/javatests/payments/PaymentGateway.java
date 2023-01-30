package com.platzi.javatests.payments;

public interface PaymentGateway {

    PaymentRespone requestPayment(PaymentRequest request);
}
