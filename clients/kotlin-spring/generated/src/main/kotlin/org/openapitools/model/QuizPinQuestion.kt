package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.QuizPinOption
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
 * A specific quiz inquiry.
 * @param questionId 
 * @param questionText 
 * @param options 
 */
data class QuizPinQuestion(

    @Schema(example = "null", description = "")
    @get:JsonProperty("question_id") val questionId: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("question_text") val questionText: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("options") val options: kotlin.collections.List<QuizPinOption>? = null
    ) {

}

