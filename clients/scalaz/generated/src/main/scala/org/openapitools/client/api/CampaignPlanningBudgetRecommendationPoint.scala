package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningBudgetRecommendationPoint._

case class CampaignPlanningBudgetRecommendationPoint (
  /* Estimation type for this point. */
  estimationType: Option[CampaignPlanningEstimationType],
/* Point estimate data. */
  pointEstimate: Option[CampaignPlanningPointEstimate])

object CampaignPlanningBudgetRecommendationPoint {
  import DateTimeCodecs._

  implicit val CampaignPlanningBudgetRecommendationPointCodecJson: CodecJson[CampaignPlanningBudgetRecommendationPoint] = CodecJson.derive[CampaignPlanningBudgetRecommendationPoint]
  implicit val CampaignPlanningBudgetRecommendationPointDecoder: EntityDecoder[CampaignPlanningBudgetRecommendationPoint] = jsonOf[CampaignPlanningBudgetRecommendationPoint]
  implicit val CampaignPlanningBudgetRecommendationPointEncoder: EntityEncoder[CampaignPlanningBudgetRecommendationPoint] = jsonEncoderOf[CampaignPlanningBudgetRecommendationPoint]
}
