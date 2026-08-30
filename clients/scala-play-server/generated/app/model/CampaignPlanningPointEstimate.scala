package model

import play.api.libs.json._

/**
  * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
  * @param budget The budget value of the point.
  * @param doubleY Y value as a decimal.
  * @param maxY The maximum Y value of the point.
  * @param minY The minimum Y value of the point.
  * @param y The expected Y value of the point.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignPlanningPointEstimate(
  budget: Int,
  doubleY: Double,
  maxY: Int,
  minY: Int,
  y: Int
)

object CampaignPlanningPointEstimate {
  implicit lazy val campaignPlanningPointEstimateJsonFormat: Format[CampaignPlanningPointEstimate] = Json.format[CampaignPlanningPointEstimate]
}

