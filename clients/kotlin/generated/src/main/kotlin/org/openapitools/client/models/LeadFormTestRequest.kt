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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request to create test data for lead data test API.
 *
 * @param answers Test lead answers. Should follow the creation order.
 */


data class LeadFormTestRequest (

    /* Test lead answers. Should follow the creation order. */
    @Json(name = "answers")
    val answers: kotlin.collections.List<kotlin.String>

) {


}

