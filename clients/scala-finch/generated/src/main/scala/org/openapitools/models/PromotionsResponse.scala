package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PromotionArrayElement
import scala.collection.immutable.Seq

/**
 * 
 * @param promotions 
 */
case class PromotionsResponse(promotions: Option[Seq[PromotionArrayElement]]
                )

object PromotionsResponse {
    /**
     * Creates the codec for converting PromotionsResponse from and to JSON.
     */
    implicit val decoder: Decoder[PromotionsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[PromotionsResponse] = deriveEncoder
}
