package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Ad group pacing delivery type
 */
case class PacingDeliveryType()

object PacingDeliveryType {
    /**
     * Creates the codec for converting PacingDeliveryType from and to JSON.
     */
    implicit val decoder: Decoder[PacingDeliveryType] = deriveDecoder
    implicit val encoder: ObjectEncoder[PacingDeliveryType] = deriveEncoder
}
