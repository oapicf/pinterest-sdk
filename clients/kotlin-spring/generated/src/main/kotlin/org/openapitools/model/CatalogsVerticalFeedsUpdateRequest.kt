package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreativeAssetsFeedsUpdateRequest
import org.openapitools.model.CatalogsFeedCredentials
import org.openapitools.model.CatalogsFeedProcessingSchedule
import org.openapitools.model.CatalogsFormat
import org.openapitools.model.CatalogsHotelFeedsUpdateRequest
import org.openapitools.model.CatalogsRetailFeedsUpdateRequest
import org.openapitools.model.CatalogsStatus
import org.openapitools.model.CatalogsType
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
 * Request object for updating a feed.
 * @param catalogType 
 * @param defaultCurrency 
 * @param name A human-friendly name associated to a given feed.
 * @param format 
 * @param credentials 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param preferredProcessingSchedule 
 * @param status 
 * @param defaultAvailability 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsCreativeAssetsFeedsUpdateRequest::class, name = "CREATIVE_ASSETS"),
      JsonSubTypes.Type(value = CatalogsHotelFeedsUpdateRequest::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailFeedsUpdateRequest::class, name = "RETAIL")
)

interface CatalogsVerticalFeedsUpdateRequest{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsType

                @get:Schema(example = "null", description = "")
        val defaultCurrency: NullableCurrency? 

                @get:Schema(example = "null", description = "A human-friendly name associated to a given feed.")
        val name: kotlin.String? 

                @get:Schema(example = "null", description = "")
        val format: CatalogsFormat? 

                @get:Schema(example = "null", description = "")
        val credentials: CatalogsFeedCredentials? 

                @get:Schema(example = "null", description = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
        val location: kotlin.String? 

                @get:Schema(example = "null", description = "")
        val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? 

                @get:Schema(example = "null", description = "")
        val status: CatalogsStatus? 

                @get:Schema(example = "null", description = "")
        val defaultAvailability: ProductAvailabilityType? 


}

