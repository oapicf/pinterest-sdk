package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria

/**
 * 
 * @param HOTELUnderscoreID 
 */
case class HotelIdFilter(HOTELUnderscoreID: CatalogsProductGroupMultipleStringCriteria
                )

object HotelIdFilter {
    /**
     * Creates the codec for converting HotelIdFilter from and to JSON.
     */
    implicit val decoder: Decoder[HotelIdFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[HotelIdFilter] = deriveEncoder
}
