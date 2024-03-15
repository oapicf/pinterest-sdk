package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Granularity
 */
case class Granularity()

object Granularity {
    /**
     * Creates the codec for converting Granularity from and to JSON.
     */
    implicit val decoder: Decoder[Granularity] = deriveDecoder
    implicit val encoder: ObjectEncoder[Granularity] = deriveEncoder
}
