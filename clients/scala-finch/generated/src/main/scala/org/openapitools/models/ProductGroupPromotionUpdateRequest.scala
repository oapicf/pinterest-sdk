package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ProductGroupPromotion
import scala.collection.immutable.Seq

/**
 * 
 * @param adUnderscoregroupUnderscoreid ID of the ad group the product group belongs to.
 * @param productUnderscoregroupUnderscorepromotion 
 */
case class ProductGroupPromotionUpdateRequest(adUnderscoregroupUnderscoreid: String,
                productUnderscoregroupUnderscorepromotion: Seq[ProductGroupPromotion]
                )

object ProductGroupPromotionUpdateRequest {
    /**
     * Creates the codec for converting ProductGroupPromotionUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[ProductGroupPromotionUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductGroupPromotionUpdateRequest] = deriveEncoder
}
