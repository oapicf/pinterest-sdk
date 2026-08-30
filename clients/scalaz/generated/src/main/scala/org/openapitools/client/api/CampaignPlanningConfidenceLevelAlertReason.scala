package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningConfidenceLevelAlertReason._

case class CampaignPlanningConfidenceLevelAlertReason (
  
object CampaignPlanningConfidenceLevelAlertReason {
  import DateTimeCodecs._

  implicit val CampaignPlanningConfidenceLevelAlertReasonCodecJson: CodecJson[CampaignPlanningConfidenceLevelAlertReason] = CodecJson.derive[CampaignPlanningConfidenceLevelAlertReason]
  implicit val CampaignPlanningConfidenceLevelAlertReasonDecoder: EntityDecoder[CampaignPlanningConfidenceLevelAlertReason] = jsonOf[CampaignPlanningConfidenceLevelAlertReason]
  implicit val CampaignPlanningConfidenceLevelAlertReasonEncoder: EntityEncoder[CampaignPlanningConfidenceLevelAlertReason] = jsonEncoderOf[CampaignPlanningConfidenceLevelAlertReason]
}
