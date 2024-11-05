package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * Product counts for a Creative Assets CatalogsProductGroup
 * @param catalogUnderscoretype 
 * @param total 
 * @param videos 
 */
case class CatalogsCreativeAssetsProductGroupProductCounts(catalogUnderscoretype: String,
                total: BigDecimal,
                videos: BigDecimal
                )

object CatalogsCreativeAssetsProductGroupProductCounts {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsProductGroupProductCounts from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsProductGroupProductCounts] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsProductGroupProductCounts] = deriveEncoder
}
