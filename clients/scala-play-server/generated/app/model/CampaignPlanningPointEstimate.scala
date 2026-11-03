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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

