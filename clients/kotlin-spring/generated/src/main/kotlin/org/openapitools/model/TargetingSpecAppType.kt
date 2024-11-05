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
* Values: android_mobile,android_tablet,ipad,iphone,web,web_mobile
*/
enum class TargetingSpecAppType(@get:JsonValue val value: kotlin.String) {

    android_mobile("android_mobile"),
    android_tablet("android_tablet"),
    ipad("ipad"),
    iphone("iphone"),
    web("web"),
    web_mobile("web_mobile");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): TargetingSpecAppType {
                return values().first{it -> it.value == value}
        }
    }
}

