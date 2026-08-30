package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* Determines the displayed promotion text along with what parameters (if any) are needed to complete the template.
* Values: VARIABLE,SITEWIDE,CHECKOUT,SAVE_X_ON_Y,BUY_X_GET_Y,SPEND_X_SAVE_Y,FREE_SHIPPING,FREE_SHIPPING_MINIMUM,FREE_SHIPPING_WITH_DISCOUNT,SITEWIDE_IN_STORES,EXTRA_PERCENT_OFF,GIFT_WITH_PURCHASE,GIFT_WITH_PURCHASE_MINIMUM,FIXED,PERCENT_OFF_CLEARANCE,X_OFF_Y,GIFT_WITH_FIRST_PURCHASE,BUY_X_GET_ONE_FREE,CASH_BACK,POINTS_ON_ALL_PURCHASES,BONUS,POINTS_WITH_PURCHASE,CUSTOM
*/
enum class PromotionType(@get:JsonValue val value: kotlin.String) {

    VARIABLE("VARIABLE"),
    SITEWIDE("SITEWIDE"),
    CHECKOUT("CHECKOUT"),
    SAVE_X_ON_Y("SAVE_X_ON_Y"),
    BUY_X_GET_Y("BUY_X_GET_Y"),
    SPEND_X_SAVE_Y("SPEND_X_SAVE_Y"),
    FREE_SHIPPING("FREE_SHIPPING"),
    FREE_SHIPPING_MINIMUM("FREE_SHIPPING_MINIMUM"),
    FREE_SHIPPING_WITH_DISCOUNT("FREE_SHIPPING_WITH_DISCOUNT"),
    SITEWIDE_IN_STORES("SITEWIDE_IN_STORES"),
    EXTRA_PERCENT_OFF("EXTRA_PERCENT_OFF"),
    GIFT_WITH_PURCHASE("GIFT_WITH_PURCHASE"),
    GIFT_WITH_PURCHASE_MINIMUM("GIFT_WITH_PURCHASE_MINIMUM"),
    FIXED("FIXED"),
    PERCENT_OFF_CLEARANCE("PERCENT_OFF_CLEARANCE"),
    X_OFF_Y("X_OFF_Y"),
    GIFT_WITH_FIRST_PURCHASE("GIFT_WITH_FIRST_PURCHASE"),
    BUY_X_GET_ONE_FREE("BUY_X_GET_ONE_FREE"),
    CASH_BACK("CASH_BACK"),
    POINTS_ON_ALL_PURCHASES("POINTS_ON_ALL_PURCHASES"),
    BONUS("BONUS"),
    POINTS_WITH_PURCHASE("POINTS_WITH_PURCHASE"),
    CUSTOM("CUSTOM");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): PromotionType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PromotionType'")
        }
    }
}

