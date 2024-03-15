package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsFeedCredentials
import org.openapitools.model.CatalogsFeedProcessingSchedule
import org.openapitools.model.CatalogsFormat
import org.openapitools.model.CatalogsHotelFeed
import org.openapitools.model.CatalogsRetailFeed
import org.openapitools.model.CatalogsStatus
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
 * Catalogs Feed object
 * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
 * @param format 
 * @param catalogType 
 * @param credentials 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param preferredProcessingSchedule 
 * @param status 
 * @param defaultCurrency 
 * @param defaultLocale The locale used within a feed for product descriptions.
 * @param defaultCountry 
 * @param defaultAvailability 
 * @param catalogId Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
 * @param createdAt 
 * @param id 
 * @param updatedAt 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsHotelFeed::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailFeed::class, name = "RETAIL")
)

interface CatalogsFeed{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.")
        val name: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val format: CatalogsFormat

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsType

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val credentials: CatalogsFeedCredentials

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
        val location: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val preferredProcessingSchedule: CatalogsFeedProcessingSchedule

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val status: CatalogsStatus

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val defaultCurrency: NullableCurrency

                @get:Schema(example = "en-US", requiredMode = Schema.RequiredMode.REQUIRED, description = "The locale used within a feed for product descriptions.")
        val defaultLocale: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val defaultCountry: Country

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val defaultAvailability: ProductAvailabilityType

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.")
        val catalogId: kotlin.String

                @get:Schema(example = "2022-03-14T15:15:22Z", description = "")
        val createdAt: java.time.OffsetDateTime? 

                @get:Schema(example = "null", description = "")
        val id: kotlin.String? 

                @get:Schema(example = "2022-03-14T15:16:34Z", description = "")
        val updatedAt: java.time.OffsetDateTime? 


}

