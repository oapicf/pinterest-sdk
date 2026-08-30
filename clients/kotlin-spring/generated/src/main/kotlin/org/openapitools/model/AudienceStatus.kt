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
* Audience processing status
* Values: INITIALIZING,READY,TOO_SMALL,ELIGIBLE,PERSONAS_INELIGIBLE_SIZE,PERSONAS_INITIALIZING
*/
enum class AudienceStatus(@get:JsonValue val value: kotlin.String) {

    INITIALIZING("INITIALIZING"),
    READY("READY"),
    TOO_SMALL("TOO_SMALL"),
    ELIGIBLE("ELIGIBLE"),
    PERSONAS_INELIGIBLE_SIZE("PERSONAS_INELIGIBLE_SIZE"),
    PERSONAS_INITIALIZING("PERSONAS_INITIALIZING");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AudienceStatus {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AudienceStatus'")
        }
    }
}

