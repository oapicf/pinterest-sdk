package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Ad targeting types for MMM report
 */
case class MMMReportingTargetingType()

object MMMReportingTargetingType {
    /**
     * Creates the codec for converting MMMReportingTargetingType from and to JSON.
     */
    implicit val decoder: Decoder[MMMReportingTargetingType] = deriveDecoder
    implicit val encoder: ObjectEncoder[MMMReportingTargetingType] = deriveEncoder
}
