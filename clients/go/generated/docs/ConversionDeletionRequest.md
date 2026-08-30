# ConversionDeletionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedTime** | **string** | Timestamp when the conversion deletion request was succesfully created. | [readonly] 
**ProcessedTime** | Pointer to **NullableString** | Timestamp when the conversion deletion request was processed. | [optional] [readonly] 
**RequestId** | **string** | Unique identifier of the conversion deletion request | 
**Status** | [**ConversionDeletionRequestStatus**](ConversionDeletionRequestStatus.md) | Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled. | [readonly] 

## Methods

### NewConversionDeletionRequest

`func NewConversionDeletionRequest(createdTime string, requestId string, status ConversionDeletionRequestStatus, ) *ConversionDeletionRequest`

NewConversionDeletionRequest instantiates a new ConversionDeletionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionDeletionRequestWithDefaults

`func NewConversionDeletionRequestWithDefaults() *ConversionDeletionRequest`

NewConversionDeletionRequestWithDefaults instantiates a new ConversionDeletionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreatedTime

`func (o *ConversionDeletionRequest) GetCreatedTime() string`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *ConversionDeletionRequest) GetCreatedTimeOk() (*string, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *ConversionDeletionRequest) SetCreatedTime(v string)`

SetCreatedTime sets CreatedTime field to given value.


### GetProcessedTime

`func (o *ConversionDeletionRequest) GetProcessedTime() string`

GetProcessedTime returns the ProcessedTime field if non-nil, zero value otherwise.

### GetProcessedTimeOk

`func (o *ConversionDeletionRequest) GetProcessedTimeOk() (*string, bool)`

GetProcessedTimeOk returns a tuple with the ProcessedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProcessedTime

`func (o *ConversionDeletionRequest) SetProcessedTime(v string)`

SetProcessedTime sets ProcessedTime field to given value.

### HasProcessedTime

`func (o *ConversionDeletionRequest) HasProcessedTime() bool`

HasProcessedTime returns a boolean if a field has been set.

### SetProcessedTimeNil

`func (o *ConversionDeletionRequest) SetProcessedTimeNil(b bool)`

 SetProcessedTimeNil sets the value for ProcessedTime to be an explicit nil

### UnsetProcessedTime
`func (o *ConversionDeletionRequest) UnsetProcessedTime()`

UnsetProcessedTime ensures that no value is present for ProcessedTime, not even an explicit nil
### GetRequestId

`func (o *ConversionDeletionRequest) GetRequestId() string`

GetRequestId returns the RequestId field if non-nil, zero value otherwise.

### GetRequestIdOk

`func (o *ConversionDeletionRequest) GetRequestIdOk() (*string, bool)`

GetRequestIdOk returns a tuple with the RequestId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestId

`func (o *ConversionDeletionRequest) SetRequestId(v string)`

SetRequestId sets RequestId field to given value.


### GetStatus

`func (o *ConversionDeletionRequest) GetStatus() ConversionDeletionRequestStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ConversionDeletionRequest) GetStatusOk() (*ConversionDeletionRequestStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ConversionDeletionRequest) SetStatus(v ConversionDeletionRequestStatus)`

SetStatus sets Status field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


