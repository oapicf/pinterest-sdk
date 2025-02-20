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
package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsFeedCredentials
import org.openapitools.server.api.model.CatalogsFeedProcessingSchedule
import org.openapitools.server.api.model.CatalogsFeedsCreateRequestDefaultLocale
import org.openapitools.server.api.model.CatalogsFormat
import org.openapitools.server.api.model.CatalogsStatus
import org.openapitools.server.api.model.CatalogsType
import org.openapitools.server.api.model.NullableCurrency

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CatalogsHotelFeedsCreateRequest (
    /* A human-friendly name associated to a given feed. */
    @SerializedName("name") private val _name: kotlin.String?,
    @SerializedName("format") private val _format: CatalogsFormat?,
    @SerializedName("defaultLocale") private val _defaultLocale: CatalogsFeedsCreateRequestDefaultLocale?,
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    @SerializedName("location") private val _location: kotlin.String?,
    @SerializedName("catalogType") private val _catalogType: CatalogsType?,
    val defaultCurrency: NullableCurrency? = null,
    val credentials: CatalogsFeedCredentials? = null,
    val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null,
    /* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. */
    val catalogId: kotlin.String? = null,
    val status: CatalogsStatus? = null
) {

        val name get() = _name ?: throw IllegalArgumentException("name is required")
                    
        val format get() = _format ?: throw IllegalArgumentException("format is required")
                    
        val defaultLocale get() = _defaultLocale ?: throw IllegalArgumentException("defaultLocale is required")
                    
        val location get() = _location ?: throw IllegalArgumentException("location is required")
                    
        val catalogType get() = _catalogType ?: throw IllegalArgumentException("catalogType is required")
                    
}

