package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsRetailProductMetadata
import org.openapitools.models.Pin

/**
 * 
 * @param catalogUnderscoretype 
 * @param metadata 
 * @param pin 
 */
case class CatalogsRetailProduct(catalogUnderscoretype: String,
                metadata: CatalogsRetailProductMetadata,
                pin: Pin
                )

object CatalogsRetailProduct {
    /**
     * Creates the codec for converting CatalogsRetailProduct from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailProduct] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailProduct] = deriveEncoder
}
