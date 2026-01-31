package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Conversion Product Reporting columns
 */
case class ConversionProductReportingColumn()

object ConversionProductReportingColumn {
    /**
     * Creates the codec for converting ConversionProductReportingColumn from and to JSON.
     */
    implicit val decoder: Decoder[ConversionProductReportingColumn] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionProductReportingColumn] = deriveEncoder
}
