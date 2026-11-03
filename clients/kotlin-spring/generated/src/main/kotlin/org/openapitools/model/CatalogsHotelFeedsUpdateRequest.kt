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
 * Request object for updating a feed.
 * @param catalogType 
 * @param credentials 
 * @param defaultCurrency 
 * @param format 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param name A human-friendly name associated to a given feed.
 * @param preferredProcessingSchedule 
 * @param status 
 */
data class CatalogsHotelFeedsUpdateRequest(

    @Schema(required = true, description = "")
    @param:JsonProperty("catalog_type", required = true)
    @get:JsonProperty("catalog_type", required = true) override val catalogType: CatalogsHotelFeedsUpdateRequest.CatalogType = kotlin.String.HOTEL,

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
    @param:JsonProperty("format")
    @get:JsonProperty("format") val format: CatalogsFormat? = null,

    @get:Pattern(regexp="^(http|https|ftp|sftp)://")
    @Schema(description = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
    @param:JsonProperty("location")
    @get:JsonProperty("location") val location: kotlin.String? = null,

    @Schema(description = "A human-friendly name associated to a given feed.")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("preferred_processing_schedule")
    @get:JsonProperty("preferred_processing_schedule") val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: CatalogsStatus? = null
) : CatalogsVerticalFeedsUpdateRequest {

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
                return values().firstOrNull{ it.value == value }
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogType'")
            }
        }
    }

}

