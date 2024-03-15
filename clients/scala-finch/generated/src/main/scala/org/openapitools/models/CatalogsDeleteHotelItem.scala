package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A hotel item to be deleted
 * @param hotelUnderscoreid The catalog hotel id in the merchant namespace
 * @param operation 
 */
case class CatalogsDeleteHotelItem(hotelUnderscoreid: String,
                operation: String
                )

object CatalogsDeleteHotelItem {
    /**
     * Creates the codec for converting CatalogsDeleteHotelItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsDeleteHotelItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsDeleteHotelItem] = deriveEncoder
}
