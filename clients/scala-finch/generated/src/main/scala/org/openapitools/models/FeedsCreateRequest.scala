package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsFeedCredentials
import org.openapitools.models.CatalogsFeedProcessingSchedule
import org.openapitools.models.CatalogsFeedsCreateRequest
import org.openapitools.models.CatalogsFeedsCreateRequestDefaultLocale
import org.openapitools.models.CatalogsFormat
import org.openapitools.models.CatalogsStatus
import org.openapitools.models.CatalogsType
import org.openapitools.models.CatalogsVerticalFeedsCreateRequest
import org.openapitools.models.Country
import org.openapitools.models.NullableCurrency
import org.openapitools.models.ProductAvailabilityType

/**
 * 
 * @param defaultUnderscorecurrency 
 * @param name A human-friendly name associated to a given feed.
 * @param format 
 * @param defaultUnderscorelocale 
 * @param credentials 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param preferredUnderscoreprocessingUnderscoreschedule 
 * @param catalogUnderscoretype 
 * @param defaultUnderscorecountry 
 * @param defaultUnderscoreavailability 
 * @param status 
 * @param catalogUnderscoreid Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
 */
case class FeedsCreateRequest(defaultUnderscorecurrency: Option[NullableCurrency],
                name: String,
                format: CatalogsFormat,
                defaultUnderscorelocale: CatalogsFeedsCreateRequestDefaultLocale,
                credentials: Option[CatalogsFeedCredentials],
                location: String,
                preferredUnderscoreprocessingUnderscoreschedule: Option[CatalogsFeedProcessingSchedule],
                catalogUnderscoretype: CatalogsType,
                defaultUnderscorecountry: Country,
                defaultUnderscoreavailability: Option[ProductAvailabilityType],
                status: Option[CatalogsStatus],
                catalogUnderscoreid: Option[String]
                )

object FeedsCreateRequest {
    /**
     * Creates the codec for converting FeedsCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[FeedsCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedsCreateRequest] = deriveEncoder
}
