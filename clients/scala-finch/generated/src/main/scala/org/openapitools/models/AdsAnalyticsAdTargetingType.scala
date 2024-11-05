package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Reporting targeting type for ads
 */
case class AdsAnalyticsAdTargetingType()

object AdsAnalyticsAdTargetingType {
    /**
     * Creates the codec for converting AdsAnalyticsAdTargetingType from and to JSON.
     */
    implicit val decoder: Decoder[AdsAnalyticsAdTargetingType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsAnalyticsAdTargetingType] = deriveEncoder
}
