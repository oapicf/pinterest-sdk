# CampaignCommon
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional] [default to null] |
| **name** | **String** | Campaign name. | [optional] [default to null] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to null] |
| **lifetime\_spend\_cap** | **Integer** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] [default to null] |
| **daily\_spend\_cap** | **Integer** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] [default to null] |
| **order\_line\_id** | **String** | Order line ID that appears on the invoice. | [optional] [default to null] |
| **tracking\_urls** | [**AdCommon_tracking_urls**](AdCommon_tracking_urls.md) |  | [optional] [default to null] |
| **start\_time** | **Integer** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null] |
| **end\_time** | **Integer** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null] |
| **summary\_status** | [**CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

