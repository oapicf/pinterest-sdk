# CampaignCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | Campaign's Advertiser ID. | 
**name** | Option<**String**> | Campaign name. | [optional]
**status** | Option<[**crate::models::EntityStatus**](EntityStatus.md)> |  | [optional][default to ACTIVE]
**lifetime_spend_cap** | Option<**i32**> | Campaign total spending cap. | [optional]
**daily_spend_cap** | Option<**i32**> | Campaign daily spending cap. | [optional]
**order_line_id** | Option<**String**> | Order line ID that appears on the invoice. | [optional]
**tracking_urls** | Option<[**crate::models::TrackingUrls**](TrackingUrls.md)> |  | [optional]
**start_time** | Option<**i32**> | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional]
**end_time** | Option<**i32**> | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


