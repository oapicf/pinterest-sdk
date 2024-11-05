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
* Ad targeting types for MMM report
* Values: APPTYPE,COUNTRY,CREATIVE_TYPE,GENDER,LOCATION
*/
enum class MMMReportingTargetingType(@get:JsonValue val value: kotlin.String) {

    APPTYPE("APPTYPE"),
    COUNTRY("COUNTRY"),
    CREATIVE_TYPE("CREATIVE_TYPE"),
    GENDER("GENDER"),
    LOCATION("LOCATION");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): MMMReportingTargetingType {
                return values().first{it -> it.value == value}
        }
    }
}

