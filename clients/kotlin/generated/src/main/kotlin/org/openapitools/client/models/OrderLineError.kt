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

import org.openapitools.client.models.OrderLine

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param `data` 
 * @param errorMessages 
 */


data class OrderLineError (

    @Json(name = "data")
    val `data`: OrderLine? = null,

    @Json(name = "error_messages")
    val errorMessages: kotlin.collections.List<kotlin.String>? = null

) {


}

