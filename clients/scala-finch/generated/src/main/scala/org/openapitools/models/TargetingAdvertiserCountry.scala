package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Advertiser's ISO two character country code.
 */
case class TargetingAdvertiserCountry()

object TargetingAdvertiserCountry {
    /**
     * Creates the codec for converting TargetingAdvertiserCountry from and to JSON.
     */
    implicit val decoder: Decoder[TargetingAdvertiserCountry] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingAdvertiserCountry] = deriveEncoder
}
