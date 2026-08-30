# CampaignUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BidOptions** | [**CampaignBidOptionsUpdate**](CampaignBidOptionsUpdate.md) |  | [optional] 
**IntendedPromotionType** | [**IntendedPromotionType**](IntendedPromotionType.md) |  | [optional] 
**IsLtvOptimized** | **Boolean** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. | [optional] 
**IsPerformancePlus** | **Boolean** | Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;&quot;&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/&quot;&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field. | [optional] 
**IsTopOfSearch** | **Boolean** | Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. | [optional] 
**ObjectiveType** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] 
**AdAccountId** | **String** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | 
**DailySpendCap** | **Int32** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and &quot;&quot;lifetime_spend_cap&quot;&quot; cannot be set at the same time. | [optional] 
**DefaultAdGroupBudgetInMicroCurrency** | **Int32** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] 
**EndTime** | **Int32** | Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;&quot;&quot;/docs/api-features/managing-campaigns/#campaign-scheduling&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;&quot;&quot;/docs/api/v5/campaigns-list&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;&quot;&quot;/docs/api/v5/ad_groups-list&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. | [optional] 
**Id** | **String** | Campaign ID. | 
**IsAutomatedCampaign** | **Boolean** | Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\_CONVERSION - SALES - CATALOG\_SALES | [optional] 
**IsCampaignBudgetOptimization** | **Boolean** | Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. | [optional] 
**IsFlexibleDailyBudgets** | **Boolean** | Determine if a campaign has setup for flexible daily budgets, also known as &quot;&quot;Pinterest Performance+ budgets&quot;&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. | [optional] 
**LifetimeSpendCap** | **Int32** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and &quot;&quot;daily_spend_cap&quot;&quot; cannot be set at the same time. | [optional] 
**Name** | **String** | Campaign name. | [optional] 
**OrderLineId** | **String** | Order line ID that appears on the invoice. | [optional] 
**StartTime** | **Int32** | Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;&quot;&quot;/docs/api-features/managing-campaigns/#campaign-scheduling&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;&quot;&quot;/docs/api/v5/campaigns-list&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;&quot;&quot;/docs/api/v5/ad_groups-list&quot;&quot; target&#x3D;&quot;&quot;blank&quot;&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. | [optional] 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**TrackingUrls** | [**SystemCollectionsHashtable**](.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignUpdateRequest = Initialize-PSOpenAPIToolsCampaignUpdateRequest  -BidOptions null `
 -IntendedPromotionType null `
 -IsLtvOptimized null `
 -IsPerformancePlus null `
 -IsTopOfSearch null `
 -ObjectiveType null `
 -AdAccountId 549755885175 `
 -DailySpendCap 1432744744 `
 -DefaultAdGroupBudgetInMicroCurrency null `
 -EndTime 1644023526 `
 -Id 549755885175 `
 -IsAutomatedCampaign null `
 -IsCampaignBudgetOptimization null `
 -IsFlexibleDailyBudgets null `
 -LifetimeSpendCap 1432744744 `
 -Name ACME Tools `
 -OrderLineId 549755885175 `
 -StartTime 1580865126 `
 -Status null `
 -TrackingUrls null
```

- Convert the resource to JSON
```powershell
$CampaignUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

