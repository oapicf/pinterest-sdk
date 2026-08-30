package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignBidOptions._

case class CampaignBidOptions (
  /* Age bucket multipliers for bid adjustments. */
  ageBucketMultipliers: Option[AgeBucketMultipliers],
/* App type multipliers for bid adjustments. */
  appTypeMultipliers: Option[AppTypeMultipliers],
/* Audience multipliers for bid adjustments. */
  audienceMultipliers: Option[CampaignAudienceMultipliers],
/* The time window for frequency bid multipliers. */
  freqBidMultiplierTimeWindow: Option[FreqBidMultiplierTimeWindow],
/* Frequency multipliers for bid adjustments. */
  frequencyMultipliers: Option[FrequencyMultipliers],
/* Gender multipliers for bid adjustments. */
  genderMultipliers: Option[GenderMultipliers],
/* Placement multipliers for bid adjustments. */
  placementMultipliers: Option[PlacementMultipliers])

object CampaignBidOptions {
  import DateTimeCodecs._

  implicit val CampaignBidOptionsCodecJson: CodecJson[CampaignBidOptions] = CodecJson.derive[CampaignBidOptions]
  implicit val CampaignBidOptionsDecoder: EntityDecoder[CampaignBidOptions] = jsonOf[CampaignBidOptions]
  implicit val CampaignBidOptionsEncoder: EntityEncoder[CampaignBidOptions] = jsonEncoderOf[CampaignBidOptions]
}
