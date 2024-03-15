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
 * @param hotelUnderscoreid The catalog hotel id in the merchant namespace
 * @param errors Array with the errors for the item id requested
 */
case class CatalogsHotelItemErrorResponse(catalogUnderscoretype: CatalogsType,
                hotelUnderscoreid: Option[String],
                errors: Option[Seq[ItemValidationEvent]]
                )

object CatalogsHotelItemErrorResponse {
    /**
     * Creates the codec for converting CatalogsHotelItemErrorResponse from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelItemErrorResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelItemErrorResponse] = deriveEncoder
}
