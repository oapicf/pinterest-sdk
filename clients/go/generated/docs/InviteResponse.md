# InviteResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetsSummary** | Pointer to [**NullableInviteAssetsSummary**](InviteAssetsSummary.md) |  | [optional] 
**BusinessRoles** | Pointer to **[]string** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] 
**CreatedByBusiness** | Pointer to [**NullableBusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. | [optional] 
**CreatedByUser** | Pointer to [**NullableBusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. | [optional] 
**CreatedTime** | Pointer to **int32** | The time the invite/request was created. Returned in milliseconds. | [optional] 
**Id** | Pointer to **string** | Unique identifier of the invite/request. | [optional] 
**InviteData** | Pointer to [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional] 
**IsReceivedInvite** | Pointer to **bool** | Indicates whether the invite/request was received. | [optional] 
**User** | Pointer to [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] 

## Methods

### NewInviteResponse

`func NewInviteResponse() *InviteResponse`

NewInviteResponse instantiates a new InviteResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInviteResponseWithDefaults

`func NewInviteResponseWithDefaults() *InviteResponse`

NewInviteResponseWithDefaults instantiates a new InviteResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetsSummary

`func (o *InviteResponse) GetAssetsSummary() InviteAssetsSummary`

GetAssetsSummary returns the AssetsSummary field if non-nil, zero value otherwise.

### GetAssetsSummaryOk

`func (o *InviteResponse) GetAssetsSummaryOk() (*InviteAssetsSummary, bool)`

GetAssetsSummaryOk returns a tuple with the AssetsSummary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetsSummary

`func (o *InviteResponse) SetAssetsSummary(v InviteAssetsSummary)`

SetAssetsSummary sets AssetsSummary field to given value.

### HasAssetsSummary

`func (o *InviteResponse) HasAssetsSummary() bool`

HasAssetsSummary returns a boolean if a field has been set.

### SetAssetsSummaryNil

`func (o *InviteResponse) SetAssetsSummaryNil(b bool)`

 SetAssetsSummaryNil sets the value for AssetsSummary to be an explicit nil

### UnsetAssetsSummary
`func (o *InviteResponse) UnsetAssetsSummary()`

UnsetAssetsSummary ensures that no value is present for AssetsSummary, not even an explicit nil
### GetBusinessRoles

`func (o *InviteResponse) GetBusinessRoles() []string`

GetBusinessRoles returns the BusinessRoles field if non-nil, zero value otherwise.

### GetBusinessRolesOk

`func (o *InviteResponse) GetBusinessRolesOk() (*[]string, bool)`

GetBusinessRolesOk returns a tuple with the BusinessRoles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessRoles

`func (o *InviteResponse) SetBusinessRoles(v []string)`

SetBusinessRoles sets BusinessRoles field to given value.

### HasBusinessRoles

`func (o *InviteResponse) HasBusinessRoles() bool`

HasBusinessRoles returns a boolean if a field has been set.

### GetCreatedByBusiness

`func (o *InviteResponse) GetCreatedByBusiness() BusinessAccessUserSummary`

GetCreatedByBusiness returns the CreatedByBusiness field if non-nil, zero value otherwise.

### GetCreatedByBusinessOk

`func (o *InviteResponse) GetCreatedByBusinessOk() (*BusinessAccessUserSummary, bool)`

GetCreatedByBusinessOk returns a tuple with the CreatedByBusiness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedByBusiness

`func (o *InviteResponse) SetCreatedByBusiness(v BusinessAccessUserSummary)`

SetCreatedByBusiness sets CreatedByBusiness field to given value.

### HasCreatedByBusiness

`func (o *InviteResponse) HasCreatedByBusiness() bool`

HasCreatedByBusiness returns a boolean if a field has been set.

### SetCreatedByBusinessNil

`func (o *InviteResponse) SetCreatedByBusinessNil(b bool)`

 SetCreatedByBusinessNil sets the value for CreatedByBusiness to be an explicit nil

### UnsetCreatedByBusiness
`func (o *InviteResponse) UnsetCreatedByBusiness()`

UnsetCreatedByBusiness ensures that no value is present for CreatedByBusiness, not even an explicit nil
### GetCreatedByUser

`func (o *InviteResponse) GetCreatedByUser() BusinessAccessUserSummary`

GetCreatedByUser returns the CreatedByUser field if non-nil, zero value otherwise.

### GetCreatedByUserOk

`func (o *InviteResponse) GetCreatedByUserOk() (*BusinessAccessUserSummary, bool)`

GetCreatedByUserOk returns a tuple with the CreatedByUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedByUser

`func (o *InviteResponse) SetCreatedByUser(v BusinessAccessUserSummary)`

SetCreatedByUser sets CreatedByUser field to given value.

### HasCreatedByUser

`func (o *InviteResponse) HasCreatedByUser() bool`

HasCreatedByUser returns a boolean if a field has been set.

### SetCreatedByUserNil

`func (o *InviteResponse) SetCreatedByUserNil(b bool)`

 SetCreatedByUserNil sets the value for CreatedByUser to be an explicit nil

### UnsetCreatedByUser
`func (o *InviteResponse) UnsetCreatedByUser()`

UnsetCreatedByUser ensures that no value is present for CreatedByUser, not even an explicit nil
### GetCreatedTime

`func (o *InviteResponse) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *InviteResponse) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *InviteResponse) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *InviteResponse) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetId

`func (o *InviteResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *InviteResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *InviteResponse) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *InviteResponse) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInviteData

`func (o *InviteResponse) GetInviteData() BaseInviteDataResponseInviteData`

GetInviteData returns the InviteData field if non-nil, zero value otherwise.

### GetInviteDataOk

`func (o *InviteResponse) GetInviteDataOk() (*BaseInviteDataResponseInviteData, bool)`

GetInviteDataOk returns a tuple with the InviteData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteData

`func (o *InviteResponse) SetInviteData(v BaseInviteDataResponseInviteData)`

SetInviteData sets InviteData field to given value.

### HasInviteData

`func (o *InviteResponse) HasInviteData() bool`

HasInviteData returns a boolean if a field has been set.

### GetIsReceivedInvite

`func (o *InviteResponse) GetIsReceivedInvite() bool`

GetIsReceivedInvite returns the IsReceivedInvite field if non-nil, zero value otherwise.

### GetIsReceivedInviteOk

`func (o *InviteResponse) GetIsReceivedInviteOk() (*bool, bool)`

GetIsReceivedInviteOk returns a tuple with the IsReceivedInvite field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsReceivedInvite

`func (o *InviteResponse) SetIsReceivedInvite(v bool)`

SetIsReceivedInvite sets IsReceivedInvite field to given value.

### HasIsReceivedInvite

`func (o *InviteResponse) HasIsReceivedInvite() bool`

HasIsReceivedInvite returns a boolean if a field has been set.

### GetUser

`func (o *InviteResponse) GetUser() BusinessAccessUserSummary`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *InviteResponse) GetUserOk() (*BusinessAccessUserSummary, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *InviteResponse) SetUser(v BusinessAccessUserSummary)`

SetUser sets User field to given value.

### HasUser

`func (o *InviteResponse) HasUser() bool`

HasUser returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


