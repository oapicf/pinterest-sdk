package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Country ID from ISO 3166-1 alpha-2.
 */
case class AdCountry()

object AdCountry {
    /**
     * Creates the codec for converting AdCountry from and to JSON.
     */
    implicit val decoder: Decoder[AdCountry] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdCountry] = deriveEncoder
}
