package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignBidOptions._

case class CampaignBidOptions (
  appTypeMultipliers: Option[AppTypeMultipliers],
audienceMultipliers: Option[CampaignAudienceMultipliers],
placementMultipliers: Option[PlacementMultipliers])

object CampaignBidOptions {
  import DateTimeCodecs._

  implicit val CampaignBidOptionsCodecJson: CodecJson[CampaignBidOptions] = CodecJson.derive[CampaignBidOptions]
  implicit val CampaignBidOptionsDecoder: EntityDecoder[CampaignBidOptions] = jsonOf[CampaignBidOptions]
  implicit val CampaignBidOptionsEncoder: EntityEncoder[CampaignBidOptions] = jsonEncoderOf[CampaignBidOptions]
}
