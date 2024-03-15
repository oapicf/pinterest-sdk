package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsFeedCredentials
import org.openapitools.model.CatalogsFeedProcessingSchedule
import org.openapitools.model.CatalogsFeedsCreateRequest
import org.openapitools.model.CatalogsFeedsCreateRequestDefaultLocale
import org.openapitools.model.CatalogsFormat
import org.openapitools.model.CatalogsType
import org.openapitools.model.CatalogsVerticalFeedsCreateRequest
import org.openapitools.model.Country
import org.openapitools.model.NullableCurrency
import org.openapitools.model.ProductAvailabilityType
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
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
data class FeedsCreateRequest(

    @Schema(example = "null", required = true, description = "A human-friendly name associated to a given feed.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("format", required = true) val format: CatalogsFormat,

    @get:Pattern(regexp="^(http|https|ftp|sftp)://")
    @Schema(example = "null", required = true, description = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
    @get:JsonProperty("location", required = true) val location: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) override val catalogType: CatalogsType,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("default_currency") val defaultCurrency: NullableCurrency? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("default_locale") val defaultLocale: CatalogsFeedsCreateRequestDefaultLocale? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("credentials") val credentials: CatalogsFeedCredentials? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("preferred_processing_schedule") val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("default_country") val defaultCountry: Country? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("default_availability") val defaultAvailability: ProductAvailabilityType? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.")
    @get:JsonProperty("catalog_id") override val catalogId: kotlin.String? = null
) {

}

