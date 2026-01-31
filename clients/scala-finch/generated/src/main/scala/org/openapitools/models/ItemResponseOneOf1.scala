package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsItemErrorResponse
import org.openapitools.models.CatalogsHotelItemErrorResponse
import org.openapitools.models.CatalogsRetailItemErrorResponse
import org.openapitools.models.CatalogsType
import org.openapitools.models.ItemValidationEvent
import scala.collection.immutable.Seq

/**
 * Error item response
 * @param catalogUnderscoretype 
 * @param errors 
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param hotelUnderscoreid The catalog hotel id in the merchant namespace
 * @param creativeUnderscoreassetsUnderscoreid The catalog creative assets id in the merchant namespace
 */
case class ItemResponseOneOf1(catalogUnderscoretype: CatalogsType,
                errors: Seq[ItemValidationEvent],
                itemUnderscoreid: Option[String],
                hotelUnderscoreid: Option[String],
                creativeUnderscoreassetsUnderscoreid: Option[String]
                )

object ItemResponseOneOf1 {
    /**
     * Creates the codec for converting ItemResponseOneOf1 from and to JSON.
     */
    implicit val decoder: Decoder[ItemResponseOneOf1] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemResponseOneOf1] = deriveEncoder
}
