package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsUpdatableHotelAttributes

/**
 * Object describing an hotel item batch record
 * @param hotelUnderscoreid The catalog hotel item id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
case class CatalogsUpdateHotelItem(hotelUnderscoreid: String,
                operation: String,
                attributes: CatalogsUpdatableHotelAttributes
                )

object CatalogsUpdateHotelItem {
    /**
     * Creates the codec for converting CatalogsUpdateHotelItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsUpdateHotelItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsUpdateHotelItem] = deriveEncoder
}
