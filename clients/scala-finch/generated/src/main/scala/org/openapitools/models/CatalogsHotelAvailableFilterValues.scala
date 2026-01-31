package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelFilterValuesMap

/**
 * 
 * @param catalogUnderscoretype 
 * @param filterUnderscorevalues 
 */
case class CatalogsHotelAvailableFilterValues(catalogUnderscoretype: String,
                filterUnderscorevalues: CatalogsHotelFilterValuesMap
                )

object CatalogsHotelAvailableFilterValues {
    /**
     * Creates the codec for converting CatalogsHotelAvailableFilterValues from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelAvailableFilterValues] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelAvailableFilterValues] = deriveEncoder
}
