# CancelInviteResultItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exception** | Pointer to [**NullableCancelInviteException**](CancelInviteException.md) |  | [optional] 
**Invite** | Pointer to [**NullableCancelInviteResult**](CancelInviteResult.md) |  | [optional] 

## Methods

### NewCancelInviteResultItem

`func NewCancelInviteResultItem() *CancelInviteResultItem`

NewCancelInviteResultItem instantiates a new CancelInviteResultItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCancelInviteResultItemWithDefaults

`func NewCancelInviteResultItemWithDefaults() *CancelInviteResultItem`

NewCancelInviteResultItemWithDefaults instantiates a new CancelInviteResultItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetException

`func (o *CancelInviteResultItem) GetException() CancelInviteException`

GetException returns the Exception field if non-nil, zero value otherwise.

### GetExceptionOk

`func (o *CancelInviteResultItem) GetExceptionOk() (*CancelInviteException, bool)`

GetExceptionOk returns a tuple with the Exception field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetException

`func (o *CancelInviteResultItem) SetException(v CancelInviteException)`

SetException sets Exception field to given value.

### HasException

`func (o *CancelInviteResultItem) HasException() bool`

HasException returns a boolean if a field has been set.

### SetExceptionNil

`func (o *CancelInviteResultItem) SetExceptionNil(b bool)`

 SetExceptionNil sets the value for Exception to be an explicit nil

### UnsetException
`func (o *CancelInviteResultItem) UnsetException()`

UnsetException ensures that no value is present for Exception, not even an explicit nil
### GetInvite

`func (o *CancelInviteResultItem) GetInvite() CancelInviteResult`

GetInvite returns the Invite field if non-nil, zero value otherwise.

### GetInviteOk

`func (o *CancelInviteResultItem) GetInviteOk() (*CancelInviteResult, bool)`

GetInviteOk returns a tuple with the Invite field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInvite

`func (o *CancelInviteResultItem) SetInvite(v CancelInviteResult)`

SetInvite sets Invite field to given value.

### HasInvite

`func (o *CancelInviteResultItem) HasInvite() bool`

HasInvite returns a boolean if a field has been set.

### SetInviteNil

`func (o *CancelInviteResultItem) SetInviteNil(b bool)`

 SetInviteNil sets the value for Invite to be an explicit nil

### UnsetInvite
`func (o *CancelInviteResultItem) UnsetInvite()`

UnsetInvite ensures that no value is present for Invite, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


