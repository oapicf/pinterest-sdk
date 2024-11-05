

# CampaignResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Campaign ID. |  [optional]
**adAccountId** | **String** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. |  [optional]
**name** | **String** | Campaign name. |  [optional]
**status** | **EntityStatus** |  |  [optional]
**lifetimeSpendCap** | **Int** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. |  [optional]
**dailySpendCap** | **Int** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. |  [optional]
**orderLineId** | **String** | Order line ID that appears on the invoice. |  [optional]
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  |  [optional]
**startTime** | **Int** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional]
**endTime** | **Int** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional]
**isFlexibleDailyBudgets** | **Boolean** | Determine if a campaign has flexible daily budgets setup. |  [optional]
**objectiveType** | **ObjectiveType** |  |  [optional]
**createdTime** | **Int** | Campaign creation time. Unix timestamp in seconds. |  [optional]
**updatedTime** | **Int** | UTC timestamp. Last update time. |  [optional]
**`type`** | **String** | Always \&quot;campaign\&quot;. |  [optional]
**isCampaignBudgetOptimization** | **Boolean** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. |  [optional]
**summaryStatus** | **CampaignSummaryStatus** |  |  [optional]



