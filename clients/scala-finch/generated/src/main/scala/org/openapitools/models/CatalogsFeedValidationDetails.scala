package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsFeedValidationErrors
import org.openapitools.models.CatalogsFeedValidationWarnings

/**
 * 
 * @param errors 
 * @param warnings 
 */
case class CatalogsFeedValidationDetails(errors: CatalogsFeedValidationErrors,
                warnings: CatalogsFeedValidationWarnings
                )

object CatalogsFeedValidationDetails {
    /**
     * Creates the codec for converting CatalogsFeedValidationDetails from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedValidationDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedValidationDetails] = deriveEncoder
}
