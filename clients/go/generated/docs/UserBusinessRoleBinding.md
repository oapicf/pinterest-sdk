# UserBusinessRoleBinding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetsSummary** | Pointer to [**NullableBusinessMemberAssetsSummary**](BusinessMemberAssetsSummary.md) |  | [optional] 
**BusinessRoles** | Pointer to **[]string** | The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] 
**CreatedByBusiness** | Pointer to [**NullableBusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the business relationship. | [optional] 
**CreatedByUser** | Pointer to [**NullableBusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the business relationship. | [optional] 
**CreatedTime** | Pointer to **NullableInt32** | The time the business relationship was created. Returned in milliseconds. | [optional] 
**Id** | Pointer to **string** | Unique identifier of the business member/business partner/employer. | [optional] 
**IsSharedPartner** | Pointer to **bool** | This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. &lt;br&gt;If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. &lt;br&gt;If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to. | [optional] 
**User** | Pointer to [**NullableBusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business member/business partner/employer. | [optional] 

## Methods

### NewUserBusinessRoleBinding

`func NewUserBusinessRoleBinding() *UserBusinessRoleBinding`

NewUserBusinessRoleBinding instantiates a new UserBusinessRoleBinding object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUserBusinessRoleBindingWithDefaults

`func NewUserBusinessRoleBindingWithDefaults() *UserBusinessRoleBinding`

NewUserBusinessRoleBindingWithDefaults instantiates a new UserBusinessRoleBinding object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetsSummary

`func (o *UserBusinessRoleBinding) GetAssetsSummary() BusinessMemberAssetsSummary`

GetAssetsSummary returns the AssetsSummary field if non-nil, zero value otherwise.

### GetAssetsSummaryOk

`func (o *UserBusinessRoleBinding) GetAssetsSummaryOk() (*BusinessMemberAssetsSummary, bool)`

GetAssetsSummaryOk returns a tuple with the AssetsSummary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetsSummary

`func (o *UserBusinessRoleBinding) SetAssetsSummary(v BusinessMemberAssetsSummary)`

SetAssetsSummary sets AssetsSummary field to given value.

### HasAssetsSummary

`func (o *UserBusinessRoleBinding) HasAssetsSummary() bool`

HasAssetsSummary returns a boolean if a field has been set.

### SetAssetsSummaryNil

`func (o *UserBusinessRoleBinding) SetAssetsSummaryNil(b bool)`

 SetAssetsSummaryNil sets the value for AssetsSummary to be an explicit nil

### UnsetAssetsSummary
`func (o *UserBusinessRoleBinding) UnsetAssetsSummary()`

UnsetAssetsSummary ensures that no value is present for AssetsSummary, not even an explicit nil
### GetBusinessRoles

`func (o *UserBusinessRoleBinding) GetBusinessRoles() []string`

GetBusinessRoles returns the BusinessRoles field if non-nil, zero value otherwise.

### GetBusinessRolesOk

`func (o *UserBusinessRoleBinding) GetBusinessRolesOk() (*[]string, bool)`

GetBusinessRolesOk returns a tuple with the BusinessRoles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessRoles

`func (o *UserBusinessRoleBinding) SetBusinessRoles(v []string)`

SetBusinessRoles sets BusinessRoles field to given value.

### HasBusinessRoles

`func (o *UserBusinessRoleBinding) HasBusinessRoles() bool`

HasBusinessRoles returns a boolean if a field has been set.

### GetCreatedByBusiness

`func (o *UserBusinessRoleBinding) GetCreatedByBusiness() BusinessAccessUserSummary`

GetCreatedByBusiness returns the CreatedByBusiness field if non-nil, zero value otherwise.

### GetCreatedByBusinessOk

`func (o *UserBusinessRoleBinding) GetCreatedByBusinessOk() (*BusinessAccessUserSummary, bool)`

GetCreatedByBusinessOk returns a tuple with the CreatedByBusiness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedByBusiness

`func (o *UserBusinessRoleBinding) SetCreatedByBusiness(v BusinessAccessUserSummary)`

SetCreatedByBusiness sets CreatedByBusiness field to given value.

### HasCreatedByBusiness

`func (o *UserBusinessRoleBinding) HasCreatedByBusiness() bool`

HasCreatedByBusiness returns a boolean if a field has been set.

### SetCreatedByBusinessNil

`func (o *UserBusinessRoleBinding) SetCreatedByBusinessNil(b bool)`

 SetCreatedByBusinessNil sets the value for CreatedByBusiness to be an explicit nil

### UnsetCreatedByBusiness
`func (o *UserBusinessRoleBinding) UnsetCreatedByBusiness()`

UnsetCreatedByBusiness ensures that no value is present for CreatedByBusiness, not even an explicit nil
### GetCreatedByUser

`func (o *UserBusinessRoleBinding) GetCreatedByUser() BusinessAccessUserSummary`

GetCreatedByUser returns the CreatedByUser field if non-nil, zero value otherwise.

### GetCreatedByUserOk

`func (o *UserBusinessRoleBinding) GetCreatedByUserOk() (*BusinessAccessUserSummary, bool)`

GetCreatedByUserOk returns a tuple with the CreatedByUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedByUser

`func (o *UserBusinessRoleBinding) SetCreatedByUser(v BusinessAccessUserSummary)`

SetCreatedByUser sets CreatedByUser field to given value.

### HasCreatedByUser

`func (o *UserBusinessRoleBinding) HasCreatedByUser() bool`

HasCreatedByUser returns a boolean if a field has been set.

### SetCreatedByUserNil

`func (o *UserBusinessRoleBinding) SetCreatedByUserNil(b bool)`

 SetCreatedByUserNil sets the value for CreatedByUser to be an explicit nil

### UnsetCreatedByUser
`func (o *UserBusinessRoleBinding) UnsetCreatedByUser()`

UnsetCreatedByUser ensures that no value is present for CreatedByUser, not even an explicit nil
### GetCreatedTime

`func (o *UserBusinessRoleBinding) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *UserBusinessRoleBinding) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *UserBusinessRoleBinding) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *UserBusinessRoleBinding) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### SetCreatedTimeNil

`func (o *UserBusinessRoleBinding) SetCreatedTimeNil(b bool)`

 SetCreatedTimeNil sets the value for CreatedTime to be an explicit nil

### UnsetCreatedTime
`func (o *UserBusinessRoleBinding) UnsetCreatedTime()`

UnsetCreatedTime ensures that no value is present for CreatedTime, not even an explicit nil
### GetId

`func (o *UserBusinessRoleBinding) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *UserBusinessRoleBinding) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *UserBusinessRoleBinding) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *UserBusinessRoleBinding) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIsSharedPartner

`func (o *UserBusinessRoleBinding) GetIsSharedPartner() bool`

GetIsSharedPartner returns the IsSharedPartner field if non-nil, zero value otherwise.

### GetIsSharedPartnerOk

`func (o *UserBusinessRoleBinding) GetIsSharedPartnerOk() (*bool, bool)`

GetIsSharedPartnerOk returns a tuple with the IsSharedPartner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsSharedPartner

`func (o *UserBusinessRoleBinding) SetIsSharedPartner(v bool)`

SetIsSharedPartner sets IsSharedPartner field to given value.

### HasIsSharedPartner

`func (o *UserBusinessRoleBinding) HasIsSharedPartner() bool`

HasIsSharedPartner returns a boolean if a field has been set.

### GetUser

`func (o *UserBusinessRoleBinding) GetUser() BusinessAccessUserSummary`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *UserBusinessRoleBinding) GetUserOk() (*BusinessAccessUserSummary, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *UserBusinessRoleBinding) SetUser(v BusinessAccessUserSummary)`

SetUser sets User field to given value.

### HasUser

`func (o *UserBusinessRoleBinding) HasUser() bool`

HasUser returns a boolean if a field has been set.

### SetUserNil

`func (o *UserBusinessRoleBinding) SetUserNil(b bool)`

 SetUserNil sets the value for User to be an explicit nil

### UnsetUser
`func (o *UserBusinessRoleBinding) UnsetUser()`

UnsetUser ensures that no value is present for User, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


