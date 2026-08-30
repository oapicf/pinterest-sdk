package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningPointEstimate._

case class CampaignPlanningPointEstimate (
  /* The budget value of the point. */
  budget: Integer,
/* Y value as a decimal. */
  doubleY: Double,
/* The maximum Y value of the point. */
  maxY: Integer,
/* The minimum Y value of the point. */
  minY: Integer,
/* The expected Y value of the point. */
  y: Integer)

object CampaignPlanningPointEstimate {
  import DateTimeCodecs._

  implicit val CampaignPlanningPointEstimateCodecJson: CodecJson[CampaignPlanningPointEstimate] = CodecJson.derive[CampaignPlanningPointEstimate]
  implicit val CampaignPlanningPointEstimateDecoder: EntityDecoder[CampaignPlanningPointEstimate] = jsonOf[CampaignPlanningPointEstimate]
  implicit val CampaignPlanningPointEstimateEncoder: EntityEncoder[CampaignPlanningPointEstimate] = jsonEncoderOf[CampaignPlanningPointEstimate]
}
