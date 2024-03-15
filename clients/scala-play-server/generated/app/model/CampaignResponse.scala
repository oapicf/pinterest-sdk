package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignResponse.
  * @param id Campaign ID.
  * @param adAccountId Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  * @param name Campaign name.
  * @param lifetimeSpendCap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  * @param dailySpendCap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  * @param orderLineId Order line ID that appears on the invoice.
  * @param startTime Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  * @param endTime Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  * @param createdTime Campaign creation time. Unix timestamp in seconds.
  * @param updatedTime UTC timestamp. Last update time.
  * @param `type` Always \"campaign\".
  * @param isFlexibleDailyBudgets Determines if a campaign has flexible daily budgets setup.
  * @param isCampaignBudgetOptimization Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CampaignResponse(
  id: Option[String],
  adAccountId: Option[String],
  name: Option[String],
  status: Option[EntityStatus],
  lifetimeSpendCap: Option[Int],
  dailySpendCap: Option[Int],
  orderLineId: Option[String],
  trackingUrls: Option[AdCommonTrackingUrls],
  startTime: Option[Int],
  endTime: Option[Int],
  summaryStatus: Option[CampaignSummaryStatus],
  objectiveType: Option[ObjectiveType],
  createdTime: Option[Int],
  updatedTime: Option[Int],
  `type`: Option[String],
  isFlexibleDailyBudgets: Option[Boolean],
  isCampaignBudgetOptimization: Option[Boolean]
)

object CampaignResponse {
  implicit lazy val campaignResponseJsonFormat: Format[CampaignResponse] = Json.format[CampaignResponse]
}

