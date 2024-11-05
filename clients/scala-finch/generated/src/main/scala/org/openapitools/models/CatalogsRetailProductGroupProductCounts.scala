package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * Product counts for a Retail CatalogsProductGroup
 * @param catalogUnderscoretype 
 * @param inUnderscorestock 
 * @param outUnderscoreofUnderscorestock 
 * @param preorder 
 * @param total 
 * @param videos 
 */
case class CatalogsRetailProductGroupProductCounts(catalogUnderscoretype: String,
                inUnderscorestock: BigDecimal,
                outUnderscoreofUnderscorestock: BigDecimal,
                preorder: BigDecimal,
                total: BigDecimal,
                videos: Option[BigDecimal]
                )

object CatalogsRetailProductGroupProductCounts {
    /**
     * Creates the codec for converting CatalogsRetailProductGroupProductCounts from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailProductGroupProductCounts] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailProductGroupProductCounts] = deriveEncoder
}
