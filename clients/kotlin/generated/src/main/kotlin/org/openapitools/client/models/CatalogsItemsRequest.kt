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

import org.openapitools.client.models.CatalogsItemsPostFilters
import org.openapitools.client.models.CatalogsItemsRequestLanguage
import org.openapitools.client.models.Country

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request object of catalogs items
 *
 * @param country 
 * @param language 
 * @param filters 
 */


data class CatalogsItemsRequest (

    @Json(name = "country")
    val country: Country,

    @Json(name = "language")
    val language: CatalogsItemsRequestLanguage,

    @Json(name = "filters")
    val filters: CatalogsItemsPostFilters

) {


}

