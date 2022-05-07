# CampaignCommon
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad\_account\_id** | **String** | Campaign&#39;s Advertiser ID. | [default to null]
**name** | **String** | Campaign name. | [optional] [default to null]
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to ACTIVE]
**lifetime\_spend\_cap** | **Integer** | Campaign total spending cap. | [optional] [default to null]
**daily\_spend\_cap** | **Integer** | Campaign daily spending cap. | [optional] [default to null]
**order\_line\_id** | **String** | Order line ID that appears on the invoice. | [optional] [default to null]
**tracking\_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] [default to null]
**start\_time** | **Integer** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null]
**end\_time** | **Integer** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

