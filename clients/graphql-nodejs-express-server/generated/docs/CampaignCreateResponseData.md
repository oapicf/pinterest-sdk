# CampaignCreateResponseData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String!** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional] [default to null]
**name** | **String!** | Campaign name. | [optional] [default to null]
**status** | [***EntityStatus**](EntityStatus.md) |  | [optional] [default to null]
**lifetimeSpendCap** | **Int** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] [default to null]
**dailySpendCap** | **Int** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] [default to null]
**orderLineId** | **String** | Order line ID that appears on the invoice. | [optional] [default to null]
**trackingUrls** | [***TrackingUrls**](TrackingUrls.md) |  | [optional] [default to null]
**startTime** | **Int** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null]
**endTime** | **Int** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null]
**isFlexibleDailyBudgets** | **Boolean** | Determine if a campaign has flexible daily budgets setup. | [optional] [default to null]
**defaultAdGroupBudgetInMicroCurrency** | **Int** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] [default to null]
**isAutomatedCampaign** | **Boolean** | Specifies whether the campaign was created in the automated campaign flow | [optional] [default to null]
**Id_** | **String!** | Campaign ID. | [optional] [default to null]
**objectiveType** | [***ObjectiveType**](ObjectiveType.md) |  | [optional] [default to null]
**createdTime** | **Int!** | Campaign creation time. Unix timestamp in seconds. | [optional] [default to null]
**updatedTime** | **Int!** | UTC timestamp. Last update time. | [optional] [default to null]
**Type_** | **String!** | Always \&quot;campaign\&quot;. | [optional] [default to null]
**isCampaignBudgetOptimization** | **Boolean** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] [default to null]
**summaryStatus** | [***CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


