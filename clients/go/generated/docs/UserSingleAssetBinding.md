# UserSingleAssetBinding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Permissions** | Pointer to **[]string** | Permission levels member or partner has on an asset. | [optional] 
**User** | Pointer to [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) |  | [optional] 

## Methods

### NewUserSingleAssetBinding

`func NewUserSingleAssetBinding() *UserSingleAssetBinding`

NewUserSingleAssetBinding instantiates a new UserSingleAssetBinding object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUserSingleAssetBindingWithDefaults

`func NewUserSingleAssetBindingWithDefaults() *UserSingleAssetBinding`

NewUserSingleAssetBindingWithDefaults instantiates a new UserSingleAssetBinding object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPermissions

`func (o *UserSingleAssetBinding) GetPermissions() []string`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *UserSingleAssetBinding) GetPermissionsOk() (*[]string, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *UserSingleAssetBinding) SetPermissions(v []string)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *UserSingleAssetBinding) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.

### GetUser

`func (o *UserSingleAssetBinding) GetUser() BusinessAccessUserSummary`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *UserSingleAssetBinding) GetUserOk() (*BusinessAccessUserSummary, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *UserSingleAssetBinding) SetUser(v BusinessAccessUserSummary)`

SetUser sets User field to given value.

### HasUser

`func (o *UserSingleAssetBinding) HasUser() bool`

HasUser returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


