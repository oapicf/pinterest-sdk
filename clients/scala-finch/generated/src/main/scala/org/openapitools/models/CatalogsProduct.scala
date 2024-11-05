package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsProduct
import org.openapitools.models.CatalogsCreativeAssetsProductMetadata
import org.openapitools.models.CatalogsHotelProduct
import org.openapitools.models.CatalogsRetailProduct
import org.openapitools.models.CatalogsType
import org.openapitools.models.Pin

/**
 * Catalogs product for all verticals
 * @param catalogUnderscoretype 
 * @param metadata 
 * @param pin 
 */
case class CatalogsProduct(catalogUnderscoretype: CatalogsType,
                metadata: CatalogsCreativeAssetsProductMetadata,
                pin: Pin
                )

object CatalogsProduct {
    /**
     * Creates the codec for converting CatalogsProduct from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProduct] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProduct] = deriveEncoder
}
