package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria

/**
 * 
 * @param CREATIVEUnderscoreASSETSUnderscoreID 
 */
case class CreativeAssetsIdFilter(CREATIVEUnderscoreASSETSUnderscoreID: CatalogsProductGroupMultipleStringCriteria
                )

object CreativeAssetsIdFilter {
    /**
     * Creates the codec for converting CreativeAssetsIdFilter from and to JSON.
     */
    implicit val decoder: Decoder[CreativeAssetsIdFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreativeAssetsIdFilter] = deriveEncoder
}
