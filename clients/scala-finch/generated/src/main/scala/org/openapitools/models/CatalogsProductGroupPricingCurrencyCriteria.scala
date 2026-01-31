package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.NonNullableCatalogsCurrency

/**
 * 
 * @param currency 
 * @param negated 
 * @param operator 
 * @param value 
 */
case class CatalogsProductGroupPricingCurrencyCriteria(currency: NonNullableCatalogsCurrency,
                negated: Option[Boolean],
                operator: String,
                value: BigDecimal
                )

object CatalogsProductGroupPricingCurrencyCriteria {
    /**
     * Creates the codec for converting CatalogsProductGroupPricingCurrencyCriteria from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupPricingCurrencyCriteria] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupPricingCurrencyCriteria] = deriveEncoder
}
