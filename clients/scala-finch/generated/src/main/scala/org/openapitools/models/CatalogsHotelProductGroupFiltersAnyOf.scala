package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelProductGroupFilterKeys
import scala.collection.immutable.Seq

/**
 * 
 * @param anyUnderscoreof 
 */
case class CatalogsHotelProductGroupFiltersAnyOf(anyUnderscoreof: Seq[CatalogsHotelProductGroupFilterKeys]
                )

object CatalogsHotelProductGroupFiltersAnyOf {
    /**
     * Creates the codec for converting CatalogsHotelProductGroupFiltersAnyOf from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelProductGroupFiltersAnyOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelProductGroupFiltersAnyOf] = deriveEncoder
}
