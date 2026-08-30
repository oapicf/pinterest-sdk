# CampaignBatchResponseData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Campaign&#39;s Advertiser ID. | [optional] 
**BidOptions** | [**CampaignBidOptions**](CampaignBidOptions.md) | [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers. | [optional] 
**CreatedTime** | **Int32** | Campaign creation time. Unix timestamp in seconds. | [optional] [readonly] 
**DailySpendCap** | **Int32** | Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. | [optional] 
**DefaultAdGroupBudgetInMicroCurrency** | **Int32** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] 
**EndTime** | **Int32** | Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. | [optional] 
**Id** | **String** | Campaign ID. | [optional] 
**IntendedPromotionType** | [**IntendedPromotionType**](IntendedPromotionType.md) |  | [optional] 
**IsAutomatedCampaign** | **Boolean** | Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\_CONVERSION - SALES - LEADS - CATALOG\_SALES | [optional] 
**IsCampaignBudgetOptimization** | **Boolean** | Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. | [optional] 
**IsCarting** | **Boolean** | Whether the campaign contains a carting(where-to-buy link) ad. | [optional] [readonly] 
**IsFlexibleDailyBudgets** | **Boolean** | Determine if a campaign has setup for flexible daily budgets, also known as &quot;&quot;Pinterest Performance+ budgets&quot;&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. | [optional] 
**IsLtvOptimized** | **Boolean** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. | [optional] 
**IsPerformancePlus** | **Boolean** | Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\_CONVERSION - SALES - LEADS - CATALOG\_SALES - APP\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/) | [optional] 
**IsTopOfSearch** | **Boolean** | Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\_CONVERSION  - SALES  - LEADS  - CATALOG\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled. | [optional] 
**LifetimeSpendCap** | **Int32** | Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. | [optional] 
**Name** | **String** | Campaign name - 255 chars max. | [optional] 
**ObjectiveType** | [**CampaignObjectiveType**](CampaignObjectiveType.md) |  | [optional] 
**OrderLineId** | **String** | Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired. | [optional] 
**PerformancePlusCampaignSettings** | [**PerformancePlusCampaignSettings**](PerformancePlusCampaignSettings.md) | Pinterest Performance+ campaign settings. | [optional] 
**StartTime** | **Int32** | Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. | [optional] 
**Status** | [**NullableEntityStatus**](NullableEntityStatus.md) |  | [optional] 
**SummaryStatus** | [**SummaryStatus**](SummaryStatus.md) |  | [optional] [readonly] 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**Type** | **String** | Always &quot;&quot;campaign&quot;&quot;. | [optional] [readonly] 
**UpdatedTime** | **Int32** | UTC timestamp. Last update time. | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$CampaignBatchResponseData = Initialize-PSOpenAPIToolsCampaignBatchResponseData  -AdAccountId 549755885175 `
 -BidOptions null `
 -CreatedTime 1432744744 `
 -DailySpendCap 1432744744 `
 -DefaultAdGroupBudgetInMicroCurrency 0 `
 -EndTime 1644023526 `
 -Id 549755885175 `
 -IntendedPromotionType null `
 -IsAutomatedCampaign true `
 -IsCampaignBudgetOptimization true `
 -IsCarting true `
 -IsFlexibleDailyBudgets true `
 -IsLtvOptimized true `
 -IsPerformancePlus true `
 -IsTopOfSearch true `
 -LifetimeSpendCap 1432744744 `
 -Name ACME Tools `
 -ObjectiveType null `
 -OrderLineId 549755885175 `
 -PerformancePlusCampaignSettings null `
 -StartTime 1580865126 `
 -Status null `
 -SummaryStatus null `
 -TrackingUrls null `
 -Type campaign `
 -UpdatedTime 1432744744
```

- Convert the resource to JSON
```powershell
$CampaignBatchResponseData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

