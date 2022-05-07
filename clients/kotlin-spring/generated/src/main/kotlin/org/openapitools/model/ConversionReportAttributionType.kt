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
* Attribution type. Refers to the Pinterest Tag endpoints
* Values: iNDIVIDUAL,hOUSEHOLD
*/
enum class ConversionReportAttributionType(val value: kotlin.String) {

    @JsonProperty("INDIVIDUAL") iNDIVIDUAL("INDIVIDUAL"),

    @JsonProperty("HOUSEHOLD") hOUSEHOLD("HOUSEHOLD");

}

