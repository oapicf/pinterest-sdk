package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.
 */
case class PacingDeliveryType()

object PacingDeliveryType {
    /**
     * Creates the codec for converting PacingDeliveryType from and to JSON.
     */
    implicit val decoder: Decoder[PacingDeliveryType] = deriveDecoder
    implicit val encoder: ObjectEncoder[PacingDeliveryType] = deriveEncoder
}
