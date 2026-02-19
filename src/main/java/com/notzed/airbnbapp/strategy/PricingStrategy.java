package com.notzed.airbnbapp.strategy;

import com.notzed.airbnbapp.entity.Inventory;

import java.math.BigDecimal;


public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);


}
