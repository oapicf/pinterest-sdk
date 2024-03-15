package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Metrics availablity, e.g., \"READY\".
 */
case class DataStatus()

object DataStatus {
    /**
     * Creates the codec for converting DataStatus from and to JSON.
     */
    implicit val decoder: Decoder[DataStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[DataStatus] = deriveEncoder
}
