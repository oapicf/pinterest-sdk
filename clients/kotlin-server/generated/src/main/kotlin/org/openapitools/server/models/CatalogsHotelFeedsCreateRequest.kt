/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.CatalogsFeedCredentials
import org.openapitools.server.models.CatalogsFeedProcessingSchedule
import org.openapitools.server.models.CatalogsFeedsCreateRequestDefaultLocale
import org.openapitools.server.models.CatalogsFormat
import org.openapitools.server.models.CatalogsStatus
import org.openapitools.server.models.CatalogsType
import org.openapitools.server.models.NullableCurrency

/**
 * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 * @param name A human-friendly name associated to a given feed.
 * @param format 
 * @param defaultLocale 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param catalogType 
 * @param defaultCurrency 
 * @param credentials 
 * @param preferredProcessingSchedule 
 * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
 * @param status 
 */
data class CatalogsHotelFeedsCreateRequest(
    /* A human-friendly name associated to a given feed. */
    val name: kotlin.String,
    val format: CatalogsFormat,
    val defaultLocale: CatalogsFeedsCreateRequestDefaultLocale,
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    val location: kotlin.String,
    val catalogType: CatalogsType,
    val defaultCurrency: NullableCurrency? = null,
    val credentials: CatalogsFeedCredentials? = null,
    val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null,
    /* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. */
    val catalogId: kotlin.String? = null,
    val status: CatalogsStatus? = null
) 

