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
* Attribution type. Refers to the Pinterest Tag endpoints
* Values: INDIVIDUAL,HOUSEHOLD
*/
enum class ConversionReportAttributionType(@get:JsonValue val value: kotlin.String) {

    INDIVIDUAL("INDIVIDUAL"),
    HOUSEHOLD("HOUSEHOLD");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ConversionReportAttributionType {
                return values().first{it -> it.value == value}
        }
    }
}

