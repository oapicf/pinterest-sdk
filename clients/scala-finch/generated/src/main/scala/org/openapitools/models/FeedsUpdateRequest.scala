package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsFeedCredentials
import org.openapitools.models.CatalogsFeedProcessingSchedule
import org.openapitools.models.CatalogsFeedsUpdateRequest
import org.openapitools.models.CatalogsFormat
import org.openapitools.models.CatalogsStatus
import org.openapitools.models.CatalogsType
import org.openapitools.models.CatalogsVerticalFeedsUpdateRequest
import org.openapitools.models.NullableCurrency
import org.openapitools.models.ProductAvailabilityType

/**
 * 
 * @param defaultUnderscorecurrency 
 * @param name A human-friendly name associated to a given feed.
 * @param format 
 * @param credentials 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param preferredUnderscoreprocessingUnderscoreschedule 
 * @param status 
 * @param catalogUnderscoretype 
 * @param defaultUnderscoreavailability 
 */
case class FeedsUpdateRequest(defaultUnderscorecurrency: Option[NullableCurrency],
                name: Option[String],
                format: Option[CatalogsFormat],
                credentials: Option[CatalogsFeedCredentials],
                location: Option[String],
                preferredUnderscoreprocessingUnderscoreschedule: Option[CatalogsFeedProcessingSchedule],
                status: Option[CatalogsStatus],
                catalogUnderscoretype: CatalogsType,
                defaultUnderscoreavailability: Option[ProductAvailabilityType]
                )

object FeedsUpdateRequest {
    /**
     * Creates the codec for converting FeedsUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[FeedsUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedsUpdateRequest] = deriveEncoder
}
