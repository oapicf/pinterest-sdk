package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelItemErrorResponse
import org.openapitools.models.CatalogsRetailItemErrorResponse
import org.openapitools.models.CatalogsType
import org.openapitools.models.ItemValidationEvent
import scala.collection.immutable.Seq

/**
 * 
 * @param catalogUnderscoretype 
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param errors Array with the errors for the item id requested
 * @param hotelUnderscoreid The catalog hotel id in the merchant namespace
 */
case class ItemResponseAnyOf1(catalogUnderscoretype: CatalogsType,
                itemUnderscoreid: Option[String],
                errors: Option[Seq[ItemValidationEvent]],
                hotelUnderscoreid: Option[String]
                )

object ItemResponseAnyOf1 {
    /**
     * Creates the codec for converting ItemResponseAnyOf1 from and to JSON.
     */
    implicit val decoder: Decoder[ItemResponseAnyOf1] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemResponseAnyOf1] = deriveEncoder
}
