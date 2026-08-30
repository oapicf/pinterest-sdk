package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningCurveEstimate._

case class CampaignPlanningCurveEstimate (
  /* Estimation type for campaign planning estimated curve */
  estimationType: Option[CampaignPlanningEstimationType],
/* The estimation points that make up the estimated curve. */
  points: Option[List[CampaignPlanningPointEstimate]])

object CampaignPlanningCurveEstimate {
  import DateTimeCodecs._

  implicit val CampaignPlanningCurveEstimateCodecJson: CodecJson[CampaignPlanningCurveEstimate] = CodecJson.derive[CampaignPlanningCurveEstimate]
  implicit val CampaignPlanningCurveEstimateDecoder: EntityDecoder[CampaignPlanningCurveEstimate] = jsonOf[CampaignPlanningCurveEstimate]
  implicit val CampaignPlanningCurveEstimateEncoder: EntityEncoder[CampaignPlanningCurveEstimate] = jsonEncoderOf[CampaignPlanningCurveEstimate]
}
