# # CampaignCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Campaign&#39;s Advertiser ID. |
**name** | **string** | Campaign name. | [optional]
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to 'ACTIVE']
**lifetime_spend_cap** | **int** | Campaign total spending cap. | [optional]
**daily_spend_cap** | **int** | Campaign daily spending cap. | [optional]
**order_line_id** | **string** | Order line ID that appears on the invoice. | [optional]
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional]
**start_time** | **int** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional]
**end_time** | **int** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
