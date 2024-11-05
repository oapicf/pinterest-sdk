# IntegrationLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientTimestamp** | **Int!** | Timestamp in milliseconds of when the log was executed at the client. | [default to null]
**eventType** | **String!** | Log event type | [default to null]
**logLevel** | **String!** | Log level type | [default to null]
**externalBusinessId** | **String** |  | [optional] [default to null]
**advertiserId** | **String** |  | [optional] [default to null]
**merchantId** | **String** |  | [optional] [default to null]
**tagId** | **String** |  | [optional] [default to null]
**feedProfileId** | **String** |  | [optional] [default to null]
**message** | **String!** | Explanation of the event that occured. | [optional] [default to null]
**appVersionNumber** | **String!** | Version number of the integration application. | [optional] [default to null]
**platformVersionNumber** | **String!** | Version number of the platform the integration application is running on. | [optional] [default to null]
**error** | [***IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] [default to null]
**request** | [***IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


