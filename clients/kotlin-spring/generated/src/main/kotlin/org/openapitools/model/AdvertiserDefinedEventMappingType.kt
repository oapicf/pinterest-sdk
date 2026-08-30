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
* Pinterest standard event types that a custom event can be mapped to. Restricted to event types that are valid ads optimization goals.
* Values: SIGNUP,ADD_TO_CART,LEAD,CHECKOUT,SUBSCRIBE,ADD_TO_WISHLIST,ADD_PAYMENT_INFO,INITIATE_CHECKOUT,CONTACT,CUSTOMIZE_PRODUCT,FIND_LOCATION,SCHEDULE,SUBMIT_APPLICATION,START_TRIAL,PAGE_VISIT,VIEW_CATEGORY,VIEW_CONTENT,SEARCH,WATCH_VIDEO
*/
enum class AdvertiserDefinedEventMappingType(@get:JsonValue val value: kotlin.String) {

    SIGNUP("SIGNUP"),
    ADD_TO_CART("ADD_TO_CART"),
    LEAD("LEAD"),
    CHECKOUT("CHECKOUT"),
    SUBSCRIBE("SUBSCRIBE"),
    ADD_TO_WISHLIST("ADD_TO_WISHLIST"),
    ADD_PAYMENT_INFO("ADD_PAYMENT_INFO"),
    INITIATE_CHECKOUT("INITIATE_CHECKOUT"),
    CONTACT("CONTACT"),
    CUSTOMIZE_PRODUCT("CUSTOMIZE_PRODUCT"),
    FIND_LOCATION("FIND_LOCATION"),
    SCHEDULE("SCHEDULE"),
    SUBMIT_APPLICATION("SUBMIT_APPLICATION"),
    START_TRIAL("START_TRIAL"),
    PAGE_VISIT("PAGE_VISIT"),
    VIEW_CATEGORY("VIEW_CATEGORY"),
    VIEW_CONTENT("VIEW_CONTENT"),
    SEARCH("SEARCH"),
    WATCH_VIDEO("WATCH_VIDEO");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AdvertiserDefinedEventMappingType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AdvertiserDefinedEventMappingType'")
        }
    }
}

