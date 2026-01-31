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
import org.openapitools.models.CatalogsType
import org.openapitools.models.NullableCurrency

/**
 * Request object for updating a feed.
 * @param catalogUnderscoretype 
 * @param credentials 
 * @param defaultUnderscorecurrency 
 * @param format 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param name A human-friendly name associated to a given feed.
 * @param preferredUnderscoreprocessingUnderscoreschedule 
 * @param status 
 */
case class CatalogsHotelFeedsUpdateRequest(catalogUnderscoretype: CatalogsType,
                credentials: Option[CatalogsFeedCredentials],
                defaultUnderscorecurrency: Option[NullableCurrency],
                format: Option[CatalogsFormat],
                location: Option[String],
                name: Option[String],
                preferredUnderscoreprocessingUnderscoreschedule: Option[CatalogsFeedProcessingSchedule],
                status: Option[CatalogsStatus]
                )

object CatalogsHotelFeedsUpdateRequest {
    /**
     * Creates the codec for converting CatalogsHotelFeedsUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelFeedsUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelFeedsUpdateRequest] = deriveEncoder
}
