# CampaignResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Campaign ID. | 
**AdAccountId** | **string** | Campaign&#39;s Advertiser ID. | 
**Name** | **string** | Campaign name. | [optional] 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to ACTIVE]
**LifetimeSpendCap** | Pointer to **int32** | Campaign total spending cap. | [optional] 
**DailySpendCap** | Pointer to **int32** | Campaign daily spending cap. | [optional] 
**OrderLineId** | Pointer to **string** | Order line ID that appears on the invoice. | [optional] 
**TrackingUrls** | Pointer to [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**StartTime** | Pointer to **int32** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**EndTime** | Pointer to **int32** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**ObjectiveType** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] 
**CreatedTime** | **int32** | Campaign creation time. Unix timestamp in seconds. | [optional] 
**UpdatedTime** | **int32** | UTC timestamp. Last update time. | [optional] 
**Type** | **string** | Always \&quot;campaign\&quot;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


