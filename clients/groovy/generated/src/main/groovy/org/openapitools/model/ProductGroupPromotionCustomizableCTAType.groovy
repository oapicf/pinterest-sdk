package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ProductGroupPromotionCustomizableCTAType {

    GET_OFFER("GET_OFFER"),
    
    LEARN_MORE("LEARN_MORE"),
    
    ORDER_NOW("ORDER_NOW"),
    
    SHOP_NOW("SHOP_NOW"),
    
    SIGN_UP("SIGN_UP"),
    
    SUBSCRIBE("SUBSCRIBE"),
    
    BUY_NOW("BUY_NOW"),
    
    CONTACT_US("CONTACT_US"),
    
    GET_QUOTE("GET_QUOTE"),
    
    VISIT_SITE("VISIT_SITE"),
    
    APPLY_NOW("APPLY_NOW"),
    
    BOOK_NOW("BOOK_NOW"),
    
    REGISTER_NOW("REGISTER_NOW"),
    
    FIND_A_DEALER("FIND_A_DEALER"),
    
    WATCH_NOW("WATCH_NOW"),
    
    READ_MORE("READ_MORE"),
    
    BUY_TICKETS("BUY_TICKETS"),
    
    DONATE_NOW("DONATE_NOW"),
    
    DOWNLOAD("DOWNLOAD"),
    
    EXPLORE_MORE("EXPLORE_MORE"),
    
    FIND_A_LOCATION("FIND_A_LOCATION"),
    
    GET_DEAL("GET_DEAL"),
    
    GET_RECIPE("GET_RECIPE"),
    
    GET_SHOWTIMES("GET_SHOWTIMES"),
    
    ON_SALE("ON_SALE"),
    
    PLAY_GAME("PLAY_GAME"),
    
    TRY_IT("TRY_IT"),
    
    BUY_ONLINE_PICKUP_IN_STORE("BUY_ONLINE_PICKUP_IN_STORE"),
    
    SHOP_ON_ADVERTISER("SHOP_ON_ADVERTISER"),
    
    SHOP_THE_COLLECTION("SHOP_THE_COLLECTION"),
    
    GET_IT_NOW("GET_IT_NOW"),
    
    TAKE_A_PEEK("TAKE_A_PEEK"),
    
    TAKE_A_CLOSER_LOOK("TAKE_A_CLOSER_LOOK")

    private final String value

    ProductGroupPromotionCustomizableCTAType(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
