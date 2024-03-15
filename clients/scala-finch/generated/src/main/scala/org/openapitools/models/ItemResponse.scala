package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelAttributes
import org.openapitools.models.CatalogsType
import org.openapitools.models.ItemResponseAnyOf
import org.openapitools.models.ItemResponseAnyOf1
import org.openapitools.models.ItemValidationEvent
import org.openapitools.models.Pin
import scala.collection.immutable.Seq

/**
 * Object describing an item record
 * @param catalogUnderscoretype 
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param pins The pins mapped to the item
 * @param attributes 
 * @param hotelUnderscoreid The catalog hotel id in the merchant namespace
 * @param errors Array with the errors for the item id requested
 */
case class ItemResponse(catalogUnderscoretype: CatalogsType,
                itemUnderscoreid: Option[String],
                pins: Option[Seq[Pin]],
                attributes: Option[CatalogsHotelAttributes],
                hotelUnderscoreid: Option[String],
                errors: Option[Seq[ItemValidationEvent]]
                )

object ItemResponse {
    /**
     * Creates the codec for converting ItemResponse from and to JSON.
     */
    implicit val decoder: Decoder[ItemResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemResponse] = deriveEncoder
}
