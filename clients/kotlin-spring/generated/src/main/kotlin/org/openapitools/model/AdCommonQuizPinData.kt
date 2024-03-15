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
 * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 * @param questions 
 * @param results 
 */
data class AdCommonQuizPinData(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("questions") val questions: kotlin.collections.List<QuizPinQuestion>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("results") val results: kotlin.collections.List<QuizPinResult>? = null
) {

}

