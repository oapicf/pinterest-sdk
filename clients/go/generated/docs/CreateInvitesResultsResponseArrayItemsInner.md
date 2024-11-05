# CreateInvitesResultsResponseArrayItemsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exception** | Pointer to [**NullableInviteExceptionResponse**](InviteExceptionResponse.md) |  | [optional] 
**Invite** | Pointer to [**NullableCreateInvitesResultsResponseArrayItemsInnerInvite**](CreateInvitesResultsResponseArrayItemsInnerInvite.md) |  | [optional] 

## Methods

### NewCreateInvitesResultsResponseArrayItemsInner

`func NewCreateInvitesResultsResponseArrayItemsInner() *CreateInvitesResultsResponseArrayItemsInner`

NewCreateInvitesResultsResponseArrayItemsInner instantiates a new CreateInvitesResultsResponseArrayItemsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateInvitesResultsResponseArrayItemsInnerWithDefaults

`func NewCreateInvitesResultsResponseArrayItemsInnerWithDefaults() *CreateInvitesResultsResponseArrayItemsInner`

NewCreateInvitesResultsResponseArrayItemsInnerWithDefaults instantiates a new CreateInvitesResultsResponseArrayItemsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetException

`func (o *CreateInvitesResultsResponseArrayItemsInner) GetException() InviteExceptionResponse`

GetException returns the Exception field if non-nil, zero value otherwise.

### GetExceptionOk

`func (o *CreateInvitesResultsResponseArrayItemsInner) GetExceptionOk() (*InviteExceptionResponse, bool)`

GetExceptionOk returns a tuple with the Exception field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetException

`func (o *CreateInvitesResultsResponseArrayItemsInner) SetException(v InviteExceptionResponse)`

SetException sets Exception field to given value.

### HasException

`func (o *CreateInvitesResultsResponseArrayItemsInner) HasException() bool`

HasException returns a boolean if a field has been set.

### SetExceptionNil

`func (o *CreateInvitesResultsResponseArrayItemsInner) SetExceptionNil(b bool)`

 SetExceptionNil sets the value for Exception to be an explicit nil

### UnsetException
`func (o *CreateInvitesResultsResponseArrayItemsInner) UnsetException()`

UnsetException ensures that no value is present for Exception, not even an explicit nil
### GetInvite

`func (o *CreateInvitesResultsResponseArrayItemsInner) GetInvite() CreateInvitesResultsResponseArrayItemsInnerInvite`

GetInvite returns the Invite field if non-nil, zero value otherwise.

### GetInviteOk

`func (o *CreateInvitesResultsResponseArrayItemsInner) GetInviteOk() (*CreateInvitesResultsResponseArrayItemsInnerInvite, bool)`

GetInviteOk returns a tuple with the Invite field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInvite

`func (o *CreateInvitesResultsResponseArrayItemsInner) SetInvite(v CreateInvitesResultsResponseArrayItemsInnerInvite)`

SetInvite sets Invite field to given value.

### HasInvite

`func (o *CreateInvitesResultsResponseArrayItemsInner) HasInvite() bool`

HasInvite returns a boolean if a field has been set.

### SetInviteNil

`func (o *CreateInvitesResultsResponseArrayItemsInner) SetInviteNil(b bool)`

 SetInviteNil sets the value for Invite to be an explicit nil

### UnsetInvite
`func (o *CreateInvitesResultsResponseArrayItemsInner) UnsetInvite()`

UnsetInvite ensures that no value is present for Invite, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


