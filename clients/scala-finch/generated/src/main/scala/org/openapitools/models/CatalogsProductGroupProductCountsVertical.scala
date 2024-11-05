package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.CatalogsCreativeAssetsProductGroupProductCounts
import org.openapitools.models.CatalogsHotelProductGroupProductCounts
import org.openapitools.models.CatalogsRetailProductGroupProductCounts
import org.openapitools.models.CatalogsType

/**
 * Product counts for a CatalogsProductGroup
 * @param catalogUnderscoretype 
 * @param inUnderscorestock 
 * @param outUnderscoreofUnderscorestock 
 * @param preorder 
 * @param total 
 * @param videos 
 */
case class CatalogsProductGroupProductCountsVertical(catalogUnderscoretype: CatalogsType,
                inUnderscorestock: BigDecimal,
                outUnderscoreofUnderscorestock: BigDecimal,
                preorder: BigDecimal,
                total: BigDecimal,
                videos: BigDecimal
                )

object CatalogsProductGroupProductCountsVertical {
    /**
     * Creates the codec for converting CatalogsProductGroupProductCountsVertical from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupProductCountsVertical] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupProductCountsVertical] = deriveEncoder
}
