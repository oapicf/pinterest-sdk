package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsFeedIngestionDetails
import org.openapitools.models.CatalogsFeedProcessingStatus
import org.openapitools.models.CatalogsFeedProductCounts
import org.openapitools.models.CatalogsFeedValidationDetails

/**
 * 
 * @param ingestionUnderscoredetails 
 * @param status 
 * @param productUnderscorecounts 
 * @param validationUnderscoredetails 
 */
case class CatalogsFeedProcessingResultFields(ingestionUnderscoredetails: CatalogsFeedIngestionDetails,
                status: CatalogsFeedProcessingStatus,
                productUnderscorecounts: CatalogsFeedProductCounts,
                validationUnderscoredetails: CatalogsFeedValidationDetails
                )

object CatalogsFeedProcessingResultFields {
    /**
     * Creates the codec for converting CatalogsFeedProcessingResultFields from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedProcessingResultFields] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedProcessingResultFields] = deriveEncoder
}
