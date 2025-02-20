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
 * 
 *
 * @param bidFloors A list of bid floors in micro currency. For example, [100000, 200000]
 * @param type Always the string 'bidfloor'
 */


data class BidFloor (

    /* A list of bid floors in micro currency. For example, [100000, 200000] */
    @Json(name = "bid_floors")
    val bidFloors: kotlin.collections.List<kotlin.Int>? = null,

    /* Always the string 'bidfloor' */
    @Json(name = "type")
    val type: kotlin.String? = "bidfloor"

) {


}

