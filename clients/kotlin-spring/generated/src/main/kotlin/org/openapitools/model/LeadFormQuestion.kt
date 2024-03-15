package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.LeadFormQuestionFieldType
import org.openapitools.model.LeadFormQuestionType
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
 * @param questionType 
 * @param customQuestionFieldType 
 * @param customQuestionLabel Question label for a custom question.
 * @param customQuestionOptions Question options for a custom question.
 */
data class LeadFormQuestion(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("question_type") val questionType: LeadFormQuestionType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("custom_question_field_type") val customQuestionFieldType: LeadFormQuestionFieldType? = null,

    @Schema(example = "null", description = "Question label for a custom question.")
    @get:JsonProperty("custom_question_label") val customQuestionLabel: kotlin.String? = null,

    @get:Size(min=0,max=5) 
    @Schema(example = "null", description = "Question options for a custom question.")
    @get:JsonProperty("custom_question_options") val customQuestionOptions: kotlin.collections.List<kotlin.String>? = null
) {

}

