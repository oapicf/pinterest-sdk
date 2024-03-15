# CampaignUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Campaign ID. | 
**adAccountId** | **string** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | 
**name** | **string** | Campaign name. | [optional] 
**status** | [**OpenAPI\Server\Model\EntityStatus**](EntityStatus.md) |  | [optional] 
**lifetimeSpendCap** | **int** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] 
**dailySpendCap** | **int** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] 
**orderLineId** | **string** | Order line ID that appears on the invoice. | [optional] 
**trackingUrls** | [**OpenAPI\Server\Model\AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional] 
**startTime** | **int** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**endTime** | **int** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**summaryStatus** | [**OpenAPI\Server\Model\CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional] 
**isFlexibleDailyBudgets** | **bool** | Determine if a campaign has flexible daily budgets setup. | [optional] 
**defaultAdGroupBudgetInMicroCurrency** | **int** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] 
**isAutomatedCampaign** | **bool** | Specifies whether the campaign was created in the automated campaign flow | [optional] 
**isCampaignBudgetOptimization** | **bool** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] 
**objectiveType** | [**OpenAPI\Server\Model\ObjectiveType**](ObjectiveType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


