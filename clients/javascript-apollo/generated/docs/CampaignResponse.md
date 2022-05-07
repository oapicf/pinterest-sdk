# PinterestRestApi.CampaignResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Campaign ID. | 
**adAccountId** | **String** | Campaign&#39;s Advertiser ID. | 
**name** | **String** | Campaign name. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to &#39;ACTIVE&#39;]
**lifetimeSpendCap** | **Number** | Campaign total spending cap. | [optional] 
**dailySpendCap** | **Number** | Campaign daily spending cap. | [optional] 
**orderLineId** | **String** | Order line ID that appears on the invoice. | [optional] 
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**startTime** | **Number** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**endTime** | **Number** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**objectiveType** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] 
**createdTime** | **Number** | Campaign creation time. Unix timestamp in seconds. | [optional] 
**updatedTime** | **Number** | UTC timestamp. Last update time. | [optional] 
**type** | **String** | Always \&quot;campaign\&quot;. | [optional] 


