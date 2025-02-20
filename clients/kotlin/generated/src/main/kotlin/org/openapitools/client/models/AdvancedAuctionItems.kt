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

import org.openapitools.client.models.AdvancedAuctionItem

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response object containing item bid options
 *
 * @param catalogId Response object of item bid options
 * @param items Array with item bid options
 */


data class AdvancedAuctionItems (

    /* Response object of item bid options */
    @Json(name = "catalog_id")
    val catalogId: kotlin.String? = null,

    /* Array with item bid options */
    @Json(name = "items")
    val items: kotlin.collections.List<AdvancedAuctionItem>? = null

) {


}

