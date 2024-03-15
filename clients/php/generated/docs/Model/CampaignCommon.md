# # CampaignCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional]
**name** | **string** | Campaign name. | [optional]
**status** | [**\OpenAPI\Client\Model\EntityStatus**](EntityStatus.md) |  | [optional]
**lifetime_spend_cap** | **int** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional]
**daily_spend_cap** | **int** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional]
**order_line_id** | **string** | Order line ID that appears on the invoice. | [optional]
**tracking_urls** | [**\OpenAPI\Client\Model\AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional]
**start_time** | **int** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional]
**end_time** | **int** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional]
**summary_status** | [**\OpenAPI\Client\Model\CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
