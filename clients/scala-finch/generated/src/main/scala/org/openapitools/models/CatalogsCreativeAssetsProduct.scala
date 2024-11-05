package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsProductMetadata
import org.openapitools.models.Pin

/**
 * 
 * @param catalogUnderscoretype 
 * @param metadata 
 * @param pin 
 */
case class CatalogsCreativeAssetsProduct(catalogUnderscoretype: String,
                metadata: CatalogsCreativeAssetsProductMetadata,
                pin: Pin
                )

object CatalogsCreativeAssetsProduct {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsProduct from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsProduct] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsProduct] = deriveEncoder
}
