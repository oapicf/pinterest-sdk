package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param negated 
 * @param operator 
 * @param value 
 */
case class CatalogsProductGroupUint32Criteria(negated: Option[Boolean],
                operator: String,
                value: Int
                )

object CatalogsProductGroupUint32Criteria {
    /**
     * Creates the codec for converting CatalogsProductGroupUint32Criteria from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupUint32Criteria] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupUint32Criteria] = deriveEncoder
}
