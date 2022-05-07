package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Reporting targeting type
 */
case class AdsAnalyticsTargetingType()

object AdsAnalyticsTargetingType {
    /**
     * Creates the codec for converting AdsAnalyticsTargetingType from and to JSON.
     */
    implicit val decoder: Decoder[AdsAnalyticsTargetingType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsAnalyticsTargetingType] = deriveEncoder
}
