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
 * @param catalogUnderscoretype 
 * @param credentials 
 * @param defaultUnderscoreavailability 
 * @param defaultUnderscorecurrency 
 * @param format 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param name A human-friendly name associated to a given feed.
 * @param preferredUnderscoreprocessingUnderscoreschedule 
 * @param status 
 */
case class FeedsUpdateRequest(catalogUnderscoretype: CatalogsType,
                credentials: Option[CatalogsFeedCredentials],
                defaultUnderscoreavailability: Option[ProductAvailabilityType],
                defaultUnderscorecurrency: Option[NullableCurrency],
                format: Option[CatalogsFormat],
                location: Option[String],
                name: Option[String],
                preferredUnderscoreprocessingUnderscoreschedule: Option[CatalogsFeedProcessingSchedule],
                status: Option[CatalogsStatus]
                )

object FeedsUpdateRequest {
    /**
     * Creates the codec for converting FeedsUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[FeedsUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedsUpdateRequest] = deriveEncoder
}
