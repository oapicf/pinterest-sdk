package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.CatalogsFeedIngestionDetails
import org.openapitools.models.CatalogsFeedProcessingStatus
import org.openapitools.models.CatalogsFeedProductCounts
import org.openapitools.models.CatalogsFeedValidationDetails
import org.openapitools.models.CatalogsFeedVideoCounts

/**
 * 
 * @param createdUnderscoreat 
 * @param id 
 * @param updatedUnderscoreat 
 * @param ingestionUnderscoredetails 
 * @param productUnderscorecounts 
 * @param status 
 * @param validationUnderscoredetails 
 * @param videoUnderscorecounts 
 */
case class CatalogsFeedProcessingResult(createdUnderscoreat: ZonedDateTime,
                id: String,
                updatedUnderscoreat: ZonedDateTime,
                ingestionUnderscoredetails: CatalogsFeedIngestionDetails,
                productUnderscorecounts: CatalogsFeedProductCounts,
                status: CatalogsFeedProcessingStatus,
                validationUnderscoredetails: CatalogsFeedValidationDetails,
                videoUnderscorecounts: Option[CatalogsFeedVideoCounts]
                )

object CatalogsFeedProcessingResult {
    /**
     * Creates the codec for converting CatalogsFeedProcessingResult from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedProcessingResult] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedProcessingResult] = deriveEncoder
}
