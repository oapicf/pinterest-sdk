package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Reporting targeting type for campaigns
 */
case class AdsAnalyticsCampaignTargetingType()

object AdsAnalyticsCampaignTargetingType {
    /**
     * Creates the codec for converting AdsAnalyticsCampaignTargetingType from and to JSON.
     */
    implicit val decoder: Decoder[AdsAnalyticsCampaignTargetingType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsAnalyticsCampaignTargetingType] = deriveEncoder
}
