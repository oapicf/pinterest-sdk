package org.openapitools.server.model


/**
 * @param adAccountId Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. for example: ''549755885175''
 * @param dailySpendCap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. for example: ''1432744744''
 * @param endTime Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. for example: ''1644023526''
 * @param isAutomatedCampaign Specifies whether the campaign was created in the automated campaign flow for example: ''true''
 * @param isFlexibleDailyBudgets Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". for example: ''true''
 * @param lifetimeSpendCap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. for example: ''1432744744''
 * @param name Campaign name. for example: ''ACME Tools''
 * @param orderLineId Order line ID that appears on the invoice. for example: ''549755885175''
 * @param startTime Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. for example: ''1580865126''
 * @param status  for example: ''null''
 * @param trackingUrls  for example: ''null''
 * @param defaultAdGroupBudgetInMicroCurrency When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. for example: ''0''
 * @param isCampaignBudgetOptimization Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. for example: ''true''
 * @param id Campaign ID. for example: ''549755885175''
 * @param bidOptions  for example: ''null''
 * @param createdTime Campaign creation time. Unix timestamp in seconds. for example: ''1432744744''
 * @param isPerformancePlus Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. for example: ''true''
 * @param objectiveType  for example: ''null''
 * @param summaryStatus  for example: ''null''
 * @param `type` Always \"campaign\". for example: ''campaign''
 * @param updatedTime UTC timestamp. Last update time. for example: ''1432744744''
*/
final case class CampaignCreateResponseData (
  adAccountId: Option[String] = None,
  dailySpendCap: Option[Int] = None,
  endTime: Option[Int] = None,
  isAutomatedCampaign: Option[Boolean] = None,
  isFlexibleDailyBudgets: Option[Boolean] = None,
  lifetimeSpendCap: Option[Int] = None,
  name: Option[String] = None,
  orderLineId: Option[String] = None,
  startTime: Option[Int] = None,
  status: Option[EntityStatus] = None,
  trackingUrls: Option[TrackingUrls] = None,
  defaultAdGroupBudgetInMicroCurrency: Option[Int] = None,
  isCampaignBudgetOptimization: Option[Boolean] = None,
  id: Option[String] = None,
  bidOptions: Option[CampaignBidOptions] = None,
  createdTime: Option[Int] = None,
  isPerformancePlus: Option[Boolean] = None,
  objectiveType: Option[ObjectiveType] = None,
  summaryStatus: Option[CampaignSummaryStatus] = None,
  `type`: Option[String] = None,
  updatedTime: Option[Int] = None
)

