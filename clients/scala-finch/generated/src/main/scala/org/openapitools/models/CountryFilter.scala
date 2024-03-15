package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleCountriesCriteria

/**
 * 
 * @param COUNTRY 
 */
case class CountryFilter(COUNTRY: CatalogsProductGroupMultipleCountriesCriteria
                )

object CountryFilter {
    /**
     * Creates the codec for converting CountryFilter from and to JSON.
     */
    implicit val decoder: Decoder[CountryFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CountryFilter] = deriveEncoder
}
