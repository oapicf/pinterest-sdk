package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.CatalogsDbItem
import org.openapitools.models.CatalogsFeedIngestionDetails
import org.openapitools.models.CatalogsFeedProcessingResultFields
import org.openapitools.models.CatalogsFeedProcessingStatus
import org.openapitools.models.CatalogsFeedProductCounts
import org.openapitools.models.CatalogsFeedValidationDetails

/**
 * 
 * @param createdUnderscoreat 
 * @param id 
 * @param updatedUnderscoreat 
 * @param ingestionUnderscoredetails 
 * @param status 
 * @param productUnderscorecounts 
 * @param validationUnderscoredetails 
 */
case class CatalogsFeedProcessingResult(createdUnderscoreat: Option[ZonedDateTime],
                id: Option[String],
                updatedUnderscoreat: Option[ZonedDateTime],
                ingestionUnderscoredetails: CatalogsFeedIngestionDetails,
                status: CatalogsFeedProcessingStatus,
                productUnderscorecounts: CatalogsFeedProductCounts,
                validationUnderscoredetails: CatalogsFeedValidationDetails
                )

object CatalogsFeedProcessingResult {
    /**
     * Creates the codec for converting CatalogsFeedProcessingResult from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedProcessingResult] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedProcessingResult] = deriveEncoder
}
