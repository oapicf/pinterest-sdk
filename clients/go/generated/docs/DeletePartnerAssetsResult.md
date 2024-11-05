# DeletePartnerAssetsResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | Pointer to **string** | Unique identifier of a business asset. | [optional] 
**AssetType** | Pointer to **string** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] 
**Permissions** | Pointer to **[]string** | Permission levels member or partner has on an asset. | [optional] 
**IsSharedPartner** | Pointer to **bool** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. | [optional] 
**PartnerId** | Pointer to **string** | Unique identifier of a business partner. | [optional] 

## Methods

### NewDeletePartnerAssetsResult

`func NewDeletePartnerAssetsResult() *DeletePartnerAssetsResult`

NewDeletePartnerAssetsResult instantiates a new DeletePartnerAssetsResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeletePartnerAssetsResultWithDefaults

`func NewDeletePartnerAssetsResultWithDefaults() *DeletePartnerAssetsResult`

NewDeletePartnerAssetsResultWithDefaults instantiates a new DeletePartnerAssetsResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetId

`func (o *DeletePartnerAssetsResult) GetAssetId() string`

GetAssetId returns the AssetId field if non-nil, zero value otherwise.

### GetAssetIdOk

`func (o *DeletePartnerAssetsResult) GetAssetIdOk() (*string, bool)`

GetAssetIdOk returns a tuple with the AssetId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetId

`func (o *DeletePartnerAssetsResult) SetAssetId(v string)`

SetAssetId sets AssetId field to given value.

### HasAssetId

`func (o *DeletePartnerAssetsResult) HasAssetId() bool`

HasAssetId returns a boolean if a field has been set.

### GetAssetType

`func (o *DeletePartnerAssetsResult) GetAssetType() string`

GetAssetType returns the AssetType field if non-nil, zero value otherwise.

### GetAssetTypeOk

`func (o *DeletePartnerAssetsResult) GetAssetTypeOk() (*string, bool)`

GetAssetTypeOk returns a tuple with the AssetType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetType

`func (o *DeletePartnerAssetsResult) SetAssetType(v string)`

SetAssetType sets AssetType field to given value.

### HasAssetType

`func (o *DeletePartnerAssetsResult) HasAssetType() bool`

HasAssetType returns a boolean if a field has been set.

### GetPermissions

`func (o *DeletePartnerAssetsResult) GetPermissions() []string`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *DeletePartnerAssetsResult) GetPermissionsOk() (*[]string, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *DeletePartnerAssetsResult) SetPermissions(v []string)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *DeletePartnerAssetsResult) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.

### GetIsSharedPartner

`func (o *DeletePartnerAssetsResult) GetIsSharedPartner() bool`

GetIsSharedPartner returns the IsSharedPartner field if non-nil, zero value otherwise.

### GetIsSharedPartnerOk

`func (o *DeletePartnerAssetsResult) GetIsSharedPartnerOk() (*bool, bool)`

GetIsSharedPartnerOk returns a tuple with the IsSharedPartner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsSharedPartner

`func (o *DeletePartnerAssetsResult) SetIsSharedPartner(v bool)`

SetIsSharedPartner sets IsSharedPartner field to given value.

### HasIsSharedPartner

`func (o *DeletePartnerAssetsResult) HasIsSharedPartner() bool`

HasIsSharedPartner returns a boolean if a field has been set.

### GetPartnerId

`func (o *DeletePartnerAssetsResult) GetPartnerId() string`

GetPartnerId returns the PartnerId field if non-nil, zero value otherwise.

### GetPartnerIdOk

`func (o *DeletePartnerAssetsResult) GetPartnerIdOk() (*string, bool)`

GetPartnerIdOk returns a tuple with the PartnerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerId

`func (o *DeletePartnerAssetsResult) SetPartnerId(v string)`

SetPartnerId sets PartnerId field to given value.

### HasPartnerId

`func (o *DeletePartnerAssetsResult) HasPartnerId() bool`

HasPartnerId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


