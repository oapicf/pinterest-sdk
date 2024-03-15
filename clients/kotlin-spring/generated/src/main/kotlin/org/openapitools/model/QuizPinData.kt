package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 */
data class QuizPinData(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("questions") val questions: kotlin.collections.List<QuizPinQuestion>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("results") val results: kotlin.collections.List<QuizPinResult>? = null
) {

}

