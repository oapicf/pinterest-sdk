package org.openapitools.model

import java.util.Objects
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
 * This field contains multiple options to a quiz question.
 * @param id 
 * @param text 
 */
data class QuizPinOption(

    @Schema(description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: java.math.BigDecimal? = null,

    @Schema(description = "")
    @param:JsonProperty("text")
    @get:JsonProperty("text") val text: kotlin.String? = null
) {

}

