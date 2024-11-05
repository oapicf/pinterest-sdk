# AssetIdPermissions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | Pointer to **string** | Unique identifier of a business asset. | [optional] 
**AssetType** | Pointer to **string** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] 
**Permissions** | Pointer to **[]string** | Permission levels member or partner has on an asset. | [optional] 
**AssetGroupInfo** | Pointer to [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 

## Methods

### NewAssetIdPermissions

`func NewAssetIdPermissions() *AssetIdPermissions`

NewAssetIdPermissions instantiates a new AssetIdPermissions object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssetIdPermissionsWithDefaults

`func NewAssetIdPermissionsWithDefaults() *AssetIdPermissions`

NewAssetIdPermissionsWithDefaults instantiates a new AssetIdPermissions object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetId

`func (o *AssetIdPermissions) GetAssetId() string`

GetAssetId returns the AssetId field if non-nil, zero value otherwise.

### GetAssetIdOk

`func (o *AssetIdPermissions) GetAssetIdOk() (*string, bool)`

GetAssetIdOk returns a tuple with the AssetId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetId

`func (o *AssetIdPermissions) SetAssetId(v string)`

SetAssetId sets AssetId field to given value.

### HasAssetId

`func (o *AssetIdPermissions) HasAssetId() bool`

HasAssetId returns a boolean if a field has been set.

### GetAssetType

`func (o *AssetIdPermissions) GetAssetType() string`

GetAssetType returns the AssetType field if non-nil, zero value otherwise.

### GetAssetTypeOk

`func (o *AssetIdPermissions) GetAssetTypeOk() (*string, bool)`

GetAssetTypeOk returns a tuple with the AssetType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetType

`func (o *AssetIdPermissions) SetAssetType(v string)`

SetAssetType sets AssetType field to given value.

### HasAssetType

`func (o *AssetIdPermissions) HasAssetType() bool`

HasAssetType returns a boolean if a field has been set.

### GetPermissions

`func (o *AssetIdPermissions) GetPermissions() []string`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *AssetIdPermissions) GetPermissionsOk() (*[]string, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *AssetIdPermissions) SetPermissions(v []string)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *AssetIdPermissions) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.

### GetAssetGroupInfo

`func (o *AssetIdPermissions) GetAssetGroupInfo() AssetGroupBinding`

GetAssetGroupInfo returns the AssetGroupInfo field if non-nil, zero value otherwise.

### GetAssetGroupInfoOk

`func (o *AssetIdPermissions) GetAssetGroupInfoOk() (*AssetGroupBinding, bool)`

GetAssetGroupInfoOk returns a tuple with the AssetGroupInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupInfo

`func (o *AssetIdPermissions) SetAssetGroupInfo(v AssetGroupBinding)`

SetAssetGroupInfo sets AssetGroupInfo field to given value.

### HasAssetGroupInfo

`func (o *AssetIdPermissions) HasAssetGroupInfo() bool`

HasAssetGroupInfo returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


