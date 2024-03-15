package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Default availability for products in a feed.
 */
case class ProductAvailabilityType()

object ProductAvailabilityType {
    /**
     * Creates the codec for converting ProductAvailabilityType from and to JSON.
     */
    implicit val decoder: Decoder[ProductAvailabilityType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductAvailabilityType] = deriveEncoder
}
