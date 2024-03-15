# IntegrationLog
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **client\_timestamp** | **Integer** | Timestamp in milliseconds of when the log was executed at the client. | [default to null] |
| **event\_type** | **String** | Log event type | [default to null] |
| **log\_level** | **String** | Log level type | [default to null] |
| **external\_business\_id** | **String** |  | [optional] [default to null] |
| **advertiser\_id** | **String** |  | [optional] [default to null] |
| **merchant\_id** | **String** |  | [optional] [default to null] |
| **tag\_id** | **String** |  | [optional] [default to null] |
| **feed\_profile\_id** | **String** |  | [optional] [default to null] |
| **message** | **String** | Explanation of the event that occured. | [optional] [default to null] |
| **app\_version\_number** | **String** | Version number of the integration application. | [optional] [default to null] |
| **platform\_version\_number** | **String** | Version number of the platform the integration application is running on. | [optional] [default to null] |
| **error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] [default to null] |
| **request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

