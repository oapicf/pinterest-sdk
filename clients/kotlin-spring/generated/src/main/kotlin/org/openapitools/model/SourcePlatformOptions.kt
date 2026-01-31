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
* List of source platforms for a conversion event.
* Values: WEB,MOBILE,MOBILE_ANDROID,MOBILE_IOS,OFFLINE,PINTEREST_WEB,PINTEREST_ANDROID,PINTEREST_IOS,POINT_OF_SALE
*/
enum class SourcePlatformOptions(@get:JsonValue val value: kotlin.String) {

    WEB("WEB"),
    MOBILE("MOBILE"),
    MOBILE_ANDROID("MOBILE_ANDROID"),
    MOBILE_IOS("MOBILE_IOS"),
    OFFLINE("OFFLINE"),
    PINTEREST_WEB("PINTEREST_WEB"),
    PINTEREST_ANDROID("PINTEREST_ANDROID"),
    PINTEREST_IOS("PINTEREST_IOS"),
    POINT_OF_SALE("POINT_OF_SALE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): SourcePlatformOptions {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'SourcePlatformOptions'")
        }
    }
}

