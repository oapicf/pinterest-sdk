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
* 
* Values: PAGE_VISIT,SIGNUP,CHECKOUT,CUSTOM,VIEW_CATEGORY,SEARCH,ADD_TO_CART,WATCH_VIDEO,LEAD,APP_INSTALL
*/
enum class ConversionEvent(@get:JsonValue val value: kotlin.String) {

    PAGE_VISIT("PAGE_VISIT"),
    SIGNUP("SIGNUP"),
    CHECKOUT("CHECKOUT"),
    CUSTOM("CUSTOM"),
    VIEW_CATEGORY("VIEW_CATEGORY"),
    SEARCH("SEARCH"),
    ADD_TO_CART("ADD_TO_CART"),
    WATCH_VIDEO("WATCH_VIDEO"),
    LEAD("LEAD"),
    APP_INSTALL("APP_INSTALL");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ConversionEvent {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ConversionEvent'")
        }
    }
}

