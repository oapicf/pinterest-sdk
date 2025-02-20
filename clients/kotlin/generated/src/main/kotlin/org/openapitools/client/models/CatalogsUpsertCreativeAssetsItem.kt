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

import org.openapitools.client.models.CatalogsCreativeAssetsAttributes

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A creative assets item to be upserted.
 *
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace
 * @param operation 
 * @param attributes 
 */


data class CatalogsUpsertCreativeAssetsItem (

    /* The catalog creative assets id in the merchant namespace */
    @Json(name = "creative_assets_id")
    val creativeAssetsId: kotlin.String,

    @Json(name = "operation")
    val operation: CatalogsUpsertCreativeAssetsItem.Operation,

    @Json(name = "attributes")
    val attributes: CatalogsCreativeAssetsAttributes

) {

    /**
     * 
     *
     * Values: UPSERT
     */
    @JsonClass(generateAdapter = false)
    enum class Operation(val value: kotlin.String) {
        @Json(name = "UPSERT") UPSERT("UPSERT");
    }

}

