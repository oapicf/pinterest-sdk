package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Order Line Status
 */
case class OrderLineStatus()

object OrderLineStatus {
    /**
     * Creates the codec for converting OrderLineStatus from and to JSON.
     */
    implicit val decoder: Decoder[OrderLineStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderLineStatus] = deriveEncoder
}
