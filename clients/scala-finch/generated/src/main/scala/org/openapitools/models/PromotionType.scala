package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Determines the displayed promotion text along with what parameters (if any) are needed to complete the template. This list is not finalized, and will be updated as new types are supported.
 */
case class PromotionType()

object PromotionType {
    /**
     * Creates the codec for converting PromotionType from and to JSON.
     */
    implicit val decoder: Decoder[PromotionType] = deriveDecoder
    implicit val encoder: ObjectEncoder[PromotionType] = deriveEncoder
}
