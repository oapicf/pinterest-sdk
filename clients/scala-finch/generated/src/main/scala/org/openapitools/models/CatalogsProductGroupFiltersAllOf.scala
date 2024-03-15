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
case class CatalogsProductGroupFiltersAllOf(allUnderscoreof: Seq[CatalogsProductGroupFilterKeys]
                )

object CatalogsProductGroupFiltersAllOf {
    /**
     * Creates the codec for converting CatalogsProductGroupFiltersAllOf from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupFiltersAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupFiltersAllOf] = deriveEncoder
}
