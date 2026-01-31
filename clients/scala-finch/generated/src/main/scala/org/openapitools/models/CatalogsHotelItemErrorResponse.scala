package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsType
import org.openapitools.models.ItemValidationEvent
import scala.collection.immutable.Seq

/**
 * Object describing a hotel item error
 * @param catalogUnderscoretype 
 * @param errors Array with the errors for the item id requested
 * @param hotelUnderscoreid The catalog hotel id in the merchant namespace
 */
case class CatalogsHotelItemErrorResponse(catalogUnderscoretype: CatalogsType,
                errors: Seq[ItemValidationEvent],
                hotelUnderscoreid: Option[String]
                )

object CatalogsHotelItemErrorResponse {
    /**
     * Creates the codec for converting CatalogsHotelItemErrorResponse from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelItemErrorResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelItemErrorResponse] = deriveEncoder
}
