package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelAttributes

/**
 * A hotel item to be upserted.
 * @param hotelUnderscoreid The catalog hotel id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
case class CatalogsUpsertHotelItem(hotelUnderscoreid: String,
                operation: String,
                attributes: CatalogsHotelAttributes
                )

object CatalogsUpsertHotelItem {
    /**
     * Creates the codec for converting CatalogsUpsertHotelItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsUpsertHotelItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsUpsertHotelItem] = deriveEncoder
}
