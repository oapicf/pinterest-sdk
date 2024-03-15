package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupPricingCurrencyCriteria

/**
 * 
 * @param PRICE 
 */
case class PriceFilter(PRICE: CatalogsProductGroupPricingCurrencyCriteria
                )

object PriceFilter {
    /**
     * Creates the codec for converting PriceFilter from and to JSON.
     */
    implicit val decoder: Decoder[PriceFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[PriceFilter] = deriveEncoder
}
