package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsFeedCredentials
import org.openapitools.model.CatalogsFeedProcessingSchedule
import org.openapitools.model.CatalogsFormat
import org.openapitools.model.CatalogsStatus
import org.openapitools.model.Country
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
 * 
 * @param defaultCountry 
 * @param defaultAvailability 
 * @param defaultCurrency 
 * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
 * @param format 
 * @param defaultLocale The locale used within a feed for product descriptions.
 * @param credentials 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param preferredProcessingSchedule 
 * @param status 
 */
data class FeedFields(

    @field:Valid
    @field:JsonProperty("default_country", required = true) val defaultCountry: Country,

    @field:Valid
    @field:JsonProperty("default_availability", required = true) val defaultAvailability: ProductAvailabilityType,

    @field:Valid
    @field:JsonProperty("default_currency", required = true) val defaultCurrency: NullableCurrency,

    @field:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @field:JsonProperty("format", required = true) val format: CatalogsFormat,

    @field:JsonProperty("default_locale", required = true) val defaultLocale: kotlin.String,

    @field:Valid
    @field:JsonProperty("credentials", required = true) val credentials: CatalogsFeedCredentials,

    @field:JsonProperty("location", required = true) val location: kotlin.String,

    @field:Valid
    @field:JsonProperty("preferred_processing_schedule", required = true) val preferredProcessingSchedule: CatalogsFeedProcessingSchedule,

    @field:Valid
    @field:JsonProperty("status", required = true) val status: CatalogsStatus
) {

}

