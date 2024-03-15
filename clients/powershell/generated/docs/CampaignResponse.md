# CampaignResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Campaign ID. | [optional] 
**AdAccountId** | **String** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional] 
**Name** | **String** | Campaign name. | [optional] 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**LifetimeSpendCap** | **Int32** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and &quot;&quot;daily_spend_cap&quot;&quot; cannot be set at the same time. | [optional] 
**DailySpendCap** | **Int32** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and &quot;&quot;lifetime_spend_cap&quot;&quot; cannot be set at the same time. | [optional] 
**OrderLineId** | **String** | Order line ID that appears on the invoice. | [optional] 
**TrackingUrls** | [**AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional] 
**StartTime** | **Int32** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**EndTime** | **Int32** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**SummaryStatus** | [**CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional] 
**ObjectiveType** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] 
**CreatedTime** | **Int32** | Campaign creation time. Unix timestamp in seconds. | [optional] 
**UpdatedTime** | **Int32** | UTC timestamp. Last update time. | [optional] 
**Type** | **String** | Always &quot;&quot;campaign&quot;&quot;. | [optional] 
**IsFlexibleDailyBudgets** | **Boolean** | Determines if a campaign has flexible daily budgets setup. | [optional] 
**IsCampaignBudgetOptimization** | **Boolean** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignResponse = Initialize-PSOpenAPIToolsCampaignResponse  -Id 549755885175 `
 -AdAccountId 549755885175 `
 -Name ACME Tools `
 -Status null `
 -LifetimeSpendCap 1432744744 `
 -DailySpendCap 1432744744 `
 -OrderLineId 549755885175 `
 -TrackingUrls null `
 -StartTime 1580865126 `
 -EndTime 1644023526 `
 -SummaryStatus null `
 -ObjectiveType null `
 -CreatedTime 1432744744 `
 -UpdatedTime 1432744744 `
 -Type campaign `
 -IsFlexibleDailyBudgets true `
 -IsCampaignBudgetOptimization true
```

- Convert the resource to JSON
```powershell
$CampaignResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

