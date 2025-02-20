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

import org.openapitools.client.models.BatchOperation
import org.openapitools.client.models.CatalogsItemsBatchRequest
import org.openapitools.client.models.CatalogsItemsRequestLanguage
import org.openapitools.client.models.CatalogsVerticalBatchRequest
import org.openapitools.client.models.Country
import org.openapitools.client.models.ItemDeleteBatchRecord

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param catalogType 
 * @param country 
 * @param language 
 * @param items Array with catalogs items
 * @param operation 
 * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 */


data class ItemsBatchPostRequest (

    @Json(name = "catalog_type")
    override val catalogType: ItemsBatchPostRequest.CatalogType,

    @Json(name = "country")
    val country: Country,

    @Json(name = "language")
    val language: CatalogsItemsRequestLanguage,

    /* Array with catalogs items */
    @Json(name = "items")
    val items: kotlin.collections.List<ItemDeleteBatchRecord>,

    @Json(name = "operation")
    val operation: BatchOperation,

    /* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    @Json(name = "catalog_id")
    override val catalogId: kotlin.String? = null

) {


}

