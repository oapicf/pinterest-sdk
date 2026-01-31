package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The `HOUR` enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.
 */
case class Granularity()

object Granularity {
    /**
     * Creates the codec for converting Granularity from and to JSON.
     */
    implicit val decoder: Decoder[Granularity] = deriveDecoder
    implicit val encoder: ObjectEncoder[Granularity] = deriveEncoder
}
