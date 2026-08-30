package org.openapitools.server.api.model

import org.openapitools.server.api.model.LeadFormQuestionFieldType
import org.openapitools.server.api.model.LeadFormQuestionType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeadFormQuestion(
    val customQuestionFieldType: LeadFormQuestionFieldType? = null,
    /** Question label for a custom question. */
    val customQuestionLabel: kotlin.String? = null,
    /** Question options for a custom question. */
    val customQuestionOptions: kotlin.collections.List<kotlin.String>? = null,
    val questionType: LeadFormQuestionType? = null
)
