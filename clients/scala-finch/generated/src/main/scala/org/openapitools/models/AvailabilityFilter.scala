package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria

/**
 * 
 * @param AVAILABILITY 
 */
case class AvailabilityFilter(AVAILABILITY: CatalogsProductGroupMultipleStringCriteria
                )

object AvailabilityFilter {
    /**
     * Creates the codec for converting AvailabilityFilter from and to JSON.
     */
    implicit val decoder: Decoder[AvailabilityFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[AvailabilityFilter] = deriveEncoder
}
