# Org.OpenAPITools.Model.CampaignCreateCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **string** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional] 
**Name** | **string** | Campaign name. | [optional] 
**Status** | **EntityStatus** |  | [optional] 
**LifetimeSpendCap** | **int?** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] 
**DailySpendCap** | **int?** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] 
**OrderLineId** | **string** | Order line ID that appears on the invoice. | [optional] 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**StartTime** | **int?** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**EndTime** | **int?** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**IsFlexibleDailyBudgets** | **bool?** | Determine if a campaign has flexible daily budgets setup. | [optional] 
**DefaultAdGroupBudgetInMicroCurrency** | **int?** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] 
**IsAutomatedCampaign** | **bool?** | Specifies whether the campaign was created in the automated campaign flow | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

