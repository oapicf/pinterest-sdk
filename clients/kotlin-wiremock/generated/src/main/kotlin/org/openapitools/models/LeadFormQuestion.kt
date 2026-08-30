@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LeadFormQuestion(
    @field:JsonProperty("custom_question_field_type")
    val customQuestionFieldType: LeadFormQuestionFieldType? = null,

    @field:JsonProperty("custom_question_label")
    val customQuestionLabel: kotlin.String? = null,

    @field:JsonProperty("custom_question_options")
    val customQuestionOptions: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("question_type")
    val questionType: LeadFormQuestionType? = null,

)
