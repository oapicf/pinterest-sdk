package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningBudgetRecommendation._

case class CampaignPlanningBudgetRecommendation (
  /* The recommended budget amount. */
  budgetRecommendation: Option[Integer],
/* List of experimental budget recommendations. */
  experimentCampaignBudgetRecommendation: Option[List[CampaignPlanningExperimentBudgetRecommendation]],
/* Recommended number of days for the campaign lifetime. */
  lifetimeDaysRecommendation: Option[Integer],
/* List of point estimations for different budget scenarios. */
  pointEstimations: Option[List[CampaignPlanningBudgetRecommendationPoint]])

object CampaignPlanningBudgetRecommendation {
  import DateTimeCodecs._

  implicit val CampaignPlanningBudgetRecommendationCodecJson: CodecJson[CampaignPlanningBudgetRecommendation] = CodecJson.derive[CampaignPlanningBudgetRecommendation]
  implicit val CampaignPlanningBudgetRecommendationDecoder: EntityDecoder[CampaignPlanningBudgetRecommendation] = jsonOf[CampaignPlanningBudgetRecommendation]
  implicit val CampaignPlanningBudgetRecommendationEncoder: EntityEncoder[CampaignPlanningBudgetRecommendation] = jsonEncoderOf[CampaignPlanningBudgetRecommendation]
}
