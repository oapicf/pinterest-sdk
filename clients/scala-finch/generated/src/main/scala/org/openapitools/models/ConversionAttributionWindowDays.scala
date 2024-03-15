package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class ConversionAttributionWindowDays()

object ConversionAttributionWindowDays {
    /**
     * Creates the codec for converting ConversionAttributionWindowDays from and to JSON.
     */
    implicit val decoder: Decoder[ConversionAttributionWindowDays] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionAttributionWindowDays] = deriveEncoder
}
