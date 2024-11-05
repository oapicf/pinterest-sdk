package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsAttributes
import org.openapitools.models.CatalogsCreativeAssetsItemResponse
import org.openapitools.models.CatalogsHotelItemResponse
import org.openapitools.models.CatalogsRetailItemResponse
import org.openapitools.models.CatalogsType
import org.openapitools.models.Pin
import scala.collection.immutable.Seq

/**
 * 
 * @param catalogUnderscoretype 
 * @param itemUnderscoreid The catalog retail item id in the merchant namespace
 * @param pins The pins mapped to the item
 * @param attributes 
 * @param hotelUnderscoreid The catalog hotel id in the merchant namespace
 * @param creativeUnderscoreassetsUnderscoreid The catalog creative assets id in the merchant namespace
 */
case class ItemResponseAnyOf(catalogUnderscoretype: CatalogsType,
                itemUnderscoreid: Option[String],
                pins: Option[Seq[Pin]],
                attributes: Option[CatalogsCreativeAssetsAttributes],
                hotelUnderscoreid: Option[String],
                creativeUnderscoreassetsUnderscoreid: Option[String]
                )

object ItemResponseAnyOf {
    /**
     * Creates the codec for converting ItemResponseAnyOf from and to JSON.
     */
    implicit val decoder: Decoder[ItemResponseAnyOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemResponseAnyOf] = deriveEncoder
}
