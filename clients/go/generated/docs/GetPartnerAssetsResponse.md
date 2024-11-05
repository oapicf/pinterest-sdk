# GetPartnerAssetsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | Pointer to **string** | Unique identifier of a business asset. | [optional] 
**AssetType** | Pointer to **string** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] 
**Permissions** | Pointer to **[]string** | The permissions you or your partner has on the asset. If partner_type&#x3D;INTERNAL, the permission levels are for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the permission levels are for the access you have to the partner&#39;s business asset. | [optional] 
**AssetGroupInfo** | Pointer to [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 

## Methods

### NewGetPartnerAssetsResponse

`func NewGetPartnerAssetsResponse() *GetPartnerAssetsResponse`

NewGetPartnerAssetsResponse instantiates a new GetPartnerAssetsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPartnerAssetsResponseWithDefaults

`func NewGetPartnerAssetsResponseWithDefaults() *GetPartnerAssetsResponse`

NewGetPartnerAssetsResponseWithDefaults instantiates a new GetPartnerAssetsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetId

`func (o *GetPartnerAssetsResponse) GetAssetId() string`

GetAssetId returns the AssetId field if non-nil, zero value otherwise.

### GetAssetIdOk

`func (o *GetPartnerAssetsResponse) GetAssetIdOk() (*string, bool)`

GetAssetIdOk returns a tuple with the AssetId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetId

`func (o *GetPartnerAssetsResponse) SetAssetId(v string)`

SetAssetId sets AssetId field to given value.

### HasAssetId

`func (o *GetPartnerAssetsResponse) HasAssetId() bool`

HasAssetId returns a boolean if a field has been set.

### GetAssetType

`func (o *GetPartnerAssetsResponse) GetAssetType() string`

GetAssetType returns the AssetType field if non-nil, zero value otherwise.

### GetAssetTypeOk

`func (o *GetPartnerAssetsResponse) GetAssetTypeOk() (*string, bool)`

GetAssetTypeOk returns a tuple with the AssetType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetType

`func (o *GetPartnerAssetsResponse) SetAssetType(v string)`

SetAssetType sets AssetType field to given value.

### HasAssetType

`func (o *GetPartnerAssetsResponse) HasAssetType() bool`

HasAssetType returns a boolean if a field has been set.

### GetPermissions

`func (o *GetPartnerAssetsResponse) GetPermissions() []string`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *GetPartnerAssetsResponse) GetPermissionsOk() (*[]string, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *GetPartnerAssetsResponse) SetPermissions(v []string)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *GetPartnerAssetsResponse) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.

### GetAssetGroupInfo

`func (o *GetPartnerAssetsResponse) GetAssetGroupInfo() AssetGroupBinding`

GetAssetGroupInfo returns the AssetGroupInfo field if non-nil, zero value otherwise.

### GetAssetGroupInfoOk

`func (o *GetPartnerAssetsResponse) GetAssetGroupInfoOk() (*AssetGroupBinding, bool)`

GetAssetGroupInfoOk returns a tuple with the AssetGroupInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupInfo

`func (o *GetPartnerAssetsResponse) SetAssetGroupInfo(v AssetGroupBinding)`

SetAssetGroupInfo sets AssetGroupInfo field to given value.

### HasAssetGroupInfo

`func (o *GetPartnerAssetsResponse) HasAssetGroupInfo() bool`

HasAssetGroupInfo returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


