package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupCurrencyCriteria

/**
 * 
 * @param CURRENCY 
 */
case class CurrencyFilter(CURRENCY: CatalogsProductGroupCurrencyCriteria
                )

object CurrencyFilter {
    /**
     * Creates the codec for converting CurrencyFilter from and to JSON.
     */
    implicit val decoder: Decoder[CurrencyFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CurrencyFilter] = deriveEncoder
}
