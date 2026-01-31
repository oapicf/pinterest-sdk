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
 * @param bookmark 
 * @param items 
 */
case class ProductGroupPromotionsList200Response(bookmark: Option[String],
                items: Seq[ProductGroupPromotion]
                )

object ProductGroupPromotionsList200Response {
    /**
     * Creates the codec for converting ProductGroupPromotionsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[ProductGroupPromotionsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductGroupPromotionsList200Response] = deriveEncoder
}
