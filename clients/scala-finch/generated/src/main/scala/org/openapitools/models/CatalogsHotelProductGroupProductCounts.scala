package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * Product counts for a Hotel CatalogsProductGroup
 * @param catalogUnderscoretype 
 * @param total 
 */
case class CatalogsHotelProductGroupProductCounts(catalogUnderscoretype: String,
                total: BigDecimal
                )

object CatalogsHotelProductGroupProductCounts {
    /**
     * Creates the codec for converting CatalogsHotelProductGroupProductCounts from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelProductGroupProductCounts] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelProductGroupProductCounts] = deriveEncoder
}
