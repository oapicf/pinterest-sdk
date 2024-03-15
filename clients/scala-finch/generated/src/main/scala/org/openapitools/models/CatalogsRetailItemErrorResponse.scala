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
 * Object describing a retail item error
 * @param catalogUnderscoretype 
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param errors Array with the errors for the item id requested
 */
case class CatalogsRetailItemErrorResponse(catalogUnderscoretype: CatalogsType,
                itemUnderscoreid: Option[String],
                errors: Option[Seq[ItemValidationEvent]]
                )

object CatalogsRetailItemErrorResponse {
    /**
     * Creates the codec for converting CatalogsRetailItemErrorResponse from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailItemErrorResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailItemErrorResponse] = deriveEncoder
}
