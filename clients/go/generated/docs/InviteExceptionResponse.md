# InviteExceptionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InviteOrRequestId** | Pointer to **NullableString** | Unique identifier of the invite/request. | [optional] 
**Code** | Pointer to **int32** | Error code associated with the error in performing the action on the invite/request. | [optional] 
**Message** | Pointer to **string** | Error message associated with the error in performing the action on the invite/request. | [optional] 
**UsersOrPartnerIds** | Pointer to **[]string** | A list of users&#39; usernames or emails OR a list of partner ids that caused the error. | [optional] 

## Methods

### NewInviteExceptionResponse

`func NewInviteExceptionResponse() *InviteExceptionResponse`

NewInviteExceptionResponse instantiates a new InviteExceptionResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInviteExceptionResponseWithDefaults

`func NewInviteExceptionResponseWithDefaults() *InviteExceptionResponse`

NewInviteExceptionResponseWithDefaults instantiates a new InviteExceptionResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInviteOrRequestId

`func (o *InviteExceptionResponse) GetInviteOrRequestId() string`

GetInviteOrRequestId returns the InviteOrRequestId field if non-nil, zero value otherwise.

### GetInviteOrRequestIdOk

`func (o *InviteExceptionResponse) GetInviteOrRequestIdOk() (*string, bool)`

GetInviteOrRequestIdOk returns a tuple with the InviteOrRequestId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteOrRequestId

`func (o *InviteExceptionResponse) SetInviteOrRequestId(v string)`

SetInviteOrRequestId sets InviteOrRequestId field to given value.

### HasInviteOrRequestId

`func (o *InviteExceptionResponse) HasInviteOrRequestId() bool`

HasInviteOrRequestId returns a boolean if a field has been set.

### SetInviteOrRequestIdNil

`func (o *InviteExceptionResponse) SetInviteOrRequestIdNil(b bool)`

 SetInviteOrRequestIdNil sets the value for InviteOrRequestId to be an explicit nil

### UnsetInviteOrRequestId
`func (o *InviteExceptionResponse) UnsetInviteOrRequestId()`

UnsetInviteOrRequestId ensures that no value is present for InviteOrRequestId, not even an explicit nil
### GetCode

`func (o *InviteExceptionResponse) GetCode() int32`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *InviteExceptionResponse) GetCodeOk() (*int32, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *InviteExceptionResponse) SetCode(v int32)`

SetCode sets Code field to given value.

### HasCode

`func (o *InviteExceptionResponse) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetMessage

`func (o *InviteExceptionResponse) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *InviteExceptionResponse) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *InviteExceptionResponse) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *InviteExceptionResponse) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetUsersOrPartnerIds

`func (o *InviteExceptionResponse) GetUsersOrPartnerIds() []string`

GetUsersOrPartnerIds returns the UsersOrPartnerIds field if non-nil, zero value otherwise.

### GetUsersOrPartnerIdsOk

`func (o *InviteExceptionResponse) GetUsersOrPartnerIdsOk() (*[]string, bool)`

GetUsersOrPartnerIdsOk returns a tuple with the UsersOrPartnerIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsersOrPartnerIds

`func (o *InviteExceptionResponse) SetUsersOrPartnerIds(v []string)`

SetUsersOrPartnerIds sets UsersOrPartnerIds field to given value.

### HasUsersOrPartnerIds

`func (o *InviteExceptionResponse) HasUsersOrPartnerIds() bool`

HasUsersOrPartnerIds returns a boolean if a field has been set.

### SetUsersOrPartnerIdsNil

`func (o *InviteExceptionResponse) SetUsersOrPartnerIdsNil(b bool)`

 SetUsersOrPartnerIdsNil sets the value for UsersOrPartnerIds to be an explicit nil

### UnsetUsersOrPartnerIds
`func (o *InviteExceptionResponse) UnsetUsersOrPartnerIds()`

UnsetUsersOrPartnerIds ensures that no value is present for UsersOrPartnerIds, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


