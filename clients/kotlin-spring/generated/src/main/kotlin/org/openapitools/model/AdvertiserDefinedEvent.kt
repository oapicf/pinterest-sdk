package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * 
 * @param name raw string name of the event, usually logged as raw_event_name in our dataset
 * @param mappedConversionType standard type mapped to ADE for optimization
 */
data class AdvertiserDefinedEvent(

    @Schema(example = "download_picture", description = "raw string name of the event, usually logged as raw_event_name in our dataset")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "standard type mapped to ADE for optimization")
    @get:JsonProperty("mapped_conversion_type") val mappedConversionType: AdvertiserDefinedEvent.MappedConversionType? = null
) {

    /**
    * standard type mapped to ADE for optimization
    * Values: PAGE_LOAD,UNKNOWN,INITIALIZED,PAGE_VISIT,SIGNUP,CHECKOUT,CUSTOM,VIEW_CATEGORY,SEARCH,ADD_TO_CART,WATCH_VIDEO,LEAD,APP_INSTALL,WEB_SESSION,EXTERNAL_MEASUREMENT,ADD_PAYMENT_INFO,ADD_TO_WISHLIST,INITIATE_CHECKOUT,SUBSCRIBE,VIEW_CONTENT,ADVERTISER_DEFINED_EVENT,APP_OPEN,CONTACT,SCHEDULE,FIND_LOCATION,CUSTOMIZE_PRODUCT,SUBMIT_APPLICATION,START_TRIAL
    */
    enum class MappedConversionType(@get:JsonValue val value: kotlin.String) {

        PAGE_LOAD("PAGE_LOAD"),
        UNKNOWN("UNKNOWN"),
        INITIALIZED("INITIALIZED"),
        PAGE_VISIT("PAGE_VISIT"),
        SIGNUP("SIGNUP"),
        CHECKOUT("CHECKOUT"),
        CUSTOM("CUSTOM"),
        VIEW_CATEGORY("VIEW_CATEGORY"),
        SEARCH("SEARCH"),
        ADD_TO_CART("ADD_TO_CART"),
        WATCH_VIDEO("WATCH_VIDEO"),
        LEAD("LEAD"),
        APP_INSTALL("APP_INSTALL"),
        WEB_SESSION("WEB_SESSION"),
        EXTERNAL_MEASUREMENT("EXTERNAL_MEASUREMENT"),
        ADD_PAYMENT_INFO("ADD_PAYMENT_INFO"),
        ADD_TO_WISHLIST("ADD_TO_WISHLIST"),
        INITIATE_CHECKOUT("INITIATE_CHECKOUT"),
        SUBSCRIBE("SUBSCRIBE"),
        VIEW_CONTENT("VIEW_CONTENT"),
        ADVERTISER_DEFINED_EVENT("ADVERTISER_DEFINED_EVENT"),
        APP_OPEN("APP_OPEN"),
        CONTACT("CONTACT"),
        SCHEDULE("SCHEDULE"),
        FIND_LOCATION("FIND_LOCATION"),
        CUSTOMIZE_PRODUCT("CUSTOMIZE_PRODUCT"),
        SUBMIT_APPLICATION("SUBMIT_APPLICATION"),
        START_TRIAL("START_TRIAL");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): MappedConversionType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AdvertiserDefinedEvent'")
            }
        }
    }

}

