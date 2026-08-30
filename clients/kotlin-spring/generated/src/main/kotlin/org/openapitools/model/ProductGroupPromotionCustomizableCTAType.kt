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
* Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
* Values: GET_OFFER,LEARN_MORE,ORDER_NOW,SHOP_NOW,SIGN_UP,SUBSCRIBE,BUY_NOW,CONTACT_US,GET_QUOTE,VISIT_SITE,APPLY_NOW,BOOK_NOW,REGISTER_NOW,FIND_A_DEALER,WATCH_NOW,READ_MORE,BUY_TICKETS,DONATE_NOW,DOWNLOAD,EXPLORE_MORE,FIND_A_LOCATION,GET_DEAL,GET_RECIPE,GET_SHOWTIMES,ON_SALE,PLAY_GAME,TRY_IT,BUY_ONLINE_PICKUP_IN_STORE,SHOP_ON_ADVERTISER,SHOP_THE_COLLECTION,GET_IT_NOW,TAKE_A_PEEK,TAKE_A_CLOSER_LOOK
*/
enum class ProductGroupPromotionCustomizableCTAType(@get:JsonValue val value: kotlin.String) {

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
    TAKE_A_CLOSER_LOOK("TAKE_A_CLOSER_LOOK");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ProductGroupPromotionCustomizableCTAType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProductGroupPromotionCustomizableCTAType'")
        }
    }
}

