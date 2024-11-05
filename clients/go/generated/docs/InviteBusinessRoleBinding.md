# InviteBusinessRoleBinding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedByBusinessId** | Pointer to **string** | Unique identifier for the business that created the invite/request. | [optional] 
**CreatedByUserId** | Pointer to **string** | Unique identifier for the user that created the invite/request. | [optional] 
**User** | Pointer to [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that updated the invite/request. | [optional] 
**Id** | Pointer to **string** | Unique identifier of the invite/request. | [optional] 
**InviteData** | Pointer to [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional] 
**IsReceivedInvite** | Pointer to **bool** | Indicates whether the invite/request was received. | [optional] 

## Methods

### NewInviteBusinessRoleBinding

`func NewInviteBusinessRoleBinding() *InviteBusinessRoleBinding`

NewInviteBusinessRoleBinding instantiates a new InviteBusinessRoleBinding object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInviteBusinessRoleBindingWithDefaults

`func NewInviteBusinessRoleBindingWithDefaults() *InviteBusinessRoleBinding`

NewInviteBusinessRoleBindingWithDefaults instantiates a new InviteBusinessRoleBinding object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreatedByBusinessId

`func (o *InviteBusinessRoleBinding) GetCreatedByBusinessId() string`

GetCreatedByBusinessId returns the CreatedByBusinessId field if non-nil, zero value otherwise.

### GetCreatedByBusinessIdOk

`func (o *InviteBusinessRoleBinding) GetCreatedByBusinessIdOk() (*string, bool)`

GetCreatedByBusinessIdOk returns a tuple with the CreatedByBusinessId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedByBusinessId

`func (o *InviteBusinessRoleBinding) SetCreatedByBusinessId(v string)`

SetCreatedByBusinessId sets CreatedByBusinessId field to given value.

### HasCreatedByBusinessId

`func (o *InviteBusinessRoleBinding) HasCreatedByBusinessId() bool`

HasCreatedByBusinessId returns a boolean if a field has been set.

### GetCreatedByUserId

`func (o *InviteBusinessRoleBinding) GetCreatedByUserId() string`

GetCreatedByUserId returns the CreatedByUserId field if non-nil, zero value otherwise.

### GetCreatedByUserIdOk

`func (o *InviteBusinessRoleBinding) GetCreatedByUserIdOk() (*string, bool)`

GetCreatedByUserIdOk returns a tuple with the CreatedByUserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedByUserId

`func (o *InviteBusinessRoleBinding) SetCreatedByUserId(v string)`

SetCreatedByUserId sets CreatedByUserId field to given value.

### HasCreatedByUserId

`func (o *InviteBusinessRoleBinding) HasCreatedByUserId() bool`

HasCreatedByUserId returns a boolean if a field has been set.

### GetUser

`func (o *InviteBusinessRoleBinding) GetUser() BusinessAccessUserSummary`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *InviteBusinessRoleBinding) GetUserOk() (*BusinessAccessUserSummary, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *InviteBusinessRoleBinding) SetUser(v BusinessAccessUserSummary)`

SetUser sets User field to given value.

### HasUser

`func (o *InviteBusinessRoleBinding) HasUser() bool`

HasUser returns a boolean if a field has been set.

### GetId

`func (o *InviteBusinessRoleBinding) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *InviteBusinessRoleBinding) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *InviteBusinessRoleBinding) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *InviteBusinessRoleBinding) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInviteData

`func (o *InviteBusinessRoleBinding) GetInviteData() BaseInviteDataResponseInviteData`

GetInviteData returns the InviteData field if non-nil, zero value otherwise.

### GetInviteDataOk

`func (o *InviteBusinessRoleBinding) GetInviteDataOk() (*BaseInviteDataResponseInviteData, bool)`

GetInviteDataOk returns a tuple with the InviteData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteData

`func (o *InviteBusinessRoleBinding) SetInviteData(v BaseInviteDataResponseInviteData)`

SetInviteData sets InviteData field to given value.

### HasInviteData

`func (o *InviteBusinessRoleBinding) HasInviteData() bool`

HasInviteData returns a boolean if a field has been set.

### GetIsReceivedInvite

`func (o *InviteBusinessRoleBinding) GetIsReceivedInvite() bool`

GetIsReceivedInvite returns the IsReceivedInvite field if non-nil, zero value otherwise.

### GetIsReceivedInviteOk

`func (o *InviteBusinessRoleBinding) GetIsReceivedInviteOk() (*bool, bool)`

GetIsReceivedInviteOk returns a tuple with the IsReceivedInvite field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsReceivedInvite

`func (o *InviteBusinessRoleBinding) SetIsReceivedInvite(v bool)`

SetIsReceivedInvite sets IsReceivedInvite field to given value.

### HasIsReceivedInvite

`func (o *InviteBusinessRoleBinding) HasIsReceivedInvite() bool`

HasIsReceivedInvite returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


