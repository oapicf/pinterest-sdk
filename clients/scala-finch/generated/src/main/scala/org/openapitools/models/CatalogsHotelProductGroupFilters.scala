package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelProductGroupFilterKeys
import org.openapitools.models.CatalogsHotelProductGroupFiltersAllOf
import org.openapitools.models.CatalogsHotelProductGroupFiltersAnyOf
import scala.collection.immutable.Seq

/**
 * Object holding a group of filters for a hotel product group
 * @param anyUnderscoreof 
 * @param allUnderscoreof 
 */
case class CatalogsHotelProductGroupFilters(anyUnderscoreof: Seq[CatalogsHotelProductGroupFilterKeys],
                allUnderscoreof: Seq[CatalogsHotelProductGroupFilterKeys]
                )

object CatalogsHotelProductGroupFilters {
    /**
     * Creates the codec for converting CatalogsHotelProductGroupFilters from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelProductGroupFilters] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelProductGroupFilters] = deriveEncoder
}
