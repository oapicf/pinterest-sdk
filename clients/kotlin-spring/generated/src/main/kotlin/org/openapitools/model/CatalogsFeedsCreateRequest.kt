package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsFeedCredentials
import org.openapitools.model.CatalogsFeedProcessingSchedule
import org.openapitools.model.CatalogsFormat
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
 * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 * @param name A human-friendly name associated to a given feed.
 * @param format 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param defaultCountry 
 * @param defaultAvailability 
 * @param defaultCurrency 
 * @param defaultLocale The locale used within a feed for product descriptions.
 * @param credentials 
 * @param preferredProcessingSchedule 
 */
data class CatalogsFeedsCreateRequest(

    @field:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @field:JsonProperty("format", required = true) val format: CatalogsFormat,

    @field:JsonProperty("location", required = true) val location: kotlin.String,

    @field:Valid
    @field:JsonProperty("default_country") val defaultCountry: Country? = null,

    @field:Valid
    @field:JsonProperty("default_availability") val defaultAvailability: ProductAvailabilityType? = null,

    @field:Valid
    @field:JsonProperty("default_currency") val defaultCurrency: NullableCurrency? = null,

    @field:JsonProperty("default_locale") val defaultLocale: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("credentials") val credentials: CatalogsFeedCredentials? = null,

    @field:Valid
    @field:JsonProperty("preferred_processing_schedule") val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null
) {

}

