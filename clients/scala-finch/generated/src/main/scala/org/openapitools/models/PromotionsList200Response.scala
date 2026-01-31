package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PromotionResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class PromotionsList200Response(bookmark: Option[String],
                items: Seq[PromotionResponse]
                )

object PromotionsList200Response {
    /**
     * Creates the codec for converting PromotionsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[PromotionsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[PromotionsList200Response] = deriveEncoder
}
