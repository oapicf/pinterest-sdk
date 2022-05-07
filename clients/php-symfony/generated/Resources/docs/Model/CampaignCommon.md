# CampaignCommon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **string** | Campaign&#39;s Advertiser ID. | 
**name** | **string** | Campaign name. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to 'ACTIVE']
**lifetimeSpendCap** | **int** | Campaign total spending cap. | [optional] 
**dailySpendCap** | **int** | Campaign daily spending cap. | [optional] 
**orderLineId** | **string** | Order line ID that appears on the invoice. | [optional] 
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**startTime** | **int** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**endTime** | **int** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


