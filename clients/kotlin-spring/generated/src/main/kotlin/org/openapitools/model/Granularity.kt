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
* Granularity
* Values: TOTAL,DAY,HOUR,WEEK,MONTH
*/
enum class Granularity(val value: kotlin.String) {

    @JsonProperty("TOTAL") TOTAL("TOTAL"),
    @JsonProperty("DAY") DAY("DAY"),
    @JsonProperty("HOUR") HOUR("HOUR"),
    @JsonProperty("WEEK") WEEK("WEEK"),
    @JsonProperty("MONTH") MONTH("MONTH")
}

