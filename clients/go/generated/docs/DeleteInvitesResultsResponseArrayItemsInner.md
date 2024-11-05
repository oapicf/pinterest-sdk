# DeleteInvitesResultsResponseArrayItemsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exception** | Pointer to [**NullableDeleteInvitesResultsResponseArrayItemsInnerException**](DeleteInvitesResultsResponseArrayItemsInnerException.md) |  | [optional] 
**Invite** | Pointer to [**NullableBaseInviteDataResponse**](BaseInviteDataResponse.md) |  | [optional] 

## Methods

### NewDeleteInvitesResultsResponseArrayItemsInner

`func NewDeleteInvitesResultsResponseArrayItemsInner() *DeleteInvitesResultsResponseArrayItemsInner`

NewDeleteInvitesResultsResponseArrayItemsInner instantiates a new DeleteInvitesResultsResponseArrayItemsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeleteInvitesResultsResponseArrayItemsInnerWithDefaults

`func NewDeleteInvitesResultsResponseArrayItemsInnerWithDefaults() *DeleteInvitesResultsResponseArrayItemsInner`

NewDeleteInvitesResultsResponseArrayItemsInnerWithDefaults instantiates a new DeleteInvitesResultsResponseArrayItemsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetException

`func (o *DeleteInvitesResultsResponseArrayItemsInner) GetException() DeleteInvitesResultsResponseArrayItemsInnerException`

GetException returns the Exception field if non-nil, zero value otherwise.

### GetExceptionOk

`func (o *DeleteInvitesResultsResponseArrayItemsInner) GetExceptionOk() (*DeleteInvitesResultsResponseArrayItemsInnerException, bool)`

GetExceptionOk returns a tuple with the Exception field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetException

`func (o *DeleteInvitesResultsResponseArrayItemsInner) SetException(v DeleteInvitesResultsResponseArrayItemsInnerException)`

SetException sets Exception field to given value.

### HasException

`func (o *DeleteInvitesResultsResponseArrayItemsInner) HasException() bool`

HasException returns a boolean if a field has been set.

### SetExceptionNil

`func (o *DeleteInvitesResultsResponseArrayItemsInner) SetExceptionNil(b bool)`

 SetExceptionNil sets the value for Exception to be an explicit nil

### UnsetException
`func (o *DeleteInvitesResultsResponseArrayItemsInner) UnsetException()`

UnsetException ensures that no value is present for Exception, not even an explicit nil
### GetInvite

`func (o *DeleteInvitesResultsResponseArrayItemsInner) GetInvite() BaseInviteDataResponse`

GetInvite returns the Invite field if non-nil, zero value otherwise.

### GetInviteOk

`func (o *DeleteInvitesResultsResponseArrayItemsInner) GetInviteOk() (*BaseInviteDataResponse, bool)`

GetInviteOk returns a tuple with the Invite field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInvite

`func (o *DeleteInvitesResultsResponseArrayItemsInner) SetInvite(v BaseInviteDataResponse)`

SetInvite sets Invite field to given value.

### HasInvite

`func (o *DeleteInvitesResultsResponseArrayItemsInner) HasInvite() bool`

HasInvite returns a boolean if a field has been set.

### SetInviteNil

`func (o *DeleteInvitesResultsResponseArrayItemsInner) SetInviteNil(b bool)`

 SetInviteNil sets the value for Invite to be an explicit nil

### UnsetInvite
`func (o *DeleteInvitesResultsResponseArrayItemsInner) UnsetInvite()`

UnsetInvite ensures that no value is present for Invite, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


