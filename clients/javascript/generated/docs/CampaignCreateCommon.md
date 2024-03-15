# PinterestSdk.CampaignCreateCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional] 
**name** | **String** | Campaign name. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to &#39;ACTIVE&#39;]
**lifetimeSpendCap** | **Number** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] 
**dailySpendCap** | **Number** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] 
**orderLineId** | **String** | Order line ID that appears on the invoice. | [optional] 
**trackingUrls** | [**AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional] 
**startTime** | **Number** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**endTime** | **Number** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**summaryStatus** | [**CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional] 
**isFlexibleDailyBudgets** | **Boolean** | Determine if a campaign has flexible daily budgets setup. | [optional] [default to false]
**defaultAdGroupBudgetInMicroCurrency** | **Number** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] 
**isAutomatedCampaign** | **Boolean** | Specifies whether the campaign was created in the automated campaign flow | [optional] [default to false]


