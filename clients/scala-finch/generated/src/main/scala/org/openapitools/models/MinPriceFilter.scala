package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupPricingCriteria

/**
 * 
 * @param MINUnderscorePRICE 
 */
case class MinPriceFilter(MINUnderscorePRICE: CatalogsProductGroupPricingCriteria
                )

object MinPriceFilter {
    /**
     * Creates the codec for converting MinPriceFilter from and to JSON.
     */
    implicit val decoder: Decoder[MinPriceFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[MinPriceFilter] = deriveEncoder
}
