
# Table `CampaignUpdateRequest`
(mapped from: CampaignUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountId** | ad_account_id | text NOT NULL |  | **kotlin.String** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Campaign ID. | 
**bidOptions** | bid_options | long |  | [**CampaignBidOptionsUpdate**](CampaignBidOptionsUpdate.md) |  |  [optional] [foreignkey]
**intendedPromotionType** | intended_promotion_type | long |  | [**IntendedPromotionType**](IntendedPromotionType.md) |  |  [optional] [foreignkey]
**isLtvOptimized** | is_ltv_optimized | boolean |  | **kotlin.Boolean** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. |  [optional]
**isPerformancePlus** | is_performance_plus | boolean |  | **kotlin.Boolean** | Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field. |  [optional]
**isTopOfSearch** | is_top_of_search | boolean |  | **kotlin.Boolean** | Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. |  [optional]
**objectiveType** | objective_type | long |  | [**ObjectiveType**](ObjectiveType.md) |  |  [optional] [foreignkey]
**dailySpendCap** | daily_spend_cap | int |  | **kotlin.Int** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. |  [optional]
**defaultAdGroupBudgetInMicroCurrency** | default_ad_group_budget_in_micro_currency | int |  | **kotlin.Int** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. |  [optional]
**endTime** | end_time | int |  | **kotlin.Int** | Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. |  [optional]
**isAutomatedCampaign** | is_automated_campaign | boolean |  | **kotlin.Boolean** | Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES |  [optional]
**isCampaignBudgetOptimization** | is_campaign_budget_optimization | boolean |  | **kotlin.Boolean** | Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. |  [optional]
**isFlexibleDailyBudgets** | is_flexible_daily_budgets | boolean |  | **kotlin.Boolean** | Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. |  [optional]
**lifetimeSpendCap** | lifetime_spend_cap | int |  | **kotlin.Int** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. |  [optional]
**name** | name | text |  | **kotlin.String** | Campaign name. |  [optional]
**orderLineId** | order_line_id | text |  | **kotlin.String** | Order line ID that appears on the invoice. |  [optional]
**startTime** | start_time | int |  | **kotlin.Int** | Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. |  [optional]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) |  |  [optional] [foreignkey]
**trackingUrls** | tracking_urls | blob |  | [**kotlin.Any**](.md) |  |  [optional]






















