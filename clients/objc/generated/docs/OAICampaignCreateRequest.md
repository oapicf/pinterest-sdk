# OAICampaignCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **NSString*** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | 
**name** | **NSString*** | Campaign name. | 
**status** | [**OAIEntityStatus***](OAIEntityStatus.md) |  | [optional] [default to @"ACTIVE"]
**lifetimeSpendCap** | **NSNumber*** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] 
**dailySpendCap** | **NSNumber*** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] 
**orderLineId** | **NSString*** | Order line ID that appears on the invoice. | [optional] 
**trackingUrls** | [**OAIAdCommonTrackingUrls***](OAIAdCommonTrackingUrls.md) |  | [optional] 
**startTime** | **NSNumber*** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**endTime** | **NSNumber*** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**summaryStatus** | [**OAICampaignSummaryStatus***](OAICampaignSummaryStatus.md) |  | [optional] 
**isFlexibleDailyBudgets** | **NSNumber*** | Determine if a campaign has flexible daily budgets setup. | [optional] [default to @(NO)]
**defaultAdGroupBudgetInMicroCurrency** | **NSNumber*** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] 
**isAutomatedCampaign** | **NSNumber*** | Specifies whether the campaign was created in the automated campaign flow | [optional] [default to @(NO)]
**objectiveType** | [**OAIObjectiveType***](OAIObjectiveType.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


