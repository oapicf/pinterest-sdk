package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsFeedIngestionErrors
import org.openapitools.models.CatalogsFeedIngestionInfo
import org.openapitools.models.CatalogsFeedIngestionWarnings

/**
 * 
 * @param errors 
 * @param info 
 * @param warnings 
 */
case class CatalogsFeedIngestionDetails(errors: CatalogsFeedIngestionErrors,
                info: CatalogsFeedIngestionInfo,
                warnings: CatalogsFeedIngestionWarnings
                )

object CatalogsFeedIngestionDetails {
    /**
     * Creates the codec for converting CatalogsFeedIngestionDetails from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedIngestionDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedIngestionDetails] = deriveEncoder
}
