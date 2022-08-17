# AdGroupResponse_allOf
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | Ad group ID. | [optional] [default to null] |
| **ad\_account\_id** | **String** | Advertiser ID. | [optional] [default to null] |
| **created\_time** | **Integer** | Ad group creation time. Unix timestamp in seconds. | [optional] [default to null] |
| **updated\_time** | **Integer** | Ad group last update time. Unix timestamp in seconds. | [optional] [default to null] |
| **type** | **String** | Always \&quot;adgroup\&quot;. | [optional] [default to adgroup] |
| **conversion\_learning\_mode\_type** | **String** | oCPM learn mode | [optional] [default to null] |
| **summary\_status** | [**AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | Ad group summary status. | [optional] [default to null] |
| **feed\_profile\_id** | **String** | Feed Profile ID associated to the adgroup. | [optional] [default to null] |
| **dca\_assets** | [**oas_any_type_not_mapped**](.md) | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

