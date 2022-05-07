package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
* Conversion report time type
* Values: aDACTION,cONVERSION
*/
enum class ConversionReportTimeType(val value: kotlin.String) {

    @JsonProperty("TIME_OF_AD_ACTION") aDACTION("TIME_OF_AD_ACTION"),

    @JsonProperty("TIME_OF_CONVERSION") cONVERSION("TIME_OF_CONVERSION");

}

