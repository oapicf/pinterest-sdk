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
 * @param operator 
 * @param value 
 * @param currency 
 * @param negated 
 */
case class CatalogsProductGroupPricingCurrencyCriteria(operator: String,
                value: BigDecimal,
                currency: NonNullableCatalogsCurrency,
                negated: Option[Boolean]
                )

object CatalogsProductGroupPricingCurrencyCriteria {
    /**
     * Creates the codec for converting CatalogsProductGroupPricingCurrencyCriteria from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupPricingCurrencyCriteria] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupPricingCurrencyCriteria] = deriveEncoder
}
