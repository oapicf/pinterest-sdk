

# CampaignCommon

Campaign Data

The class is defined in **[CampaignCommon.java](../../src/main/java/org/openapitools/model/CampaignCommon.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | `String` | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. |  [optional property]
**name** | `String` | Campaign name. |  [optional property]
**status** | `EntityStatus` |  |  [optional property]
**lifetimeSpendCap** | `Integer` | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. |  [optional property]
**dailySpendCap** | `Integer` | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. |  [optional property]
**orderLineId** | `String` | Order line ID that appears on the invoice. |  [optional property]
**trackingUrls** | [`TrackingUrls`](TrackingUrls.md) |  |  [optional property]
**startTime** | `Integer` | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional property]
**endTime** | `Integer` | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional property]
**isFlexibleDailyBudgets** | `Boolean` | Determine if a campaign has flexible daily budgets setup. |  [optional property]












