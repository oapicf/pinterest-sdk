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
* The enhanced match status of the tag
* Values: UNKNOWN,NOT_VALIDATED,VALIDATING_IN_PROGRESS,VALIDATION_COMPLETE
*/
enum class EnhancedMatchStatusType(@get:JsonValue val value: kotlin.String) {

    UNKNOWN("UNKNOWN"),
    NOT_VALIDATED("NOT_VALIDATED"),
    VALIDATING_IN_PROGRESS("VALIDATING_IN_PROGRESS"),
    VALIDATION_COMPLETE("VALIDATION_COMPLETE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): EnhancedMatchStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

