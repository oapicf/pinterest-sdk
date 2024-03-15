package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsType
import org.openapitools.models.ItemAttributes
import org.openapitools.models.Pin
import scala.collection.immutable.Seq

/**
 * Object describing a retail item record
 * @param catalogUnderscoretype 
 * @param itemUnderscoreid The catalog retail item id in the merchant namespace
 * @param pins The pins mapped to the item
 * @param attributes 
 */
case class CatalogsRetailItemResponse(catalogUnderscoretype: CatalogsType,
                itemUnderscoreid: Option[String],
                pins: Option[Seq[Pin]],
                attributes: Option[ItemAttributes]
                )

object CatalogsRetailItemResponse {
    /**
     * Creates the codec for converting CatalogsRetailItemResponse from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailItemResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailItemResponse] = deriveEncoder
}
