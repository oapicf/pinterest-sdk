package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupPricingCriteria

/**
 * 
 * @param MAXUnderscorePRICE 
 */
case class MaxPriceFilter(MAXUnderscorePRICE: CatalogsProductGroupPricingCriteria
                )

object MaxPriceFilter {
    /**
     * Creates the codec for converting MaxPriceFilter from and to JSON.
     */
    implicit val decoder: Decoder[MaxPriceFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[MaxPriceFilter] = deriveEncoder
}
