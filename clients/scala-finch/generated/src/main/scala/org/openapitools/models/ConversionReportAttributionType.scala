package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Attribution type. Refers to the Pinterest Tag endpoints
 */
case class ConversionReportAttributionType()

object ConversionReportAttributionType {
    /**
     * Creates the codec for converting ConversionReportAttributionType from and to JSON.
     */
    implicit val decoder: Decoder[ConversionReportAttributionType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionReportAttributionType] = deriveEncoder
}
