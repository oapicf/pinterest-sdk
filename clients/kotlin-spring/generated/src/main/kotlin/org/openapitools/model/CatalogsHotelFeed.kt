package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsFeedCredentials
import org.openapitools.model.CatalogsFeedProcessingSchedule
import org.openapitools.model.CatalogsFormat
import org.openapitools.model.CatalogsStatus
import org.openapitools.model.CatalogsType
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
 * Catalogs Hotel Feed object
 * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
 * @param format 
 * @param catalogType 
 * @param credentials 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param preferredProcessingSchedule 
 * @param status 
 * @param defaultCurrency 
 * @param defaultLocale The locale used within a feed for product descriptions.
 * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
 * @param createdAt 
 * @param id 
 * @param updatedAt 
 */
data class CatalogsHotelFeed(

    @Schema(example = "null", required = true, description = "A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.")
    @get:JsonProperty("name", required = true) val name: kotlin.String?,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("format", required = true) val format: CatalogsFormat,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsType,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("credentials", required = true) val credentials: CatalogsFeedCredentials?,

    @Schema(example = "null", required = true, description = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
    @get:JsonProperty("location", required = true) val location: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("preferred_processing_schedule", required = true) val preferredProcessingSchedule: CatalogsFeedProcessingSchedule?,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("status", required = true) val status: CatalogsStatus,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("default_currency", required = true) val defaultCurrency: NullableCurrency?,

    @Schema(example = "en-US", required = true, description = "The locale used within a feed for product descriptions.")
    @get:JsonProperty("default_locale", required = true) val defaultLocale: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", required = true, description = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.")
    @get:JsonProperty("catalog_id", required = true) val catalogId: kotlin.String?,

    @Schema(example = "2022-03-14T15:15:22Z", description = "")
    @get:JsonProperty("created_at") val createdAt: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "2022-03-14T15:16:34Z", description = "")
    @get:JsonProperty("updated_at") val updatedAt: java.time.OffsetDateTime? = null
) {

}

