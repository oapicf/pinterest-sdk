package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Creation fields
 * @param conversionUnderscoremetricsUnderscoreready Are conversion metrics ready?
 * @param nonUnderscoreconversionUnderscoremetricsUnderscoreready Are non-conversion metrics ready?
 */
case class BookClosedResponse(conversionUnderscoremetricsUnderscoreready: Option[Boolean],
                nonUnderscoreconversionUnderscoremetricsUnderscoreready: Option[Boolean]
                )

object BookClosedResponse {
    /**
     * Creates the codec for converting BookClosedResponse from and to JSON.
     */
    implicit val decoder: Decoder[BookClosedResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[BookClosedResponse] = deriveEncoder
}
