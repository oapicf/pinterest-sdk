# CampaignResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Campaign ID. | 
**adAccountId** | **String** | Campaign&#39;s Advertiser ID. | 
**name** | **String** | Campaign name. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to "ACTIVE"]
**lifetimeSpendCap** | **Int** | Campaign total spending cap. | [optional] 
**dailySpendCap** | **Int** | Campaign daily spending cap. | [optional] 
**orderLineId** | **String** | Order line ID that appears on the invoice. | [optional] 
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**startTime** | **Int** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**endTime** | **Int** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**objectiveType** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] 
**createdTime** | **Int** | Campaign creation time. Unix timestamp in seconds. | [optional] 
**updatedTime** | **Int** | UTC timestamp. Last update time. | [optional] 
**type** | **String** | Always \&quot;campaign\&quot;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


