package com.onlineCourse.service.interfaces;

import com.onlineCourse.entities.Request;
import com.onlineCourse.entities.Response;
import com.stripe.exception.StripeException;

public interface PaymentIntentService {
    public Response createPaymentIntent(Request request) throws StripeException;
}
