package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsFeedCredentials
import org.openapitools.model.CatalogsFeedProcessingSchedule
import org.openapitools.model.CatalogsFeedsUpdateRequest
import org.openapitools.model.CatalogsFormat
import org.openapitools.model.CatalogsStatus
import org.openapitools.model.CatalogsType
import org.openapitools.model.CatalogsVerticalFeedsUpdateRequest
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
 * @param defaultAvailability 
 * @param defaultCurrency 
 * @param name A human-friendly name associated to a given feed.
 * @param format 
 * @param credentials 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param preferredProcessingSchedule 
 * @param status 
 */
data class FeedsUpdateRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) override val catalogType: CatalogsType,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("default_availability") val defaultAvailability: ProductAvailabilityType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("default_currency") val defaultCurrency: NullableCurrency? = null,

    @Schema(example = "null", description = "A human-friendly name associated to a given feed.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("format") val format: CatalogsFormat? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("credentials") val credentials: CatalogsFeedCredentials? = null,

    @get:Pattern(regexp="^(http|https|ftp|sftp)://")
    @Schema(example = "null", description = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
    @get:JsonProperty("location") val location: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("preferred_processing_schedule") val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: CatalogsStatus? = null
) {

}

