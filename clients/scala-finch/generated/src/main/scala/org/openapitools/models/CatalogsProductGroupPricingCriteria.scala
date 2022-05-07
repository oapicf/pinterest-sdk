package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param inclusion 
 * @param values 
 * @param negated 
 */
case class CatalogsProductGroupPricingCriteria(inclusion: Boolean,
                values: BigDecimal,
                negated: Boolean
                )

object CatalogsProductGroupPricingCriteria {
    /**
     * Creates the codec for converting CatalogsProductGroupPricingCriteria from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupPricingCriteria] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupPricingCriteria] = deriveEncoder
}
