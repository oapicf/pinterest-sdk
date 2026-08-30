package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * @param customQuestionFieldType 
 * @param customQuestionLabel Question label for a custom question.
 * @param customQuestionOptions Question options for a custom question.
 * @param questionType 
 */
data class LeadFormQuestion(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("custom_question_field_type")
    @get:JsonProperty("custom_question_field_type") val customQuestionFieldType: LeadFormQuestionFieldType? = null,

    @Schema(description = "Question label for a custom question.")
    @param:JsonProperty("custom_question_label")
    @get:JsonProperty("custom_question_label") val customQuestionLabel: kotlin.String? = null,

    @get:Size(min=0,max=5) 
    @Schema(description = "Question options for a custom question.")
    @param:JsonProperty("custom_question_options")
    @get:JsonProperty("custom_question_options") val customQuestionOptions: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("question_type")
    @get:JsonProperty("question_type") val questionType: LeadFormQuestionType? = null
) {

}

