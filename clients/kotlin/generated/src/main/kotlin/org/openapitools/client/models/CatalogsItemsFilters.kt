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

import org.openapitools.client.models.CatalogsCreativeAssetsItemsFilter
import org.openapitools.client.models.CatalogsHotelItemsFilter
import org.openapitools.client.models.CatalogsRetailItemsFilter
import org.openapitools.client.models.CatalogsType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param catalogType 
 * @param itemIds 
 * @param hotelIds 
 * @param creativeAssetsIds 
 * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 */


interface CatalogsItemsFilters {

    @Json(name = "catalog_type")
    val catalogType: CatalogsType
    @Json(name = "item_ids")
    val itemIds: kotlin.collections.List<kotlin.String>
    @Json(name = "hotel_ids")
    val hotelIds: kotlin.collections.List<kotlin.String>
    @Json(name = "creative_assets_ids")
    val creativeAssetsIds: kotlin.collections.List<kotlin.String>
    /* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    @Json(name = "catalog_id")
    val catalogId: kotlin.String?

}

