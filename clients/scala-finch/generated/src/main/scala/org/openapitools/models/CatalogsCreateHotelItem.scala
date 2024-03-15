package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelAttributes

/**
 * A hotel item to be created.
 * @param hotelUnderscoreid The catalog hotel id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
case class CatalogsCreateHotelItem(hotelUnderscoreid: String,
                operation: String,
                attributes: CatalogsHotelAttributes
                )

object CatalogsCreateHotelItem {
    /**
     * Creates the codec for converting CatalogsCreateHotelItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreateHotelItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreateHotelItem] = deriveEncoder
}
