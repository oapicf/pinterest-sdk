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
* The enhanced match status of the tag
* Values: UNKNOWN,NOT_VALIDATED,VALIDATING_IN_PROGRESS,VALIDATION_COMPLETE,`null`
*/
enum class EnhancedMatchStatusType(val value: kotlin.String) {

    @JsonProperty("UNKNOWN") UNKNOWN("UNKNOWN"),
    @JsonProperty("NOT_VALIDATED") NOT_VALIDATED("NOT_VALIDATED"),
    @JsonProperty("VALIDATING_IN_PROGRESS") VALIDATING_IN_PROGRESS("VALIDATING_IN_PROGRESS"),
    @JsonProperty("VALIDATION_COMPLETE") VALIDATION_COMPLETE("VALIDATION_COMPLETE"),
    @JsonProperty("null") `null`("null")
}

