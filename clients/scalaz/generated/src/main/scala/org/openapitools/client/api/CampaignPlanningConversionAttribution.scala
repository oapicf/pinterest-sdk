package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningConversionAttribution._

case class CampaignPlanningConversionAttribution (
  /* Number of days to use as the conversion attribution window for a pin click action. */
  clickWindowDays: Option[CampaignPlanningConversionAttributionWindowDays],
/* Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. */
  engagementWindowDays: Option[CampaignPlanningConversionAttributionWindowDays],
/* Number of days to use as the conversion attribution window for a view action. */
  viewWindowDays: Option[CampaignPlanningConversionAttributionWindowDays])

object CampaignPlanningConversionAttribution {
  import DateTimeCodecs._

  implicit val CampaignPlanningConversionAttributionCodecJson: CodecJson[CampaignPlanningConversionAttribution] = CodecJson.derive[CampaignPlanningConversionAttribution]
  implicit val CampaignPlanningConversionAttributionDecoder: EntityDecoder[CampaignPlanningConversionAttribution] = jsonOf[CampaignPlanningConversionAttribution]
  implicit val CampaignPlanningConversionAttributionEncoder: EntityEncoder[CampaignPlanningConversionAttribution] = jsonEncoderOf[CampaignPlanningConversionAttribution]
}
