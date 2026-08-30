package model

import play.api.libs.json._

/**
  * Experimental budget recommendation for a single experiment version.
  * @param budgetRecommendation Recommended budget for this experiment version.
  * @param lifetimeDaysRecommendation Recommended lifetime days for this experiment.
  * @param pointEstimations Point estimations for this experiment version.
  * @param versionId Version identifier for the experiment.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignPlanningExperimentBudgetRecommendation(
  budgetRecommendation: Option[Int],
  lifetimeDaysRecommendation: Option[Int],
  pointEstimations: Option[List[CampaignPlanningBudgetRecommendationPoint]],
  versionId: Option[String]
)

object CampaignPlanningExperimentBudgetRecommendation {
  implicit lazy val campaignPlanningExperimentBudgetRecommendationJsonFormat: Format[CampaignPlanningExperimentBudgetRecommendation] = Json.format[CampaignPlanningExperimentBudgetRecommendation]
}

