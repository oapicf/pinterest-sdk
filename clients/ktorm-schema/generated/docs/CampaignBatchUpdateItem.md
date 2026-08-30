
# Table `CampaignBatchUpdateItem`
(mapped from: CampaignBatchUpdateItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Campaign ID, must be associated with the ad account ID provided in the path. | 
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Setting this field does nothing. The ad account ID gets set from the path parameter. |  [optional]
**appId** | app_id | text |  | **kotlin.String** | [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for &#x60;APP_INSTALL&#x60; campaigns. |  [optional]
**appPlatform** | app_platform | long |  | [**MobileAppPlatform**](MobileAppPlatform.md) | [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for &#x60;APP_INSTALL&#x60; campaigns. |  [optional] [foreignkey]
**bidOptions** | bid_options | long |  | [**CampaignBidOptionsUpdate**](CampaignBidOptionsUpdate.md) | Object describing an update to the campaign level bid multipliers. |  [optional] [foreignkey]
**dailySpendCap** | daily_spend_cap | int |  | **kotlin.Int** | Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. |  [optional]
**defaultAdGroupBudgetInMicroCurrency** | default_ad_group_budget_in_micro_currency | int |  | **kotlin.Int** | Setting this field does nothing. |  [optional]
**endTime** | end_time | int |  | **kotlin.Int** | Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. |  [optional]
**intendedPromotionType** | intended_promotion_type | long |  | [**IntendedPromotionType**](IntendedPromotionType.md) |  |  [optional] [foreignkey]
**isAutomatedCampaign** | is_automated_campaign | boolean |  | **kotlin.Boolean** | Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES |  [optional]
**isCampaignBudgetOptimization** | is_campaign_budget_optimization | boolean |  | **kotlin.Boolean** | Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. |  [optional]
**isFlexibleDailyBudgets** | is_flexible_daily_budgets | boolean |  | **kotlin.Boolean** | Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. |  [optional]
**isLtvOptimized** | is_ltv_optimized | boolean |  | **kotlin.Boolean** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. |  [optional]
**isPerformancePlus** | is_performance_plus | boolean |  | **kotlin.Boolean** | Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/) |  [optional]
**isTopOfSearch** | is_top_of_search | boolean |  | **kotlin.Boolean** | Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled. |  [optional]
**lifetimeSpendCap** | lifetime_spend_cap | int |  | **kotlin.Int** | Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. |  [optional]
**name** | name | text |  | **kotlin.String** | Campaign name - 255 chars max. |  [optional]
**objectiveType** | objective_type | long |  | [**ConversionObjectiveType**](ConversionObjectiveType.md) |  |  [optional] [foreignkey]
**orderLineId** | order_line_id | text |  | **kotlin.String** | Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired. |  [optional]
**performancePlusCampaignSettings** | performance_plus_campaign_settings | long |  | [**PerformancePlusCampaignSettings**](PerformancePlusCampaignSettings.md) | Pinterest Performance+ campaign settings. |  [optional] [foreignkey]
**startTime** | start_time | int |  | **kotlin.Int** | Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. |  [optional]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) |  |  [optional] [foreignkey]
**trackingUrls** | tracking_urls | long |  | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] [foreignkey]

























