package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductMetadata
import org.openapitools.models.Pin

/**
 * 
 * @param metadata 
 * @param pin 
 */
case class CatalogsProduct(metadata: CatalogsProductMetadata,
                pin: Pin
                )

object CatalogsProduct {
    /**
     * Creates the codec for converting CatalogsProduct from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProduct] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProduct] = deriveEncoder
}
