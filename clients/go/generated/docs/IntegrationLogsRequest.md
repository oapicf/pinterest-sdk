# IntegrationLogsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Logs** | [**[]IntegrationLog**](IntegrationLog.md) |  | 

## Methods

### NewIntegrationLogsRequest

`func NewIntegrationLogsRequest(logs []IntegrationLog, ) *IntegrationLogsRequest`

NewIntegrationLogsRequest instantiates a new IntegrationLogsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIntegrationLogsRequestWithDefaults

`func NewIntegrationLogsRequestWithDefaults() *IntegrationLogsRequest`

NewIntegrationLogsRequestWithDefaults instantiates a new IntegrationLogsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLogs

`func (o *IntegrationLogsRequest) GetLogs() []IntegrationLog`

GetLogs returns the Logs field if non-nil, zero value otherwise.

### GetLogsOk

`func (o *IntegrationLogsRequest) GetLogsOk() (*[]IntegrationLog, bool)`

GetLogsOk returns a tuple with the Logs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogs

`func (o *IntegrationLogsRequest) SetLogs(v []IntegrationLog)`

SetLogs sets Logs field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


