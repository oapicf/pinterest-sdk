package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsFeedCredentials
import org.openapitools.models.CatalogsFeedProcessingSchedule
import org.openapitools.models.CatalogsFeedsCreateRequestDefaultLocale
import org.openapitools.models.CatalogsFormat
import org.openapitools.models.CatalogsStatus
import org.openapitools.models.CatalogsType
import org.openapitools.models.Country
import org.openapitools.models.NullableCurrency
import org.openapitools.models.ProductAvailabilityType

/**
 * Request object for creating a retail feed.
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
 */
case class CatalogsRetailFeedsCreateRequest(defaultUnderscorecurrency: Option[NullableCurrency],
                name: String,
                format: CatalogsFormat,
                defaultUnderscorelocale: CatalogsFeedsCreateRequestDefaultLocale,
                credentials: Option[CatalogsFeedCredentials],
                location: String,
                preferredUnderscoreprocessingUnderscoreschedule: Option[CatalogsFeedProcessingSchedule],
                catalogUnderscoretype: CatalogsType,
                defaultUnderscorecountry: Country,
                defaultUnderscoreavailability: Option[ProductAvailabilityType],
                status: Option[CatalogsStatus]
                )

object CatalogsRetailFeedsCreateRequest {
    /**
     * Creates the codec for converting CatalogsRetailFeedsCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailFeedsCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailFeedsCreateRequest] = deriveEncoder
}
