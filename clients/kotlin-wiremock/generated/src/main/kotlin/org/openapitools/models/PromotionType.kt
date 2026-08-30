@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PromotionType {
    @JsonProperty(value = "VARIABLE") VARIABLE,
    @JsonProperty(value = "SITEWIDE") SITEWIDE,
    @JsonProperty(value = "CHECKOUT") CHECKOUT,
    @JsonProperty(value = "SAVE_X_ON_Y") SAVE_X_ON_Y,
    @JsonProperty(value = "BUY_X_GET_Y") BUY_X_GET_Y,
    @JsonProperty(value = "SPEND_X_SAVE_Y") SPEND_X_SAVE_Y,
    @JsonProperty(value = "FREE_SHIPPING") FREE_SHIPPING,
    @JsonProperty(value = "FREE_SHIPPING_MINIMUM") FREE_SHIPPING_MINIMUM,
    @JsonProperty(value = "FREE_SHIPPING_WITH_DISCOUNT") FREE_SHIPPING_WITH_DISCOUNT,
    @JsonProperty(value = "SITEWIDE_IN_STORES") SITEWIDE_IN_STORES,
    @JsonProperty(value = "EXTRA_PERCENT_OFF") EXTRA_PERCENT_OFF,
    @JsonProperty(value = "GIFT_WITH_PURCHASE") GIFT_WITH_PURCHASE,
    @JsonProperty(value = "GIFT_WITH_PURCHASE_MINIMUM") GIFT_WITH_PURCHASE_MINIMUM,
    @JsonProperty(value = "FIXED") FIXED,
    @JsonProperty(value = "PERCENT_OFF_CLEARANCE") PERCENT_OFF_CLEARANCE,
    @JsonProperty(value = "X_OFF_Y") X_OFF_Y,
    @JsonProperty(value = "GIFT_WITH_FIRST_PURCHASE") GIFT_WITH_FIRST_PURCHASE,
    @JsonProperty(value = "BUY_X_GET_ONE_FREE") BUY_X_GET_ONE_FREE,
    @JsonProperty(value = "CASH_BACK") CASH_BACK,
    @JsonProperty(value = "POINTS_ON_ALL_PURCHASES") POINTS_ON_ALL_PURCHASES,
    @JsonProperty(value = "BONUS") BONUS,
    @JsonProperty(value = "POINTS_WITH_PURCHASE") POINTS_WITH_PURCHASE,
    @JsonProperty(value = "CUSTOM") CUSTOM,
}
