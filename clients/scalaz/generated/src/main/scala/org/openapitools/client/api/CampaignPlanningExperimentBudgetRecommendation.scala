package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningExperimentBudgetRecommendation._

case class CampaignPlanningExperimentBudgetRecommendation (
  /* Recommended budget for this experiment version. */
  budgetRecommendation: Option[Integer],
/* Recommended lifetime days for this experiment. */
  lifetimeDaysRecommendation: Option[Integer],
/* Point estimations for this experiment version. */
  pointEstimations: Option[List[CampaignPlanningBudgetRecommendationPoint]],
/* Version identifier for the experiment. */
  versionId: Option[String])

object CampaignPlanningExperimentBudgetRecommendation {
  import DateTimeCodecs._

  implicit val CampaignPlanningExperimentBudgetRecommendationCodecJson: CodecJson[CampaignPlanningExperimentBudgetRecommendation] = CodecJson.derive[CampaignPlanningExperimentBudgetRecommendation]
  implicit val CampaignPlanningExperimentBudgetRecommendationDecoder: EntityDecoder[CampaignPlanningExperimentBudgetRecommendation] = jsonOf[CampaignPlanningExperimentBudgetRecommendation]
  implicit val CampaignPlanningExperimentBudgetRecommendationEncoder: EntityEncoder[CampaignPlanningExperimentBudgetRecommendation] = jsonEncoderOf[CampaignPlanningExperimentBudgetRecommendation]
}
