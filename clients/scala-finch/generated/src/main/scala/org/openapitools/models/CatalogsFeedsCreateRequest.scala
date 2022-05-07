package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsFeedCredentials
import org.openapitools.models.CatalogsFeedProcessingSchedule
import org.openapitools.models.CatalogsFormat
import org.openapitools.models.Country
import org.openapitools.models.NullableCurrency
import org.openapitools.models.ProductAvailabilityType

/**
 * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 * @param defaultUnderscorecountry 
 * @param defaultUnderscoreavailability 
 * @param defaultUnderscorecurrency 
 * @param name A human-friendly name associated to a given feed.
 * @param format 
 * @param defaultUnderscorelocale The locale used within a feed for product descriptions.
 * @param credentials 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param preferredUnderscoreprocessingUnderscoreschedule 
 */
case class CatalogsFeedsCreateRequest(defaultUnderscorecountry: Option[Country],
                defaultUnderscoreavailability: Option[ProductAvailabilityType],
                defaultUnderscorecurrency: Option[NullableCurrency],
                name: String,
                format: CatalogsFormat,
                defaultUnderscorelocale: Option[String],
                credentials: Option[CatalogsFeedCredentials],
                location: String,
                preferredUnderscoreprocessingUnderscoreschedule: Option[CatalogsFeedProcessingSchedule]
                )

object CatalogsFeedsCreateRequest {
    /**
     * Creates the codec for converting CatalogsFeedsCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedsCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedsCreateRequest] = deriveEncoder
}
