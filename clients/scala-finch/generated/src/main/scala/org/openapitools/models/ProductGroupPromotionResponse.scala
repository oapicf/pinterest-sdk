package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ProductGroupPromotionResponseItem
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 */
case class ProductGroupPromotionResponse(items: Option[Seq[ProductGroupPromotionResponseItem]]
                )

object ProductGroupPromotionResponse {
    /**
     * Creates the codec for converting ProductGroupPromotionResponse from and to JSON.
     */
    implicit val decoder: Decoder[ProductGroupPromotionResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductGroupPromotionResponse] = deriveEncoder
}
