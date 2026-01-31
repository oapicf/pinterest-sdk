package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/) Specify the timezone to be applied for the reporting.
 */
case class ReportingTimeZone()

object ReportingTimeZone {
    /**
     * Creates the codec for converting ReportingTimeZone from and to JSON.
     */
    implicit val decoder: Decoder[ReportingTimeZone] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReportingTimeZone] = deriveEncoder
}
