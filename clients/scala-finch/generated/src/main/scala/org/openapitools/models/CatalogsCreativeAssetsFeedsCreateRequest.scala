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

/**
 * Request object for creating a feed.
 * @param defaultUnderscorecurrency 
 * @param name A human-friendly name associated to a given feed.
 * @param format 
 * @param defaultUnderscorelocale 
 * @param defaultUnderscorecountry 
 * @param credentials 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param preferredUnderscoreprocessingUnderscoreschedule 
 * @param catalogUnderscoretype 
 * @param catalogUnderscoreid Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
 * @param status 
 */
case class CatalogsCreativeAssetsFeedsCreateRequest(defaultUnderscorecurrency: Option[NullableCurrency],
                name: String,
                format: CatalogsFormat,
                defaultUnderscorelocale: CatalogsFeedsCreateRequestDefaultLocale,
                defaultUnderscorecountry: Country,
                credentials: Option[CatalogsFeedCredentials],
                location: String,
                preferredUnderscoreprocessingUnderscoreschedule: Option[CatalogsFeedProcessingSchedule],
                catalogUnderscoretype: CatalogsType,
                catalogUnderscoreid: Option[String],
                status: Option[CatalogsStatus]
                )

object CatalogsCreativeAssetsFeedsCreateRequest {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsFeedsCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsFeedsCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsFeedsCreateRequest] = deriveEncoder
}
