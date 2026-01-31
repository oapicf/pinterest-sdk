package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsRetailFilterValuesMap

/**
 * 
 * @param catalogUnderscoretype 
 * @param filterUnderscorevalues 
 */
case class CatalogsRetailAvailableFilterValues(catalogUnderscoretype: String,
                filterUnderscorevalues: CatalogsRetailFilterValuesMap
                )

object CatalogsRetailAvailableFilterValues {
    /**
     * Creates the codec for converting CatalogsRetailAvailableFilterValues from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailAvailableFilterValues] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailAvailableFilterValues] = deriveEncoder
}
