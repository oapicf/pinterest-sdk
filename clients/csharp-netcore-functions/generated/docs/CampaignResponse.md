# Org.OpenAPITools.Models.CampaignResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Campaign ID. | 
**AdAccountId** | **string** | Campaign&#39;s Advertiser ID. | 
**Name** | **string** | Campaign name. | [optional] 
**Status** | **EntityStatus** |  | [optional] [default to "ACTIVE"]
**LifetimeSpendCap** | **int?** | Campaign total spending cap. | [optional] 
**DailySpendCap** | **int?** | Campaign daily spending cap. | [optional] 
**OrderLineId** | **string** | Order line ID that appears on the invoice. | [optional] 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**StartTime** | **int?** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**EndTime** | **int?** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**ObjectiveType** | **ObjectiveType** |  | [optional] 
**CreatedTime** | **int** | Campaign creation time. Unix timestamp in seconds. | [optional] 
**UpdatedTime** | **int** | UTC timestamp. Last update time. | [optional] 
**Type** | **string** | Always \&quot;campaign\&quot;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

