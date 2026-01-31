package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Exception
import org.openapitools.models.PromotionResponse

/**
 * 
 * @param data 
 * @param exception 
 */
case class PromotionArrayElement(data: Option[PromotionResponse],
                exception: Option[Exception]
                )

object PromotionArrayElement {
    /**
     * Creates the codec for converting PromotionArrayElement from and to JSON.
     */
    implicit val decoder: Decoder[PromotionArrayElement] = deriveDecoder
    implicit val encoder: ObjectEncoder[PromotionArrayElement] = deriveEncoder
}
