package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.CatalogsFeedCredentials
import org.openapitools.models.CatalogsFeedProcessingSchedule
import org.openapitools.models.CatalogsFormat
import org.openapitools.models.CatalogsStatus
import org.openapitools.models.CatalogsType
import org.openapitools.models.Country
import org.openapitools.models.NullableCurrency
import org.openapitools.models.ProductAvailabilityType

/**
 * Catalogs Retail Feed object
 * @param createdUnderscoreat 
 * @param id 
 * @param updatedUnderscoreat 
 * @param catalogUnderscoretype 
 * @param credentials 
 * @param defaultUnderscoreavailability 
 * @param defaultUnderscorecountry 
 * @param defaultUnderscorecurrency 
 * @param defaultUnderscorelocale The locale used within a feed for product descriptions.
 * @param format 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
 * @param preferredUnderscoreprocessingUnderscoreschedule 
 * @param status 
 */
case class CatalogsRetailFeed(createdUnderscoreat: ZonedDateTime,
                id: String,
                updatedUnderscoreat: ZonedDateTime,
                catalogUnderscoretype: CatalogsType,
                credentials: CatalogsFeedCredentials,
                defaultUnderscoreavailability: ProductAvailabilityType,
                defaultUnderscorecountry: Country,
                defaultUnderscorecurrency: NullableCurrency,
                defaultUnderscorelocale: String,
                format: CatalogsFormat,
                location: String,
                name: String,
                preferredUnderscoreprocessingUnderscoreschedule: CatalogsFeedProcessingSchedule,
                status: CatalogsStatus
                )

object CatalogsRetailFeed {
    /**
     * Creates the codec for converting CatalogsRetailFeed from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailFeed] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailFeed] = deriveEncoder
}
