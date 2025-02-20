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
 * Hotel product metadata entity
 *
 * @param hotelId The user-created unique ID that represents the hotel item.
 */


data class CatalogsHotelProductMetadata (

    /* The user-created unique ID that represents the hotel item. */
    @Json(name = "hotel_id")
    val hotelId: kotlin.String

) {


}

