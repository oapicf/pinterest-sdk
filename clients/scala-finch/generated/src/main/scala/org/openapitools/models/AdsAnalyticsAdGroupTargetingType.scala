package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Reporting targeting type for ad groups
 */
case class AdsAnalyticsAdGroupTargetingType()

object AdsAnalyticsAdGroupTargetingType {
    /**
     * Creates the codec for converting AdsAnalyticsAdGroupTargetingType from and to JSON.
     */
    implicit val decoder: Decoder[AdsAnalyticsAdGroupTargetingType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsAnalyticsAdGroupTargetingType] = deriveEncoder
}
