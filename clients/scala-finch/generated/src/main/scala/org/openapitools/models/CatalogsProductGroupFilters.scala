package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupFilterKeys
import org.openapitools.models.CatalogsProductGroupFiltersAllOf
import org.openapitools.models.CatalogsProductGroupFiltersAnyOf
import scala.collection.immutable.Seq

/**
 * Object holding a group of filters for a catalog product group
 * @param anyUnderscoreof 
 * @param allUnderscoreof 
 */
case class CatalogsProductGroupFilters(anyUnderscoreof: Option[Seq[CatalogsProductGroupFilterKeys]],
                allUnderscoreof: Option[Seq[CatalogsProductGroupFilterKeys]]
                )

object CatalogsProductGroupFilters {
    /**
     * Creates the codec for converting CatalogsProductGroupFilters from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupFilters] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupFilters] = deriveEncoder
}
