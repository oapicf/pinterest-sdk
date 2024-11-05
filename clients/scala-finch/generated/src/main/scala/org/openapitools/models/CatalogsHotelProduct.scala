package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelProductMetadata
import org.openapitools.models.Pin

/**
 * 
 * @param catalogUnderscoretype 
 * @param metadata 
 * @param pin 
 */
case class CatalogsHotelProduct(catalogUnderscoretype: String,
                metadata: CatalogsHotelProductMetadata,
                pin: Pin
                )

object CatalogsHotelProduct {
    /**
     * Creates the codec for converting CatalogsHotelProduct from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelProduct] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelProduct] = deriveEncoder
}
