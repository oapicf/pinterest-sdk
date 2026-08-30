

# CampaignBatchResponseData

Campaign data in batch response, with all fields optional to support error cases where data may be empty.

The class is defined in **[CampaignBatchResponseData.java](../../src/main/java/org/openapitools/model/CampaignBatchResponseData.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | `String` | Campaign&#39;s Advertiser ID. |  [optional property]
**bidOptions** | [`CampaignBidOptions`](CampaignBidOptions.md) | [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers. |  [optional property]
**createdTime** | `Integer` | Campaign creation time. Unix timestamp in seconds. |  [optional property] [readonly property]
**dailySpendCap** | `Integer` | Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. |  [optional property]
**defaultAdGroupBudgetInMicroCurrency** | `Integer` | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. |  [optional property]
**endTime** | `Integer` | Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. |  [optional property]
**id** | `String` | Campaign ID. |  [optional property]
**intendedPromotionType** | `IntendedPromotionType` |  |  [optional property]
**isAutomatedCampaign** | `Boolean` | Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES |  [optional property]
**isCampaignBudgetOptimization** | `Boolean` | Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. |  [optional property]
**isCarting** | `Boolean` | Whether the campaign contains a carting(where-to-buy link) ad. |  [optional property] [readonly property]
**isFlexibleDailyBudgets** | `Boolean` | Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. |  [optional property]
**isLtvOptimized** | `Boolean` | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. |  [optional property]
**isPerformancePlus** | `Boolean` | Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/) |  [optional property]
**isTopOfSearch** | `Boolean` | Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled. |  [optional property]
**lifetimeSpendCap** | `Integer` | Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. |  [optional property]
**name** | `String` | Campaign name - 255 chars max. |  [optional property]
**objectiveType** | `CampaignObjectiveType` |  |  [optional property]
**orderLineId** | `String` | Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired. |  [optional property]
**performancePlusCampaignSettings** | [`PerformancePlusCampaignSettings`](PerformancePlusCampaignSettings.md) | Pinterest Performance+ campaign settings. |  [optional property]
**startTime** | `Integer` | Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. |  [optional property]
**status** | `NullableEntityStatus` |  |  [optional property]
**summaryStatus** | `SummaryStatus` |  |  [optional property] [readonly property]
**trackingUrls** | [`TrackingUrls`](TrackingUrls.md) |  |  [optional property]
**type** | `String` | Always \&quot;campaign\&quot;. |  [optional property] [readonly property]
**updatedTime** | `Integer` | UTC timestamp. Last update time. |  [optional property] [readonly property]




























