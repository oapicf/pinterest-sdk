package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsFeedCredentials
import org.openapitools.models.CatalogsFeedProcessingSchedule
import org.openapitools.models.CatalogsFormat
import org.openapitools.models.CatalogsStatus
import org.openapitools.models.Country
import org.openapitools.models.NullableCurrency
import org.openapitools.models.ProductAvailabilityType

/**
 * 
 * @param defaultUnderscorecountry 
 * @param defaultUnderscoreavailability 
 * @param defaultUnderscorecurrency 
 * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
 * @param format 
 * @param defaultUnderscorelocale The locale used within a feed for product descriptions.
 * @param credentials 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param preferredUnderscoreprocessingUnderscoreschedule 
 * @param status 
 */
case class FeedFields(defaultUnderscorecountry: Country,
                defaultUnderscoreavailability: ProductAvailabilityType,
                defaultUnderscorecurrency: NullableCurrency,
                name: String,
                format: CatalogsFormat,
                defaultUnderscorelocale: String,
                credentials: CatalogsFeedCredentials,
                location: String,
                preferredUnderscoreprocessingUnderscoreschedule: CatalogsFeedProcessingSchedule,
                status: CatalogsStatus
                )

object FeedFields {
    /**
     * Creates the codec for converting FeedFields from and to JSON.
     */
    implicit val decoder: Decoder[FeedFields] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedFields] = deriveEncoder
}
