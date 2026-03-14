package com.notzed.airbnbapp.service;

import com.notzed.airbnbapp.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);
}
