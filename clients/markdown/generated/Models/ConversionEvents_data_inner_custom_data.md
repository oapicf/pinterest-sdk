# ConversionEvents_data_inner_custom_data
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **currency** | **String** | The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. | [optional] [default to null] |
| **value** | **String** | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price | [optional] [default to null] |
| **content\_ids** | **List** | List of products IDs | [optional] [default to null] |
| **contents** | [**List**](ConversionEvents_data_inner_custom_data_contents_inner.md) | A list of objects containing information about products, such as price and quantity. | [optional] [default to null] |
| **num\_items** | **Long** | Total number of products of the event. For example, the total number of items purchased in a checkout event. | [optional] [default to null] |
| **order\_id** | **String** | The order ID | [optional] [default to null] |
| **search\_string** | **String** | The search string related to the user conversion event. | [optional] [default to null] |
| **opt\_out\_type** | **String** | Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. | [optional] [default to null] |
| **np** | **String** | Named partner. Not required, this is for Pinterest internal use only. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

