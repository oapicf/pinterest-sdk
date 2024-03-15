package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * Product counts for a CatalogsProductGroup
 * @param inUnderscorestock 
 * @param outUnderscoreofUnderscorestock 
 * @param preorder 
 * @param total 
 */
case class CatalogsProductGroupProductCounts(inUnderscorestock: BigDecimal,
                outUnderscoreofUnderscorestock: BigDecimal,
                preorder: BigDecimal,
                total: BigDecimal
                )

object CatalogsProductGroupProductCounts {
    /**
     * Creates the codec for converting CatalogsProductGroupProductCounts from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupProductCounts] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupProductCounts] = deriveEncoder
}
