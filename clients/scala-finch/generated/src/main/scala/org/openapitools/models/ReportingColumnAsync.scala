package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Reporting columns
 */
case class ReportingColumnAsync()

object ReportingColumnAsync {
    /**
     * Creates the codec for converting ReportingColumnAsync from and to JSON.
     */
    implicit val decoder: Decoder[ReportingColumnAsync] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReportingColumnAsync] = deriveEncoder
}
