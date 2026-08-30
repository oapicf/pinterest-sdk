package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ProductGroupPromotionCustomizableCTAType {

    @JsonProperty("GET_OFFER") GET_OFFER(String.valueOf("GET_OFFER")), @JsonProperty("LEARN_MORE") LEARN_MORE(String.valueOf("LEARN_MORE")), @JsonProperty("ORDER_NOW") ORDER_NOW(String.valueOf("ORDER_NOW")), @JsonProperty("SHOP_NOW") SHOP_NOW(String.valueOf("SHOP_NOW")), @JsonProperty("SIGN_UP") SIGN_UP(String.valueOf("SIGN_UP")), @JsonProperty("SUBSCRIBE") SUBSCRIBE(String.valueOf("SUBSCRIBE")), @JsonProperty("BUY_NOW") BUY_NOW(String.valueOf("BUY_NOW")), @JsonProperty("CONTACT_US") CONTACT_US(String.valueOf("CONTACT_US")), @JsonProperty("GET_QUOTE") GET_QUOTE(String.valueOf("GET_QUOTE")), @JsonProperty("VISIT_SITE") VISIT_SITE(String.valueOf("VISIT_SITE")), @JsonProperty("APPLY_NOW") APPLY_NOW(String.valueOf("APPLY_NOW")), @JsonProperty("BOOK_NOW") BOOK_NOW(String.valueOf("BOOK_NOW")), @JsonProperty("REGISTER_NOW") REGISTER_NOW(String.valueOf("REGISTER_NOW")), @JsonProperty("FIND_A_DEALER") FIND_A_DEALER(String.valueOf("FIND_A_DEALER")), @JsonProperty("WATCH_NOW") WATCH_NOW(String.valueOf("WATCH_NOW")), @JsonProperty("READ_MORE") READ_MORE(String.valueOf("READ_MORE")), @JsonProperty("BUY_TICKETS") BUY_TICKETS(String.valueOf("BUY_TICKETS")), @JsonProperty("DONATE_NOW") DONATE_NOW(String.valueOf("DONATE_NOW")), @JsonProperty("DOWNLOAD") DOWNLOAD(String.valueOf("DOWNLOAD")), @JsonProperty("EXPLORE_MORE") EXPLORE_MORE(String.valueOf("EXPLORE_MORE")), @JsonProperty("FIND_A_LOCATION") FIND_A_LOCATION(String.valueOf("FIND_A_LOCATION")), @JsonProperty("GET_DEAL") GET_DEAL(String.valueOf("GET_DEAL")), @JsonProperty("GET_RECIPE") GET_RECIPE(String.valueOf("GET_RECIPE")), @JsonProperty("GET_SHOWTIMES") GET_SHOWTIMES(String.valueOf("GET_SHOWTIMES")), @JsonProperty("ON_SALE") ON_SALE(String.valueOf("ON_SALE")), @JsonProperty("PLAY_GAME") PLAY_GAME(String.valueOf("PLAY_GAME")), @JsonProperty("TRY_IT") TRY_IT(String.valueOf("TRY_IT")), @JsonProperty("BUY_ONLINE_PICKUP_IN_STORE") BUY_ONLINE_PICKUP_IN_STORE(String.valueOf("BUY_ONLINE_PICKUP_IN_STORE")), @JsonProperty("SHOP_ON_ADVERTISER") SHOP_ON_ADVERTISER(String.valueOf("SHOP_ON_ADVERTISER")), @JsonProperty("SHOP_THE_COLLECTION") SHOP_THE_COLLECTION(String.valueOf("SHOP_THE_COLLECTION")), @JsonProperty("GET_IT_NOW") GET_IT_NOW(String.valueOf("GET_IT_NOW")), @JsonProperty("TAKE_A_PEEK") TAKE_A_PEEK(String.valueOf("TAKE_A_PEEK")), @JsonProperty("TAKE_A_CLOSER_LOOK") TAKE_A_CLOSER_LOOK(String.valueOf("TAKE_A_CLOSER_LOOK"));


    private String value;

    ProductGroupPromotionCustomizableCTAType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ProductGroupPromotionCustomizableCTAType fromValue(String value) {
        for (ProductGroupPromotionCustomizableCTAType b : ProductGroupPromotionCustomizableCTAType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



