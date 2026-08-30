package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale
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
 * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 * @param catalogType 
 * @param defaultLocale 
 * @param format 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param name A human-friendly name associated to a given feed.
 * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
 * @param credentials 
 * @param defaultCurrency 
 * @param preferredProcessingSchedule 
 * @param status 
 */
data class CatalogsHotelFeedsCreateRequest(

    @Schema(required = true, description = "")
    @param:JsonProperty("catalog_type")
    @get:JsonProperty("catalog_type", required = true) override val catalogType: CatalogsHotelFeedsCreateRequest.CatalogType = kotlin.String.HOTEL,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("default_locale")
    @get:JsonProperty("default_locale", required = true) val defaultLocale: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("format")
    @get:JsonProperty("format", required = true) val format: CatalogsFormat,

    @get:Pattern(regexp="^(http|https|ftp|sftp)://")
    @Schema(required = true, description = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
    @param:JsonProperty("location")
    @get:JsonProperty("location", required = true) val location: kotlin.String,

    @Schema(required = true, description = "A human-friendly name associated to a given feed.")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("catalog_id")
    @get:JsonProperty("catalog_id") val catalogId: kotlin.String? = null,

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
    @get:JsonProperty("preferred_processing_schedule") val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: CatalogsStatus? = null
) : CatalogsVerticalFeedsCreateRequest {

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

