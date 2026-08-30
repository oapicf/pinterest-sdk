# BusinessAssets

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupInfo** | Pointer to [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] 
**AssetId** | Pointer to **string** | Unique identifier of a business asset. | [optional] 
**AssetType** | Pointer to [**AssetTypeResponse**](AssetTypeResponse.md) |  | [optional] 
**Permissions** | Pointer to **[]string** | Permission levels the requesting business has on an asset. | [optional] 
**CatalogInfo** | Pointer to [**CatalogBinding**](CatalogBinding.md) | An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;. | [optional] 

## Methods

### NewBusinessAssets

`func NewBusinessAssets() *BusinessAssets`

NewBusinessAssets instantiates a new BusinessAssets object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBusinessAssetsWithDefaults

`func NewBusinessAssetsWithDefaults() *BusinessAssets`

NewBusinessAssetsWithDefaults instantiates a new BusinessAssets object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetGroupInfo

`func (o *BusinessAssets) GetAssetGroupInfo() AssetGroupBinding`

GetAssetGroupInfo returns the AssetGroupInfo field if non-nil, zero value otherwise.

### GetAssetGroupInfoOk

`func (o *BusinessAssets) GetAssetGroupInfoOk() (*AssetGroupBinding, bool)`

GetAssetGroupInfoOk returns a tuple with the AssetGroupInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupInfo

`func (o *BusinessAssets) SetAssetGroupInfo(v AssetGroupBinding)`

SetAssetGroupInfo sets AssetGroupInfo field to given value.

### HasAssetGroupInfo

`func (o *BusinessAssets) HasAssetGroupInfo() bool`

HasAssetGroupInfo returns a boolean if a field has been set.

### GetAssetId

`func (o *BusinessAssets) GetAssetId() string`

GetAssetId returns the AssetId field if non-nil, zero value otherwise.

### GetAssetIdOk

`func (o *BusinessAssets) GetAssetIdOk() (*string, bool)`

GetAssetIdOk returns a tuple with the AssetId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetId

`func (o *BusinessAssets) SetAssetId(v string)`

SetAssetId sets AssetId field to given value.

### HasAssetId

`func (o *BusinessAssets) HasAssetId() bool`

HasAssetId returns a boolean if a field has been set.

### GetAssetType

`func (o *BusinessAssets) GetAssetType() AssetTypeResponse`

GetAssetType returns the AssetType field if non-nil, zero value otherwise.

### GetAssetTypeOk

`func (o *BusinessAssets) GetAssetTypeOk() (*AssetTypeResponse, bool)`

GetAssetTypeOk returns a tuple with the AssetType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetType

`func (o *BusinessAssets) SetAssetType(v AssetTypeResponse)`

SetAssetType sets AssetType field to given value.

### HasAssetType

`func (o *BusinessAssets) HasAssetType() bool`

HasAssetType returns a boolean if a field has been set.

### GetPermissions

`func (o *BusinessAssets) GetPermissions() []string`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *BusinessAssets) GetPermissionsOk() (*[]string, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *BusinessAssets) SetPermissions(v []string)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *BusinessAssets) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.

### GetCatalogInfo

`func (o *BusinessAssets) GetCatalogInfo() CatalogBinding`

GetCatalogInfo returns the CatalogInfo field if non-nil, zero value otherwise.

### GetCatalogInfoOk

`func (o *BusinessAssets) GetCatalogInfoOk() (*CatalogBinding, bool)`

GetCatalogInfoOk returns a tuple with the CatalogInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogInfo

`func (o *BusinessAssets) SetCatalogInfo(v CatalogBinding)`

SetCatalogInfo sets CatalogInfo field to given value.

### HasCatalogInfo

`func (o *BusinessAssets) HasCatalogInfo() bool`

HasCatalogInfo returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


