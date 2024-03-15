package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Product availability.
 */
case class NonNullableProductAvailabilityType()

object NonNullableProductAvailabilityType {
    /**
     * Creates the codec for converting NonNullableProductAvailabilityType from and to JSON.
     */
    implicit val decoder: Decoder[NonNullableProductAvailabilityType] = deriveDecoder
    implicit val encoder: ObjectEncoder[NonNullableProductAvailabilityType] = deriveEncoder
}
