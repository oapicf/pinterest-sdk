

# CampaignCreateRequest

The class is defined in **[CampaignCreateRequest.java](../../src/main/java/org/openapitools/model/CampaignCreateRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | `String` | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | 
**name** | `String` | Campaign name. | 
**status** | `EntityStatus` |  |  [optional property]
**lifetimeSpendCap** | `Integer` | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. |  [optional property]
**dailySpendCap** | `Integer` | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. |  [optional property]
**orderLineId** | `String` | Order line ID that appears on the invoice. |  [optional property]
**trackingUrls** | [`AdCommonTrackingUrls`](AdCommonTrackingUrls.md) |  |  [optional property]
**startTime** | `Integer` | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional property]
**endTime** | `Integer` | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional property]
**summaryStatus** | `CampaignSummaryStatus` |  |  [optional property]
**isFlexibleDailyBudgets** | `Boolean` | Determine if a campaign has flexible daily budgets setup. |  [optional property]
**defaultAdGroupBudgetInMicroCurrency** | `Integer` | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. |  [optional property]
**isAutomatedCampaign** | `Boolean` | Specifies whether the campaign was created in the automated campaign flow |  [optional property]
**objectiveType** | `ObjectiveType` |  | 
















