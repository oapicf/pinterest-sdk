package model

import play.api.libs.json._

/**
  * Campaign configuration for delivery estimates.
  * @param budgetDurationType Duration type of the budget
  * @param dailySpendCap Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
  * @param endDate End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
  * @param lifetimeSpendCap Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
  * @param startDate Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignDeliveryEstimatesCampaign(
  adGroups: List[AdGroupDeliveryEstimates],
  budgetDurationType: BudgetDurationType,
  dailySpendCap: Option[Int],
  endDate: Option[String],
  lifetimeSpendCap: Option[Int],
  objectiveType: DeliveryEstimateObjectiveType,
  startDate: String
)

object CampaignDeliveryEstimatesCampaign {
  implicit lazy val campaignDeliveryEstimatesCampaignJsonFormat: Format[CampaignDeliveryEstimatesCampaign] = Json.format[CampaignDeliveryEstimatesCampaign]
}

