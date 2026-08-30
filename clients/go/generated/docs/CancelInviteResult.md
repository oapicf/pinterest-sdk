# CancelInviteResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** |  | [optional] 
**InviteData** | Pointer to [**InviteDataResponse**](InviteDataResponse.md) |  | [optional] 
**IsReceivedInvite** | Pointer to **bool** |  | [optional] 
**User** | Pointer to [**CancelInviteResultUser**](CancelInviteResultUser.md) |  | [optional] 

## Methods

### NewCancelInviteResult

`func NewCancelInviteResult() *CancelInviteResult`

NewCancelInviteResult instantiates a new CancelInviteResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCancelInviteResultWithDefaults

`func NewCancelInviteResultWithDefaults() *CancelInviteResult`

NewCancelInviteResultWithDefaults instantiates a new CancelInviteResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CancelInviteResult) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CancelInviteResult) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CancelInviteResult) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *CancelInviteResult) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInviteData

`func (o *CancelInviteResult) GetInviteData() InviteDataResponse`

GetInviteData returns the InviteData field if non-nil, zero value otherwise.

### GetInviteDataOk

`func (o *CancelInviteResult) GetInviteDataOk() (*InviteDataResponse, bool)`

GetInviteDataOk returns a tuple with the InviteData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteData

`func (o *CancelInviteResult) SetInviteData(v InviteDataResponse)`

SetInviteData sets InviteData field to given value.

### HasInviteData

`func (o *CancelInviteResult) HasInviteData() bool`

HasInviteData returns a boolean if a field has been set.

### GetIsReceivedInvite

`func (o *CancelInviteResult) GetIsReceivedInvite() bool`

GetIsReceivedInvite returns the IsReceivedInvite field if non-nil, zero value otherwise.

### GetIsReceivedInviteOk

`func (o *CancelInviteResult) GetIsReceivedInviteOk() (*bool, bool)`

GetIsReceivedInviteOk returns a tuple with the IsReceivedInvite field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsReceivedInvite

`func (o *CancelInviteResult) SetIsReceivedInvite(v bool)`

SetIsReceivedInvite sets IsReceivedInvite field to given value.

### HasIsReceivedInvite

`func (o *CancelInviteResult) HasIsReceivedInvite() bool`

HasIsReceivedInvite returns a boolean if a field has been set.

### GetUser

`func (o *CancelInviteResult) GetUser() CancelInviteResultUser`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *CancelInviteResult) GetUserOk() (*CancelInviteResultUser, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *CancelInviteResult) SetUser(v CancelInviteResultUser)`

SetUser sets User field to given value.

### HasUser

`func (o *CancelInviteResult) HasUser() bool`

HasUser returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


