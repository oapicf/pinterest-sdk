/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
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
import org.openapitools.server.api.model.Country
import org.openapitools.server.api.model.NullableCurrency
import org.openapitools.server.api.model.ProductAvailabilityType

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 * @param name A human-friendly name associated to a given feed.
 * @param format 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param defaultCurrency 
 * @param defaultLocale 
 * @param credentials 
 * @param preferredProcessingSchedule 
 * @param defaultCountry 
 * @param defaultAvailability 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CatalogsFeedsCreateRequest (
    /* A human-friendly name associated to a given feed. */
    @SerializedName("name") private val _name: kotlin.String?,
    @SerializedName("format") private val _format: CatalogsFormat?,
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    @SerializedName("location") private val _location: kotlin.String?,
    val defaultCurrency: NullableCurrency? = null,
    val defaultLocale: CatalogsFeedsCreateRequestDefaultLocale? = null,
    val credentials: CatalogsFeedCredentials? = null,
    val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null,
    val defaultCountry: Country? = null,
    val defaultAvailability: ProductAvailabilityType? = null
) {

        val name get() = _name ?: throw IllegalArgumentException("name is required")
                    
        val format get() = _format ?: throw IllegalArgumentException("format is required")
                    
        val location get() = _location ?: throw IllegalArgumentException("location is required")
                    
}
