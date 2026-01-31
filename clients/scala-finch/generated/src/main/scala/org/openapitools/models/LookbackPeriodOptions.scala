package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Days in lookback window in the GET Conversion EQS response.
 */
case class LookbackPeriodOptions()

object LookbackPeriodOptions {
    /**
     * Creates the codec for converting LookbackPeriodOptions from and to JSON.
     */
    implicit val decoder: Decoder[LookbackPeriodOptions] = deriveDecoder
    implicit val encoder: ObjectEncoder[LookbackPeriodOptions] = deriveEncoder
}
