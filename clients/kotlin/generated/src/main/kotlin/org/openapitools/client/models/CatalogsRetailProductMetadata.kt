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

import org.openapitools.client.models.NonNullableCatalogsCurrency
import org.openapitools.client.models.NonNullableProductAvailabilityType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Retail product metadata entity
 *
 * @param itemId The user-created unique ID that represents the product.
 * @param itemGroupId The parent ID of the product.
 * @param availability 
 * @param price The price of the product.
 * @param salePrice The discounted price of the product.
 * @param currency 
 */


data class CatalogsRetailProductMetadata (

    /* The user-created unique ID that represents the product. */
    @Json(name = "item_id")
    val itemId: kotlin.String,

    /* The parent ID of the product. */
    @Json(name = "item_group_id")
    val itemGroupId: kotlin.String?,

    @Json(name = "availability")
    val availability: NonNullableProductAvailabilityType,

    /* The price of the product. */
    @Json(name = "price")
    val price: java.math.BigDecimal,

    /* The discounted price of the product. */
    @Json(name = "sale_price")
    val salePrice: java.math.BigDecimal?,

    @Json(name = "currency")
    val currency: NonNullableCatalogsCurrency

) {


}

