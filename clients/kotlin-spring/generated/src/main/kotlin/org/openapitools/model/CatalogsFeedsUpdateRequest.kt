package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsFeedCredentials
import org.openapitools.model.CatalogsFeedProcessingSchedule
import org.openapitools.model.CatalogsFormat
import org.openapitools.model.CatalogsStatus
import org.openapitools.model.NullableCurrency
import org.openapitools.model.ProductAvailabilityType
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Request object for updating a feed.
 * @param defaultAvailability 
 * @param defaultCurrency 
 * @param name A human-friendly name associated to a given feed.
 * @param format 
 * @param credentials 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param preferredProcessingSchedule 
 * @param status 
 */
data class CatalogsFeedsUpdateRequest(

    @field:Valid
    @field:JsonProperty("default_availability") val defaultAvailability: ProductAvailabilityType? = null,

    @field:Valid
    @field:JsonProperty("default_currency") val defaultCurrency: NullableCurrency? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("format") val format: CatalogsFormat? = null,

    @field:Valid
    @field:JsonProperty("credentials") val credentials: CatalogsFeedCredentials? = null,

    @field:JsonProperty("location") val location: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("preferred_processing_schedule") val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null,

    @field:Valid
    @field:JsonProperty("status") val status: CatalogsStatus? = null
) {

}

