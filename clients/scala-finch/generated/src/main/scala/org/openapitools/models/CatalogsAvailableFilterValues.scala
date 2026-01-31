package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsAvailableFilterValues
import org.openapitools.models.CatalogsCreativeAssetsFilterValuesMap
import org.openapitools.models.CatalogsHotelAvailableFilterValues
import org.openapitools.models.CatalogsRetailAvailableFilterValues

/**
 * Object holding available filter values for each filter key
 * @param catalogUnderscoretype 
 * @param filterUnderscorevalues 
 */
case class CatalogsAvailableFilterValues(catalogUnderscoretype: String,
                filterUnderscorevalues: CatalogsCreativeAssetsFilterValuesMap
                )

object CatalogsAvailableFilterValues {
    /**
     * Creates the codec for converting CatalogsAvailableFilterValues from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsAvailableFilterValues] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsAvailableFilterValues] = deriveEncoder
}
