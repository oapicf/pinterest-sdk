package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria

/**
 * 
 * @param ITEMUnderscoreID 
 */
case class ItemIdFilter(ITEMUnderscoreID: CatalogsProductGroupMultipleStringCriteria
                )

object ItemIdFilter {
    /**
     * Creates the codec for converting ItemIdFilter from and to JSON.
     */
    implicit val decoder: Decoder[ItemIdFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemIdFilter] = deriveEncoder
}
