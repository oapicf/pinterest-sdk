package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Hotel product metadata entity
 * @param hotelUnderscoreid The user-created unique ID that represents the hotel item.
 */
case class CatalogsHotelProductMetadata(hotelUnderscoreid: String
                )

object CatalogsHotelProductMetadata {
    /**
     * Creates the codec for converting CatalogsHotelProductMetadata from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelProductMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelProductMetadata] = deriveEncoder
}
