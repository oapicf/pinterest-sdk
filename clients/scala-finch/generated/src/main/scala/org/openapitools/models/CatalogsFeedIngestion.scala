package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.CatalogsFeedProcessingStatus

/**
 * 
 * @param id 
 * @param feedUnderscoreid 
 * @param createdUnderscoreat 
 * @param status 
 */
case class CatalogsFeedIngestion(id: String,
                feedUnderscoreid: String,
                createdUnderscoreat: ZonedDateTime,
                status: CatalogsFeedProcessingStatus
                )

object CatalogsFeedIngestion {
    /**
     * Creates the codec for converting CatalogsFeedIngestion from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedIngestion] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedIngestion] = deriveEncoder
}
