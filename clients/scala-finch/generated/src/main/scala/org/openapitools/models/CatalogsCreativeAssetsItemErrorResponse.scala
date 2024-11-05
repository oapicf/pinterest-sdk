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
 * Object describing a creative assets item error
 * @param catalogUnderscoretype 
 * @param creativeUnderscoreassetsUnderscoreid The catalog creative assets id in the merchant namespace
 * @param errors Array with the errors for the item id requested
 */
case class CatalogsCreativeAssetsItemErrorResponse(catalogUnderscoretype: CatalogsType,
                creativeUnderscoreassetsUnderscoreid: Option[String],
                errors: Option[Seq[ItemValidationEvent]]
                )

object CatalogsCreativeAssetsItemErrorResponse {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsItemErrorResponse from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsItemErrorResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsItemErrorResponse] = deriveEncoder
}
