package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ProductGroupPromotionCreateRequestElement
import scala.collection.immutable.Seq

/**
 * 
 * @param adUnderscoregroupUnderscoreid ID of the Ad Group the Product Group Promotion belongs to.
 * @param productUnderscoregroupUnderscorepromotion 
 */
case class ProductGroupPromotionCreateRequest(adUnderscoregroupUnderscoreid: String,
                productUnderscoregroupUnderscorepromotion: Seq[ProductGroupPromotionCreateRequestElement]
                )

object ProductGroupPromotionCreateRequest {
    /**
     * Creates the codec for converting ProductGroupPromotionCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[ProductGroupPromotionCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductGroupPromotionCreateRequest] = deriveEncoder
}
