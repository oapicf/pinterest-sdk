package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningConfidenceLevelAlert._

case class CampaignPlanningConfidenceLevelAlert (
  /* Human-readable context for debugging. Not intended for display to end users. */
  description: Option[String],
/* Reason for the confidence level alert. */
  reason: Option[CampaignPlanningConfidenceLevelAlertReason],
/* Severity of the confidence level alert. */
  severity: Option[CampaignPlanningConfidenceLevelAlertSeverity])

object CampaignPlanningConfidenceLevelAlert {
  import DateTimeCodecs._

  implicit val CampaignPlanningConfidenceLevelAlertCodecJson: CodecJson[CampaignPlanningConfidenceLevelAlert] = CodecJson.derive[CampaignPlanningConfidenceLevelAlert]
  implicit val CampaignPlanningConfidenceLevelAlertDecoder: EntityDecoder[CampaignPlanningConfidenceLevelAlert] = jsonOf[CampaignPlanningConfidenceLevelAlert]
  implicit val CampaignPlanningConfidenceLevelAlertEncoder: EntityEncoder[CampaignPlanningConfidenceLevelAlert] = jsonEncoderOf[CampaignPlanningConfidenceLevelAlert]
}
