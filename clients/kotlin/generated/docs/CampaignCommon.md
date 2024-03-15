
# CampaignCommon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **kotlin.String** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. |  [optional]
**name** | **kotlin.String** | Campaign name. |  [optional]
**status** | [**EntityStatus**](EntityStatus.md) |  |  [optional]
**lifetimeSpendCap** | **kotlin.Int** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. |  [optional]
**dailySpendCap** | **kotlin.Int** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. |  [optional]
**orderLineId** | **kotlin.String** | Order line ID that appears on the invoice. |  [optional]
**trackingUrls** | [**AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  |  [optional]
**startTime** | **kotlin.Int** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional]
**endTime** | **kotlin.Int** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional]
**summaryStatus** | [**CampaignSummaryStatus**](CampaignSummaryStatus.md) |  |  [optional]



