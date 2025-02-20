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

import org.openapitools.client.models.CatalogsProductGroupFiltersRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request object for creating a product group.
 *
 * @param name 
 * @param filters 
 * @param feedId Catalog Feed id pertaining to the catalog product group.
 * @param description 
 * @param isFeatured boolean indicator of whether the product group is being featured or not
 */


data class CatalogsProductGroupCreateRequest (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "filters")
    val filters: CatalogsProductGroupFiltersRequest,

    /* Catalog Feed id pertaining to the catalog product group. */
    @Json(name = "feed_id")
    val feedId: kotlin.String,

    @Json(name = "description")
    val description: kotlin.String? = null,

    /* boolean indicator of whether the product group is being featured or not */
    @Json(name = "is_featured")
    @Deprecated(message = "This property is deprecated.")
    val isFeatured: kotlin.Boolean? = false

) {


}

