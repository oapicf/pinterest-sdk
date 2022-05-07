

# CampaignResponse

The class is defined in **[CampaignResponse.java](../../src/main/java/org/openapitools/model/CampaignResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | Campaign ID. | 
**adAccountId** | `String` | Campaign&#39;s Advertiser ID. | 
**name** | `String` | Campaign name. |  [optional property]
**status** | [`EntityStatus`](EntityStatus.md) |  |  [optional property]
**lifetimeSpendCap** | `Integer` | Campaign total spending cap. |  [optional property]
**dailySpendCap** | `Integer` | Campaign daily spending cap. |  [optional property]
**orderLineId** | `String` | Order line ID that appears on the invoice. |  [optional property]
**trackingUrls** | [`TrackingUrls`](TrackingUrls.md) |  |  [optional property]
**startTime** | `Integer` | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional property]
**endTime** | `Integer` | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional property]
**objectiveType** | `ObjectiveType` |  |  [optional property]
**createdTime** | `Integer` | Campaign creation time. Unix timestamp in seconds. |  [optional property]
**updatedTime** | `Integer` | UTC timestamp. Last update time. |  [optional property]
**type** | `String` | Always \&quot;campaign\&quot;. |  [optional property]
















