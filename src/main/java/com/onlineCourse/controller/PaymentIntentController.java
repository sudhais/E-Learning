package com.onlineCourse.controller;

import com.onlineCourse.entities.Request;
import com.onlineCourse.entities.Response;
import com.onlineCourse.service.interfaces.PaymentIntentService;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentIntentController {

    @Autowired
    private PaymentIntentService paymentIntentService;
    @PostMapping("/create-payment-intent")
    public Response createPaymentIntent(@RequestBody Request request)
            throws StripeException {
        return this.paymentIntentService.createPaymentIntent(request);
    }
}
