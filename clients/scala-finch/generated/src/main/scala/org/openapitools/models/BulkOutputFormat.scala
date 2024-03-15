package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Bulk file output format
 */
case class BulkOutputFormat()

object BulkOutputFormat {
    /**
     * Creates the codec for converting BulkOutputFormat from and to JSON.
     */
    implicit val decoder: Decoder[BulkOutputFormat] = deriveDecoder
    implicit val encoder: ObjectEncoder[BulkOutputFormat] = deriveEncoder
}
