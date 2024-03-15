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
* 
* Values: YOUR_TOTAL_AUDIENCE,YOUR_ENGAGED_AUDIENCE,PINTEREST_TOTAL_AUDIENCE
*/
enum class AudienceInsightType(val value: kotlin.String) {

    @JsonProperty("YOUR_TOTAL_AUDIENCE") YOUR_TOTAL_AUDIENCE("YOUR_TOTAL_AUDIENCE"),
    @JsonProperty("YOUR_ENGAGED_AUDIENCE") YOUR_ENGAGED_AUDIENCE("YOUR_ENGAGED_AUDIENCE"),
    @JsonProperty("PINTEREST_TOTAL_AUDIENCE") PINTEREST_TOTAL_AUDIENCE("PINTEREST_TOTAL_AUDIENCE")
}

