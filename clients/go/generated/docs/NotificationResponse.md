# NotificationResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Success** | Pointer to **bool** | Returns true if the notification accepted. | [optional] 
**ReceivedAt** | Pointer to **int32** | Received time. Unix timestamp in seconds. | [optional] 
**ErrorMsg** | Pointer to **string** | error message when success is false | [optional] 

## Methods

### NewNotificationResponse

`func NewNotificationResponse() *NotificationResponse`

NewNotificationResponse instantiates a new NotificationResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNotificationResponseWithDefaults

`func NewNotificationResponseWithDefaults() *NotificationResponse`

NewNotificationResponseWithDefaults instantiates a new NotificationResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSuccess

`func (o *NotificationResponse) GetSuccess() bool`

GetSuccess returns the Success field if non-nil, zero value otherwise.

### GetSuccessOk

`func (o *NotificationResponse) GetSuccessOk() (*bool, bool)`

GetSuccessOk returns a tuple with the Success field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuccess

`func (o *NotificationResponse) SetSuccess(v bool)`

SetSuccess sets Success field to given value.

### HasSuccess

`func (o *NotificationResponse) HasSuccess() bool`

HasSuccess returns a boolean if a field has been set.

### GetReceivedAt

`func (o *NotificationResponse) GetReceivedAt() int32`

GetReceivedAt returns the ReceivedAt field if non-nil, zero value otherwise.

### GetReceivedAtOk

`func (o *NotificationResponse) GetReceivedAtOk() (*int32, bool)`

GetReceivedAtOk returns a tuple with the ReceivedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReceivedAt

`func (o *NotificationResponse) SetReceivedAt(v int32)`

SetReceivedAt sets ReceivedAt field to given value.

### HasReceivedAt

`func (o *NotificationResponse) HasReceivedAt() bool`

HasReceivedAt returns a boolean if a field has been set.

### GetErrorMsg

`func (o *NotificationResponse) GetErrorMsg() string`

GetErrorMsg returns the ErrorMsg field if non-nil, zero value otherwise.

### GetErrorMsgOk

`func (o *NotificationResponse) GetErrorMsgOk() (*string, bool)`

GetErrorMsgOk returns a tuple with the ErrorMsg field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrorMsg

`func (o *NotificationResponse) SetErrorMsg(v string)`

SetErrorMsg sets ErrorMsg field to given value.

### HasErrorMsg

`func (o *NotificationResponse) HasErrorMsg() bool`

HasErrorMsg returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


