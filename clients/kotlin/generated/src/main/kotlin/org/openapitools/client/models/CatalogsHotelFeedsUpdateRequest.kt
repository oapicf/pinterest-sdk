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

import org.openapitools.client.models.CatalogsFeedCredentials
import org.openapitools.client.models.CatalogsFeedProcessingSchedule
import org.openapitools.client.models.CatalogsFormat
import org.openapitools.client.models.CatalogsStatus
import org.openapitools.client.models.CatalogsType
import org.openapitools.client.models.NullableCurrency

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request object for updating a feed.
 *
 * @param catalogType 
 * @param defaultCurrency 
 * @param name A human-friendly name associated to a given feed.
 * @param format 
 * @param credentials 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param preferredProcessingSchedule 
 * @param status 
 */


data class CatalogsHotelFeedsUpdateRequest (

    @Json(name = "catalog_type")
    val catalogType: CatalogsType,

    @Json(name = "default_currency")
    val defaultCurrency: NullableCurrency? = null,

    /* A human-friendly name associated to a given feed. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "format")
    val format: CatalogsFormat? = null,

    @Json(name = "credentials")
    val credentials: CatalogsFeedCredentials? = null,

    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    @Json(name = "location")
    val location: kotlin.String? = null,

    @Json(name = "preferred_processing_schedule")
    val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null,

    @Json(name = "status")
    val status: CatalogsStatus? = null

)
