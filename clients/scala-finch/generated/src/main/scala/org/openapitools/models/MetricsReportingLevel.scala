package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Level of the reporting request
 */
case class MetricsReportingLevel()

object MetricsReportingLevel {
    /**
     * Creates the codec for converting MetricsReportingLevel from and to JSON.
     */
    implicit val decoder: Decoder[MetricsReportingLevel] = deriveDecoder
    implicit val encoder: ObjectEncoder[MetricsReportingLevel] = deriveEncoder
}
