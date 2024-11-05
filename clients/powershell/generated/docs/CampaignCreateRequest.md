# CampaignCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | 
**Name** | **String** | Campaign name. | 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to "ACTIVE"]
**LifetimeSpendCap** | **Int32** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and &quot;&quot;daily_spend_cap&quot;&quot; cannot be set at the same time. | [optional] 
**DailySpendCap** | **Int32** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and &quot;&quot;lifetime_spend_cap&quot;&quot; cannot be set at the same time. | [optional] 
**OrderLineId** | **String** | Order line ID that appears on the invoice. | [optional] 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**StartTime** | **Int32** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**EndTime** | **Int32** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**IsFlexibleDailyBudgets** | **Boolean** | Determine if a campaign has flexible daily budgets setup. | [optional] [default to $false]
**DefaultAdGroupBudgetInMicroCurrency** | **Int32** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] 
**IsAutomatedCampaign** | **Boolean** | Specifies whether the campaign was created in the automated campaign flow | [optional] [default to $false]
**ObjectiveType** | [**ObjectiveType**](ObjectiveType.md) |  | 

## Examples

- Prepare the resource
```powershell
$CampaignCreateRequest = Initialize-PSOpenAPIToolsCampaignCreateRequest  -AdAccountId 549755885175 `
 -Name ACME Tools `
 -Status null `
 -LifetimeSpendCap 1432744744 `
 -DailySpendCap 1432744744 `
 -OrderLineId 549755885175 `
 -TrackingUrls null `
 -StartTime 1580865126 `
 -EndTime 1644023526 `
 -IsFlexibleDailyBudgets true `
 -DefaultAdGroupBudgetInMicroCurrency 0 `
 -IsAutomatedCampaign true `
 -ObjectiveType null
```

- Convert the resource to JSON
```powershell
$CampaignCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

