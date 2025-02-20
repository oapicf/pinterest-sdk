/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.LeadFormQuestionFieldType
import org.openapitools.client.models.LeadFormQuestionType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param questionType 
 * @param customQuestionFieldType 
 * @param customQuestionLabel Question label for a custom question.
 * @param customQuestionOptions Question options for a custom question.
 */


data class LeadFormQuestion (

    @Json(name = "question_type")
    val questionType: LeadFormQuestionType? = null,

    @Json(name = "custom_question_field_type")
    val customQuestionFieldType: LeadFormQuestionFieldType? = null,

    /* Question label for a custom question. */
    @Json(name = "custom_question_label")
    val customQuestionLabel: kotlin.String? = null,

    /* Question options for a custom question. */
    @Json(name = "custom_question_options")
    val customQuestionOptions: kotlin.collections.List<kotlin.String>? = null

) {


}

