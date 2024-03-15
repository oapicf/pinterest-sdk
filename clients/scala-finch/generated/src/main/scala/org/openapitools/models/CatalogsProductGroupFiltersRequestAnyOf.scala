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
case class CatalogsProductGroupFiltersRequestAnyOf(anyUnderscoreof: Seq[CatalogsProductGroupFilterKeys]
                )

object CatalogsProductGroupFiltersRequestAnyOf {
    /**
     * Creates the codec for converting CatalogsProductGroupFiltersRequestAnyOf from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupFiltersRequestAnyOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupFiltersRequestAnyOf] = deriveEncoder
}
