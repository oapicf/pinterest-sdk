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
case class CatalogsProductGroupFiltersRequestAnyOf1(allUnderscoreof: Seq[CatalogsProductGroupFilterKeys]
                )

object CatalogsProductGroupFiltersRequestAnyOf1 {
    /**
     * Creates the codec for converting CatalogsProductGroupFiltersRequestAnyOf1 from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupFiltersRequestAnyOf1] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupFiltersRequestAnyOf1] = deriveEncoder
}
