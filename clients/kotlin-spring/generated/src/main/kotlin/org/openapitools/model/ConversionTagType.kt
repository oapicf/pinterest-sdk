package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
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
* conversion tag type
* Values: PAGE_LOAD,UNKNOWN,INITIALIZED,PAGE_VISIT,SIGNUP,CHECKOUT,CUSTOM,VIEW_CATEGORY,SEARCH,ADD_TO_CART,WATCH_VIDEO,LEAD,APP_INSTALL,WEB_SESSION,EXTERNAL_MEASUREMENT
*/
enum class ConversionTagType(val value: kotlin.String) {

    @JsonProperty("PAGE_LOAD") PAGE_LOAD("PAGE_LOAD"),
    @JsonProperty("UNKNOWN") UNKNOWN("UNKNOWN"),
    @JsonProperty("INITIALIZED") INITIALIZED("INITIALIZED"),
    @JsonProperty("PAGE_VISIT") PAGE_VISIT("PAGE_VISIT"),
    @JsonProperty("SIGNUP") SIGNUP("SIGNUP"),
    @JsonProperty("CHECKOUT") CHECKOUT("CHECKOUT"),
    @JsonProperty("CUSTOM") CUSTOM("CUSTOM"),
    @JsonProperty("VIEW_CATEGORY") VIEW_CATEGORY("VIEW_CATEGORY"),
    @JsonProperty("SEARCH") SEARCH("SEARCH"),
    @JsonProperty("ADD_TO_CART") ADD_TO_CART("ADD_TO_CART"),
    @JsonProperty("WATCH_VIDEO") WATCH_VIDEO("WATCH_VIDEO"),
    @JsonProperty("LEAD") LEAD("LEAD"),
    @JsonProperty("APP_INSTALL") APP_INSTALL("APP_INSTALL"),
    @JsonProperty("WEB_SESSION") WEB_SESSION("WEB_SESSION"),
    @JsonProperty("EXTERNAL_MEASUREMENT") EXTERNAL_MEASUREMENT("EXTERNAL_MEASUREMENT")
}

