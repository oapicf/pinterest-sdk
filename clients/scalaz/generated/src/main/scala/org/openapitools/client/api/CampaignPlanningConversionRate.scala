package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningConversionRate._

case class CampaignPlanningConversionRate (
  attributionWindows: CampaignPlanningConversionAttribution,
conversionEvent: CampaignPlanningConversionEvent,
/* Conversion rate estimate. Used to translate impressions into conversions for oCPM ads. */
  conversionRate: Float)

object CampaignPlanningConversionRate {
  import DateTimeCodecs._

  implicit val CampaignPlanningConversionRateCodecJson: CodecJson[CampaignPlanningConversionRate] = CodecJson.derive[CampaignPlanningConversionRate]
  implicit val CampaignPlanningConversionRateDecoder: EntityDecoder[CampaignPlanningConversionRate] = jsonOf[CampaignPlanningConversionRate]
  implicit val CampaignPlanningConversionRateEncoder: EntityEncoder[CampaignPlanningConversionRate] = jsonEncoderOf[CampaignPlanningConversionRate]
}
