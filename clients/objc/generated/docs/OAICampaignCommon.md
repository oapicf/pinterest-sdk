# OAICampaignCommon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **NSString*** | Campaign&#39;s Advertiser ID. | 
**name** | **NSString*** | Campaign name. | [optional] 
**status** | [**OAIEntityStatus***](OAIEntityStatus.md) |  | [optional] [default to @"ACTIVE"]
**lifetimeSpendCap** | **NSNumber*** | Campaign total spending cap. | [optional] 
**dailySpendCap** | **NSNumber*** | Campaign daily spending cap. | [optional] 
**orderLineId** | **NSString*** | Order line ID that appears on the invoice. | [optional] 
**trackingUrls** | [**OAITrackingUrls***](OAITrackingUrls.md) |  | [optional] 
**startTime** | **NSNumber*** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**endTime** | **NSNumber*** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


