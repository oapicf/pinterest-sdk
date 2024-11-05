package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.QuizPinQuestion
import org.openapitools.model.QuizPinResult
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
 * This field includes all quiz data including questions, options, and results.
 * @param questions 
 * @param results 
 * @param tieBreakerType Quiz ad tie breaker type, default is RANDOM
 * @param tieBreakerCustomResult 
 */
data class QuizPinData(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("questions") val questions: kotlin.collections.List<QuizPinQuestion>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("results") val results: kotlin.collections.List<QuizPinResult>? = null,

    @Schema(example = "null", description = "Quiz ad tie breaker type, default is RANDOM")
    @get:JsonProperty("tie_breaker_type") val tieBreakerType: QuizPinData.TieBreakerType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("tie_breaker_custom_result") val tieBreakerCustomResult: QuizPinResult? = null
    ) {

    /**
    * Quiz ad tie breaker type, default is RANDOM
    * Values: RANDOM,CUSTOM
    */
    enum class TieBreakerType(@get:JsonValue val value: kotlin.String) {

        RANDOM("RANDOM"),
        CUSTOM("CUSTOM");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): TieBreakerType {
                return values().first{it -> it.value == value}
            }
        }
    }

}

