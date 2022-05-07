package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Summary status for campaign
 */
case class CampaignSummaryStatus()

object CampaignSummaryStatus {
    /**
     * Creates the codec for converting CampaignSummaryStatus from and to JSON.
     */
    implicit val decoder: Decoder[CampaignSummaryStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignSummaryStatus] = deriveEncoder
}
