package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningConversionAttributionWindowDays._

case class CampaignPlanningConversionAttributionWindowDays (
  
object CampaignPlanningConversionAttributionWindowDays {
  import DateTimeCodecs._

  implicit val CampaignPlanningConversionAttributionWindowDaysCodecJson: CodecJson[CampaignPlanningConversionAttributionWindowDays] = CodecJson.derive[CampaignPlanningConversionAttributionWindowDays]
  implicit val CampaignPlanningConversionAttributionWindowDaysDecoder: EntityDecoder[CampaignPlanningConversionAttributionWindowDays] = jsonOf[CampaignPlanningConversionAttributionWindowDays]
  implicit val CampaignPlanningConversionAttributionWindowDaysEncoder: EntityEncoder[CampaignPlanningConversionAttributionWindowDays] = jsonEncoderOf[CampaignPlanningConversionAttributionWindowDays]
}
