package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Exception
import org.openapitools.models.ProductGroupPromotion
import scala.collection.immutable.Seq

/**
 * 
 * @param data 
 * @param exceptions 
 */
case class ProductGroupPromotionResponseItem(data: Option[ProductGroupPromotion],
                exceptions: Option[Seq[Exception]]
                )

object ProductGroupPromotionResponseItem {
    /**
     * Creates the codec for converting ProductGroupPromotionResponseItem from and to JSON.
     */
    implicit val decoder: Decoder[ProductGroupPromotionResponseItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductGroupPromotionResponseItem] = deriveEncoder
}
