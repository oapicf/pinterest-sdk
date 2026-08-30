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
* Optimization type for ad group delivery estimates. Supported types vary by objective.
* Values: CLICKTHROUGH,IMPRESSION,WEB_CONVERSION,ROAS,OUTBOUND_CLICK
*/
enum class OptimizationType(@get:JsonValue val value: kotlin.String) {

    CLICKTHROUGH("CLICKTHROUGH"),
    IMPRESSION("IMPRESSION"),
    WEB_CONVERSION("WEB_CONVERSION"),
    ROAS("ROAS"),
    OUTBOUND_CLICK("OUTBOUND_CLICK");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OptimizationType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OptimizationType'")
        }
    }
}

