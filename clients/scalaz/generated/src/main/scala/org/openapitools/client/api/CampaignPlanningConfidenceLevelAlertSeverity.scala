package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningConfidenceLevelAlertSeverity._

case class CampaignPlanningConfidenceLevelAlertSeverity (
  
object CampaignPlanningConfidenceLevelAlertSeverity {
  import DateTimeCodecs._

  implicit val CampaignPlanningConfidenceLevelAlertSeverityCodecJson: CodecJson[CampaignPlanningConfidenceLevelAlertSeverity] = CodecJson.derive[CampaignPlanningConfidenceLevelAlertSeverity]
  implicit val CampaignPlanningConfidenceLevelAlertSeverityDecoder: EntityDecoder[CampaignPlanningConfidenceLevelAlertSeverity] = jsonOf[CampaignPlanningConfidenceLevelAlertSeverity]
  implicit val CampaignPlanningConfidenceLevelAlertSeverityEncoder: EntityEncoder[CampaignPlanningConfidenceLevelAlertSeverity] = jsonEncoderOf[CampaignPlanningConfidenceLevelAlertSeverity]
}
