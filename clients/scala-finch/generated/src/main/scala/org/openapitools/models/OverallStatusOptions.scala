package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Overall status of event quality score.
 */
case class OverallStatusOptions()

object OverallStatusOptions {
    /**
     * Creates the codec for converting OverallStatusOptions from and to JSON.
     */
    implicit val decoder: Decoder[OverallStatusOptions] = deriveDecoder
    implicit val encoder: ObjectEncoder[OverallStatusOptions] = deriveEncoder
}
