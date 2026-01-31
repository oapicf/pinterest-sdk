package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsFeedsCreateRequest
import org.openapitools.models.CatalogsFeedCredentials
import org.openapitools.models.CatalogsFeedProcessingSchedule
import org.openapitools.models.CatalogsFeedsCreateRequestDefaultLocale
import org.openapitools.models.CatalogsFormat
import org.openapitools.models.CatalogsHotelFeedsCreateRequest
import org.openapitools.models.CatalogsRetailFeedsCreateRequest
import org.openapitools.models.CatalogsStatus
import org.openapitools.models.CatalogsType
import org.openapitools.models.Country
import org.openapitools.models.NullableCurrency
import org.openapitools.models.ProductAvailabilityType

/**
 * Request object for creating a feed.
 * @param catalogUnderscoreid Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
 * @param catalogUnderscoretype 
 * @param credentials 
 * @param defaultUnderscoreavailability 
 * @param defaultUnderscorecountry 
 * @param defaultUnderscorecurrency 
 * @param defaultUnderscorelocale 
 * @param format 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param name A human-friendly name associated to a given feed.
 * @param preferredUnderscoreprocessingUnderscoreschedule 
 * @param status 
 */
case class CatalogsVerticalFeedsCreateRequest(catalogUnderscoreid: Option[String],
                catalogUnderscoretype: CatalogsType,
                credentials: Option[CatalogsFeedCredentials],
                defaultUnderscoreavailability: Option[ProductAvailabilityType],
                defaultUnderscorecountry: Country,
                defaultUnderscorecurrency: Option[NullableCurrency],
                defaultUnderscorelocale: CatalogsFeedsCreateRequestDefaultLocale,
                format: CatalogsFormat,
                location: String,
                name: String,
                preferredUnderscoreprocessingUnderscoreschedule: Option[CatalogsFeedProcessingSchedule],
                status: Option[CatalogsStatus]
                )

object CatalogsVerticalFeedsCreateRequest {
    /**
     * Creates the codec for converting CatalogsVerticalFeedsCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsVerticalFeedsCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsVerticalFeedsCreateRequest] = deriveEncoder
}
