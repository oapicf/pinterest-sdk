package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelAttributes
import org.openapitools.models.CatalogsType
import org.openapitools.models.Pin
import scala.collection.immutable.Seq

/**
 * Object describing a hotel record
 * @param catalogUnderscoretype 
 * @param hotelUnderscoreid The catalog hotel id in the merchant namespace
 * @param pins The pins mapped to the item
 * @param attributes 
 */
case class CatalogsHotelItemResponse(catalogUnderscoretype: CatalogsType,
                hotelUnderscoreid: Option[String],
                pins: Option[Seq[Pin]],
                attributes: Option[CatalogsHotelAttributes]
                )

object CatalogsHotelItemResponse {
    /**
     * Creates the codec for converting CatalogsHotelItemResponse from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelItemResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelItemResponse] = deriveEncoder
}
