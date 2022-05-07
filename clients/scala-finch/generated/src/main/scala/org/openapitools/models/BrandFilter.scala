package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria

/**
 * 
 * @param BRAND 
 */
case class BrandFilter(BRAND: CatalogsProductGroupMultipleStringCriteria
                )

object BrandFilter {
    /**
     * Creates the codec for converting BrandFilter from and to JSON.
     */
    implicit val decoder: Decoder[BrandFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[BrandFilter] = deriveEncoder
}
