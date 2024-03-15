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
* Conversion report time type
* Values: AD_ACTION,CONVERSION
*/
enum class ConversionReportTimeType(val value: kotlin.String) {

    @JsonProperty("TIME_OF_AD_ACTION") AD_ACTION("TIME_OF_AD_ACTION"),
    @JsonProperty("TIME_OF_CONVERSION") CONVERSION("TIME_OF_CONVERSION")
}

