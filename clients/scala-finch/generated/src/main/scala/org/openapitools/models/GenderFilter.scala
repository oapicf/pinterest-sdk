package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria

/**
 * 
 * @param GENDER 
 */
case class GenderFilter(GENDER: CatalogsProductGroupMultipleStringCriteria
                )

object GenderFilter {
    /**
     * Creates the codec for converting GenderFilter from and to JSON.
     */
    implicit val decoder: Decoder[GenderFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenderFilter] = deriveEncoder
}
