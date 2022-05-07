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
case class CatalogsProductGroupFiltersAnyOf(anyUnderscoreof: Option[Seq[CatalogsProductGroupFilterKeys]]
                )

object CatalogsProductGroupFiltersAnyOf {
    /**
     * Creates the codec for converting CatalogsProductGroupFiltersAnyOf from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupFiltersAnyOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupFiltersAnyOf] = deriveEncoder
}
