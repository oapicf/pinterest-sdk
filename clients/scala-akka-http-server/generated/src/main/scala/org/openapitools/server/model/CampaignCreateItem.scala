package org.openapitools.server.model


/**
 * Single campaign create item with create-specific defaults.
 *
 * @param adAccountId Setting this field does nothing. The ad account ID gets set from the path parameter. for example: ''549755885175''
 * @param appId [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for `APP_INSTALL` campaigns. for example: ''429047995''
 * @param appPlatform [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for `APP_INSTALL` campaigns. for example: ''IOS''
 * @param bidOptions [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers. for example: ''null''
 * @param dailySpendCap Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. for example: ''1432744744''
 * @param defaultAdGroupBudgetInMicroCurrency Setting this field does nothing. for example: ''0''
 * @param endTime Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. for example: ''1644023526''
 * @param intendedPromotionType  for example: ''null''
 * @param isAutomatedCampaign Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES for example: ''true''
 * @param isCampaignBudgetOptimization Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. for example: ''true''
 * @param isFlexibleDailyBudgets Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. for example: ''true''
 * @param isLtvOptimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. for example: ''true''
 * @param isPerformancePlus Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/) for example: ''true''
 * @param isTopOfSearch Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled. for example: ''true''
 * @param lifetimeSpendCap Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. for example: ''1432744744''
 * @param name Campaign name - 255 chars max. for example: ''ACME Tools''
 * @param objectiveType  for example: ''null''
 * @param orderLineId Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired. for example: ''549755885175''
 * @param startTime Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. for example: ''1580865126''
 * @param status  for example: ''null''
 * @param trackingUrls  for example: ''null''
*/
final case class CampaignCreateItem (
  adAccountId: Option[String] = None,
  appId: Option[String] = None,
  appPlatform: Option[MobileAppPlatform] = None,
  bidOptions: Option[CampaignBidOptions] = None,
  dailySpendCap: Option[Int] = None,
  defaultAdGroupBudgetInMicroCurrency: Option[Int] = None,
  endTime: Option[Int] = None,
  intendedPromotionType: Option[IntendedPromotionType] = None,
  isAutomatedCampaign: Option[Boolean] = None,
  isCampaignBudgetOptimization: Option[Boolean] = None,
  isFlexibleDailyBudgets: Option[Boolean] = None,
  isLtvOptimized: Option[Boolean] = None,
  isPerformancePlus: Option[Boolean] = None,
  isTopOfSearch: Option[Boolean] = None,
  lifetimeSpendCap: Option[Int] = None,
  name: String,
  objectiveType: ConversionObjectiveType,
  orderLineId: Option[String] = None,
  startTime: Option[Int] = None,
  status: Option[EntityStatus] = None,
  trackingUrls: Option[TrackingUrls] = None
)

