# UpdatePartnerAssetsResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | Pointer to **string** | Unique identifier of a business asset. | [optional] 
**AssetType** | Pointer to **string** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] 
**PartnerId** | Pointer to **string** | Unique identifier of a business partner. | [optional] 
**Permissions** | Pointer to **[]string** | Permission levels member or partner has on an asset. | [optional] 

## Methods

### NewUpdatePartnerAssetsResult

`func NewUpdatePartnerAssetsResult() *UpdatePartnerAssetsResult`

NewUpdatePartnerAssetsResult instantiates a new UpdatePartnerAssetsResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdatePartnerAssetsResultWithDefaults

`func NewUpdatePartnerAssetsResultWithDefaults() *UpdatePartnerAssetsResult`

NewUpdatePartnerAssetsResultWithDefaults instantiates a new UpdatePartnerAssetsResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetId

`func (o *UpdatePartnerAssetsResult) GetAssetId() string`

GetAssetId returns the AssetId field if non-nil, zero value otherwise.

### GetAssetIdOk

`func (o *UpdatePartnerAssetsResult) GetAssetIdOk() (*string, bool)`

GetAssetIdOk returns a tuple with the AssetId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetId

`func (o *UpdatePartnerAssetsResult) SetAssetId(v string)`

SetAssetId sets AssetId field to given value.

### HasAssetId

`func (o *UpdatePartnerAssetsResult) HasAssetId() bool`

HasAssetId returns a boolean if a field has been set.

### GetAssetType

`func (o *UpdatePartnerAssetsResult) GetAssetType() string`

GetAssetType returns the AssetType field if non-nil, zero value otherwise.

### GetAssetTypeOk

`func (o *UpdatePartnerAssetsResult) GetAssetTypeOk() (*string, bool)`

GetAssetTypeOk returns a tuple with the AssetType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetType

`func (o *UpdatePartnerAssetsResult) SetAssetType(v string)`

SetAssetType sets AssetType field to given value.

### HasAssetType

`func (o *UpdatePartnerAssetsResult) HasAssetType() bool`

HasAssetType returns a boolean if a field has been set.

### GetPartnerId

`func (o *UpdatePartnerAssetsResult) GetPartnerId() string`

GetPartnerId returns the PartnerId field if non-nil, zero value otherwise.

### GetPartnerIdOk

`func (o *UpdatePartnerAssetsResult) GetPartnerIdOk() (*string, bool)`

GetPartnerIdOk returns a tuple with the PartnerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerId

`func (o *UpdatePartnerAssetsResult) SetPartnerId(v string)`

SetPartnerId sets PartnerId field to given value.

### HasPartnerId

`func (o *UpdatePartnerAssetsResult) HasPartnerId() bool`

HasPartnerId returns a boolean if a field has been set.

### GetPermissions

`func (o *UpdatePartnerAssetsResult) GetPermissions() []string`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *UpdatePartnerAssetsResult) GetPermissionsOk() (*[]string, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *UpdatePartnerAssetsResult) SetPermissions(v []string)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *UpdatePartnerAssetsResult) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


