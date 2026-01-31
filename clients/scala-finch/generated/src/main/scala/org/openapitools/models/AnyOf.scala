package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupFilterKeys
import scala.collection.immutable.Seq

/**
 * 
 * @param anyUnderscoreof 
 */
case class AnyOf(anyUnderscoreof: Seq[CatalogsProductGroupFilterKeys]
                )

object AnyOf {
    /**
     * Creates the codec for converting AnyOf from and to JSON.
     */
    implicit val decoder: Decoder[AnyOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[AnyOf] = deriveEncoder
}
