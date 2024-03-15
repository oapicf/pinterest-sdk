# CampaignCommon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional] [default to None]
**name** | **String** | Campaign name. | [optional] [default to None]
**status** | [***models::EntityStatus**](EntityStatus.md) |  | [optional] [default to None]
**lifetime_spend_cap** | **i32** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. | [optional] [default to None]
**daily_spend_cap** | **i32** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. | [optional] [default to None]
**order_line_id** | **String** | Order line ID that appears on the invoice. | [optional] [default to None]
**tracking_urls** | [***models::AdCommonTrackingUrls**](AdCommon_tracking_urls.md) |  | [optional] [default to None]
**start_time** | **i32** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to None]
**end_time** | **i32** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to None]
**summary_status** | [***models::CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


