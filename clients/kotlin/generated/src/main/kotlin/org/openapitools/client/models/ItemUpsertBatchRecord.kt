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

import org.openapitools.client.models.ItemAttributesRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Object describing an item batch record to upsert items
 *
 * @param itemId The catalog item id in the merchant namespace
 * @param attributes 
 */


data class ItemUpsertBatchRecord (

    /* The catalog item id in the merchant namespace */
    @Json(name = "item_id")
    val itemId: kotlin.String? = null,

    @Json(name = "attributes")
    val attributes: ItemAttributesRequest? = null

) {


}

