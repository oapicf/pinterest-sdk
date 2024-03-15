package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Conversion report time type
 */
case class ConversionReportTimeType()

object ConversionReportTimeType {
    /**
     * Creates the codec for converting ConversionReportTimeType from and to JSON.
     */
    implicit val decoder: Decoder[ConversionReportTimeType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionReportTimeType] = deriveEncoder
}
