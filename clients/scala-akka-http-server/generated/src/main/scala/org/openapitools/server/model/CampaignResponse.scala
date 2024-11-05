package org.openapitools.server.model


/**
 * @param id Campaign ID. for example: ''549755885175''
 * @param adAccountId Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. for example: ''549755885175''
 * @param name Campaign name. for example: ''ACME Tools''
 * @param status  for example: ''null''
 * @param lifetimeSpendCap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. for example: ''1432744744''
 * @param dailySpendCap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. for example: ''1432744744''
 * @param orderLineId Order line ID that appears on the invoice. for example: ''549755885175''
 * @param trackingUrls  for example: ''null''
 * @param startTime Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. for example: ''1580865126''
 * @param endTime Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. for example: ''1644023526''
 * @param isFlexibleDailyBudgets Determine if a campaign has flexible daily budgets setup. for example: ''true''
 * @param objectiveType  for example: ''null''
 * @param createdTime Campaign creation time. Unix timestamp in seconds. for example: ''1432744744''
 * @param updatedTime UTC timestamp. Last update time. for example: ''1432744744''
 * @param `type` Always \"campaign\". for example: ''campaign''
 * @param isCampaignBudgetOptimization Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. for example: ''true''
 * @param summaryStatus  for example: ''null''
*/
final case class CampaignResponse (
  id: Option[String] = None,
  adAccountId: Option[String] = None,
  name: Option[String] = None,
  status: Option[EntityStatus] = None,
  lifetimeSpendCap: Option[Int] = None,
  dailySpendCap: Option[Int] = None,
  orderLineId: Option[String] = None,
  trackingUrls: Option[TrackingUrls] = None,
  startTime: Option[Int] = None,
  endTime: Option[Int] = None,
  isFlexibleDailyBudgets: Option[Boolean] = None,
  objectiveType: Option[ObjectiveType] = None,
  createdTime: Option[Int] = None,
  updatedTime: Option[Int] = None,
  `type`: Option[String] = None,
  isCampaignBudgetOptimization: Option[Boolean] = None,
  summaryStatus: Option[CampaignSummaryStatus] = None
)

