

# CampaignResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Campaign ID. | 
**adAccountId** | **String** | Campaign&#39;s Advertiser ID. | 
**name** | **String** | Campaign name. |  [optional]
**status** | [**EntityStatus**](EntityStatus.md) |  |  [optional]
**lifetimeSpendCap** | **Integer** | Campaign total spending cap. |  [optional]
**dailySpendCap** | **Integer** | Campaign daily spending cap. |  [optional]
**orderLineId** | **String** | Order line ID that appears on the invoice. |  [optional]
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  |  [optional]
**startTime** | **Integer** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional]
**endTime** | **Integer** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional]
**objectiveType** | **ObjectiveType** |  |  [optional]
**createdTime** | **Integer** | Campaign creation time. Unix timestamp in seconds. |  [optional]
**updatedTime** | **Integer** | UTC timestamp. Last update time. |  [optional]
**type** | **String** | Always \&quot;campaign\&quot;. |  [optional]



