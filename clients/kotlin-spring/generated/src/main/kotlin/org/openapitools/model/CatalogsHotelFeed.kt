package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsFeedCredentials
import org.openapitools.model.CatalogsFeedProcessingSchedule
import org.openapitools.model.CatalogsFormat
import org.openapitools.model.CatalogsStatus
import org.openapitools.model.NullableCurrency
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
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
 * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
 * @param catalogType 
 * @param createdAt 
 * @param defaultLocale The locale used within a feed for product descriptions.
 * @param format 
 * @param id ID of the feed entity.
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
 * @param status 
 * @param updatedAt 
 * @param credentials 
 * @param defaultCurrency 
 * @param preferredProcessingSchedule 
 */
data class CatalogsHotelFeed(

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.")
    @param:JsonProperty("catalog_id")
    @get:JsonProperty("catalog_id", required = true) val catalogId: kotlin.String?,

    @Schema(required = true, description = "")
    @param:JsonProperty("catalog_type")
    @get:JsonProperty("catalog_type", required = true) override val catalogType: CatalogsHotelFeed.CatalogType = kotlin.String.HOTEL,

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at", required = true) val createdAt: java.time.OffsetDateTime,

    @Schema(required = true, description = "The locale used within a feed for product descriptions.")
    @param:JsonProperty("default_locale")
    @get:JsonProperty("default_locale", required = true) val defaultLocale: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("format")
    @get:JsonProperty("format", required = true) val format: CatalogsFormat,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "864344156814050986", required = true, readOnly = true, description = "ID of the feed entity.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @get:Pattern(regexp="^(http|https|ftp|sftp)://")
    @Schema(required = true, description = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
    @param:JsonProperty("location")
    @get:JsonProperty("location", required = true) val location: kotlin.String,

    @Schema(required = true, description = "A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String?,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: CatalogsStatus,

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("updated_at")
    @get:JsonProperty("updated_at", required = true) val updatedAt: java.time.OffsetDateTime,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("credentials")
    @get:JsonProperty("credentials") val credentials: CatalogsFeedCredentials? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("default_currency")
    @get:JsonProperty("default_currency") val defaultCurrency: NullableCurrency? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("preferred_processing_schedule")
    @get:JsonProperty("preferred_processing_schedule") val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null
) : CatalogsFeed {

    /**
    * 
    * Values: HOTEL
    */
    enum class CatalogType(@get:JsonValue val value: kotlin.String) {

        HOTEL("HOTEL");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CatalogType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogType'")
            }
        }
    }

}

