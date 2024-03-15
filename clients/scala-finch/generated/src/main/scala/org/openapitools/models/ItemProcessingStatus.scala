package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The status of the item processing record
 */
case class ItemProcessingStatus()

object ItemProcessingStatus {
    /**
     * Creates the codec for converting ItemProcessingStatus from and to JSON.
     */
    implicit val decoder: Decoder[ItemProcessingStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemProcessingStatus] = deriveEncoder
}
