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

import org.openapitools.client.models.BulkUpsertStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * ID of the bulk request.
 *
 * @param status 
 * @param resultUrl 
 */


data class BulkUpsertStatusResponse (

    @Json(name = "status")
    val status: BulkUpsertStatus? = null,

    @Json(name = "result_url")
    val resultUrl: kotlin.String? = null

) {


}

