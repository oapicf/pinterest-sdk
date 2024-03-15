package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Order Line Paid Type
 */
case class OrderLinePaidType()

object OrderLinePaidType {
    /**
     * Creates the codec for converting OrderLinePaidType from and to JSON.
     */
    implicit val decoder: Decoder[OrderLinePaidType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderLinePaidType] = deriveEncoder
}
