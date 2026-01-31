package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * List of source platforms for a conversion event.
 */
case class SourcePlatformOptions()

object SourcePlatformOptions {
    /**
     * Creates the codec for converting SourcePlatformOptions from and to JSON.
     */
    implicit val decoder: Decoder[SourcePlatformOptions] = deriveDecoder
    implicit val encoder: ObjectEncoder[SourcePlatformOptions] = deriveEncoder
}
