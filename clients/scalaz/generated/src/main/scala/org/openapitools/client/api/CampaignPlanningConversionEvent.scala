package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningConversionEvent._

case class CampaignPlanningConversionEvent (
  
object CampaignPlanningConversionEvent {
  import DateTimeCodecs._

  implicit val CampaignPlanningConversionEventCodecJson: CodecJson[CampaignPlanningConversionEvent] = CodecJson.derive[CampaignPlanningConversionEvent]
  implicit val CampaignPlanningConversionEventDecoder: EntityDecoder[CampaignPlanningConversionEvent] = jsonOf[CampaignPlanningConversionEvent]
  implicit val CampaignPlanningConversionEventEncoder: EntityEncoder[CampaignPlanningConversionEvent] = jsonEncoderOf[CampaignPlanningConversionEvent]
}
