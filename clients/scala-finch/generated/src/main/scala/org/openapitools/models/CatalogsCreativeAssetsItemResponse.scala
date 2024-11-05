package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsAttributes
import org.openapitools.models.CatalogsType
import org.openapitools.models.Pin
import scala.collection.immutable.Seq

/**
 * Object describing a hotel record
 * @param catalogUnderscoretype 
 * @param creativeUnderscoreassetsUnderscoreid The catalog creative assets id in the merchant namespace
 * @param pins The pins mapped to the item
 * @param attributes 
 */
case class CatalogsCreativeAssetsItemResponse(catalogUnderscoretype: CatalogsType,
                creativeUnderscoreassetsUnderscoreid: Option[String],
                pins: Option[Seq[Pin]],
                attributes: Option[CatalogsCreativeAssetsAttributes]
                )

object CatalogsCreativeAssetsItemResponse {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsItemResponse from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsItemResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsItemResponse] = deriveEncoder
}
