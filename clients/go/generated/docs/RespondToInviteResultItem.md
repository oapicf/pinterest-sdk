# RespondToInviteResultItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exception** | Pointer to [**NullableInviteExceptionResponse**](InviteExceptionResponse.md) |  | [optional] 
**Invite** | Pointer to [**NullableBaseInviteDataResponse**](BaseInviteDataResponse.md) | An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created. | [optional] 

## Methods

### NewRespondToInviteResultItem

`func NewRespondToInviteResultItem() *RespondToInviteResultItem`

NewRespondToInviteResultItem instantiates a new RespondToInviteResultItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRespondToInviteResultItemWithDefaults

`func NewRespondToInviteResultItemWithDefaults() *RespondToInviteResultItem`

NewRespondToInviteResultItemWithDefaults instantiates a new RespondToInviteResultItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetException

`func (o *RespondToInviteResultItem) GetException() InviteExceptionResponse`

GetException returns the Exception field if non-nil, zero value otherwise.

### GetExceptionOk

`func (o *RespondToInviteResultItem) GetExceptionOk() (*InviteExceptionResponse, bool)`

GetExceptionOk returns a tuple with the Exception field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetException

`func (o *RespondToInviteResultItem) SetException(v InviteExceptionResponse)`

SetException sets Exception field to given value.

### HasException

`func (o *RespondToInviteResultItem) HasException() bool`

HasException returns a boolean if a field has been set.

### SetExceptionNil

`func (o *RespondToInviteResultItem) SetExceptionNil(b bool)`

 SetExceptionNil sets the value for Exception to be an explicit nil

### UnsetException
`func (o *RespondToInviteResultItem) UnsetException()`

UnsetException ensures that no value is present for Exception, not even an explicit nil
### GetInvite

`func (o *RespondToInviteResultItem) GetInvite() BaseInviteDataResponse`

GetInvite returns the Invite field if non-nil, zero value otherwise.

### GetInviteOk

`func (o *RespondToInviteResultItem) GetInviteOk() (*BaseInviteDataResponse, bool)`

GetInviteOk returns a tuple with the Invite field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInvite

`func (o *RespondToInviteResultItem) SetInvite(v BaseInviteDataResponse)`

SetInvite sets Invite field to given value.

### HasInvite

`func (o *RespondToInviteResultItem) HasInvite() bool`

HasInvite returns a boolean if a field has been set.

### SetInviteNil

`func (o *RespondToInviteResultItem) SetInviteNil(b bool)`

 SetInviteNil sets the value for Invite to be an explicit nil

### UnsetInvite
`func (o *RespondToInviteResultItem) UnsetInvite()`

UnsetInvite ensures that no value is present for Invite, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


