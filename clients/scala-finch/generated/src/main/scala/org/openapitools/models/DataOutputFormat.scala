package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Format of generated report
 */
case class DataOutputFormat()

object DataOutputFormat {
    /**
     * Creates the codec for converting DataOutputFormat from and to JSON.
     */
    implicit val decoder: Decoder[DataOutputFormat] = deriveDecoder
    implicit val encoder: ObjectEncoder[DataOutputFormat] = deriveEncoder
}
