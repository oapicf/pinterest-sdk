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
 * @param catalogUnderscoreid Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. Currently, this field has no effect.
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
case class CatalogsRetailFeedsCreateRequest(catalogUnderscoreid: Option[String],
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

object CatalogsRetailFeedsCreateRequest {
    /**
     * Creates the codec for converting CatalogsRetailFeedsCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailFeedsCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailFeedsCreateRequest] = deriveEncoder
}
