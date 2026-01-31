package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsFilterValuesMap

/**
 * 
 * @param catalogUnderscoretype 
 * @param filterUnderscorevalues 
 */
case class CatalogsCreativeAssetsAvailableFilterValues(catalogUnderscoretype: String,
                filterUnderscorevalues: CatalogsCreativeAssetsFilterValuesMap
                )

object CatalogsCreativeAssetsAvailableFilterValues {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsAvailableFilterValues from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsAvailableFilterValues] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsAvailableFilterValues] = deriveEncoder
}
