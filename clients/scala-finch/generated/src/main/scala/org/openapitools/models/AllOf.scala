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
 * @param allUnderscoreof 
 */
case class AllOf(allUnderscoreof: Seq[CatalogsProductGroupFilterKeys]
                )

object AllOf {
    /**
     * Creates the codec for converting AllOf from and to JSON.
     */
    implicit val decoder: Decoder[AllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[AllOf] = deriveEncoder
}
