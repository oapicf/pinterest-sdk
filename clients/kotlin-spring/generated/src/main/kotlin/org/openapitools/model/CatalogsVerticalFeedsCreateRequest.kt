package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsFeedCredentials
import org.openapitools.model.CatalogsFeedProcessingSchedule
import org.openapitools.model.CatalogsFeedsCreateRequestDefaultLocale
import org.openapitools.model.CatalogsFormat
import org.openapitools.model.CatalogsHotelFeedsCreateRequest
import org.openapitools.model.CatalogsRetailFeedsCreateRequest
import org.openapitools.model.CatalogsType
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
 * Request object for creating a feed.
 * @param name A human-friendly name associated to a given feed.
 * @param format 
 * @param defaultLocale 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param catalogType 
 * @param defaultCountry 
 * @param defaultCurrency 
 * @param credentials 
 * @param preferredProcessingSchedule 
 * @param defaultAvailability 
 * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsHotelFeedsCreateRequest::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailFeedsCreateRequest::class, name = "RETAIL")
)

interface CatalogsVerticalFeedsCreateRequest{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "A human-friendly name associated to a given feed.")
        val name: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val format: CatalogsFormat

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val defaultLocale: CatalogsFeedsCreateRequestDefaultLocale

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
        val location: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsType

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val defaultCountry: Country

                @get:Schema(example = "null", description = "")
        val defaultCurrency: NullableCurrency? 

                @get:Schema(example = "null", description = "")
        val credentials: CatalogsFeedCredentials? 

                @get:Schema(example = "null", description = "")
        val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? 

                @get:Schema(example = "null", description = "")
        val defaultAvailability: ProductAvailabilityType? 

                @get:Schema(example = "null", description = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.")
        val catalogId: kotlin.String? 


}

