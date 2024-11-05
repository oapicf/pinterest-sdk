package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsFeedCredentials
import org.openapitools.model.CatalogsFeedProcessingSchedule
import org.openapitools.model.CatalogsFeedsCreateRequestDefaultLocale
import org.openapitools.model.CatalogsFormat
import org.openapitools.model.CatalogsStatus
import org.openapitools.model.CatalogsType
import org.openapitools.model.Country
import org.openapitools.model.NullableCurrency
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
 * Request object for creating a feed.
 * @param name A human-friendly name associated to a given feed.
 * @param format 
 * @param defaultLocale 
 * @param defaultCountry 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param catalogType 
 * @param defaultCurrency 
 * @param credentials 
 * @param preferredProcessingSchedule 
 * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
 * @param status 
 */
data class CatalogsCreativeAssetsFeedsCreateRequest(

    @Schema(example = "null", required = true, description = "A human-friendly name associated to a given feed.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("format", required = true) val format: CatalogsFormat,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("default_locale", required = true) val defaultLocale: CatalogsFeedsCreateRequestDefaultLocale,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("default_country", required = true) val defaultCountry: Country,

    @get:Pattern(regexp="^(http|https|ftp|sftp)://")
    @Schema(example = "null", required = true, description = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
    @get:JsonProperty("location", required = true) val location: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsType,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("default_currency") val defaultCurrency: NullableCurrency? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("credentials") val credentials: CatalogsFeedCredentials? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("preferred_processing_schedule") val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.")
    @get:JsonProperty("catalog_id") val catalogId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: CatalogsStatus? = null
    ) {

}

