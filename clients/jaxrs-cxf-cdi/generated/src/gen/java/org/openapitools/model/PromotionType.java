package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Determines the displayed promotion text along with what parameters (if any) are needed to complete the template. This list is not finalized, and will be updated as new types are supported.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PromotionType {

    @JsonProperty("VARIABLE") VARIABLE(String.valueOf("VARIABLE")), @JsonProperty("SITEWIDE") SITEWIDE(String.valueOf("SITEWIDE")), @JsonProperty("CHECKOUT") CHECKOUT(String.valueOf("CHECKOUT")), @JsonProperty("SAVE_X_ON_Y") SAVE_X_ON_Y(String.valueOf("SAVE_X_ON_Y")), @JsonProperty("BUY_X_GET_Y") BUY_X_GET_Y(String.valueOf("BUY_X_GET_Y")), @JsonProperty("SPEND_X_SAVE_Y") SPEND_X_SAVE_Y(String.valueOf("SPEND_X_SAVE_Y")), @JsonProperty("FREE_SHIPPING") FREE_SHIPPING(String.valueOf("FREE_SHIPPING")), @JsonProperty("FREE_SHIPPING_MINIMUM") FREE_SHIPPING_MINIMUM(String.valueOf("FREE_SHIPPING_MINIMUM")), @JsonProperty("FREE_SHIPPING_WITH_DISCOUNT") FREE_SHIPPING_WITH_DISCOUNT(String.valueOf("FREE_SHIPPING_WITH_DISCOUNT")), @JsonProperty("SITEWIDE_IN_STORES") SITEWIDE_IN_STORES(String.valueOf("SITEWIDE_IN_STORES")), @JsonProperty("EXTRA_PERCENT_OFF") EXTRA_PERCENT_OFF(String.valueOf("EXTRA_PERCENT_OFF")), @JsonProperty("GIFT_WITH_PURCHASE") GIFT_WITH_PURCHASE(String.valueOf("GIFT_WITH_PURCHASE")), @JsonProperty("GIFT_WITH_PURCHASE_MINIMUM") GIFT_WITH_PURCHASE_MINIMUM(String.valueOf("GIFT_WITH_PURCHASE_MINIMUM")), @JsonProperty("FIXED") FIXED(String.valueOf("FIXED")), @JsonProperty("PERCENT_OFF_CLEARANCE") PERCENT_OFF_CLEARANCE(String.valueOf("PERCENT_OFF_CLEARANCE")), @JsonProperty("X_OFF_Y") X_OFF_Y(String.valueOf("X_OFF_Y")), @JsonProperty("GIFT_WITH_FIRST_PURCHASE") GIFT_WITH_FIRST_PURCHASE(String.valueOf("GIFT_WITH_FIRST_PURCHASE")), @JsonProperty("BUY_X_GET_ONE_FREE") BUY_X_GET_ONE_FREE(String.valueOf("BUY_X_GET_ONE_FREE")), @JsonProperty("CASH_BACK") CASH_BACK(String.valueOf("CASH_BACK")), @JsonProperty("POINTS_ON_ALL_PURCHASES") POINTS_ON_ALL_PURCHASES(String.valueOf("POINTS_ON_ALL_PURCHASES")), @JsonProperty("BONUS") BONUS(String.valueOf("BONUS")), @JsonProperty("POINTS_WITH_PURCHASE") POINTS_WITH_PURCHASE(String.valueOf("POINTS_WITH_PURCHASE")), @JsonProperty("CUSTOM") CUSTOM(String.valueOf("CUSTOM"));


    private String value;

    PromotionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PromotionType fromValue(String value) {
        for (PromotionType b : PromotionType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



