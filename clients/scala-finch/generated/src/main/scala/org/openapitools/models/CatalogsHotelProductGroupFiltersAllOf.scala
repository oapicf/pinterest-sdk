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
 * @param allUnderscoreof 
 */
case class CatalogsHotelProductGroupFiltersAllOf(allUnderscoreof: Seq[CatalogsHotelProductGroupFilterKeys]
                )

object CatalogsHotelProductGroupFiltersAllOf {
    /**
     * Creates the codec for converting CatalogsHotelProductGroupFiltersAllOf from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelProductGroupFiltersAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelProductGroupFiltersAllOf] = deriveEncoder
}
