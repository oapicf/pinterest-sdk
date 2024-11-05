# GetBusinessAssetsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | Pointer to **string** | Unique identifier of a business asset. | [optional] 
**AssetType** | Pointer to **string** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] 
**AssetGroupInfo** | Pointer to [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 

## Methods

### NewGetBusinessAssetsResponse

`func NewGetBusinessAssetsResponse() *GetBusinessAssetsResponse`

NewGetBusinessAssetsResponse instantiates a new GetBusinessAssetsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBusinessAssetsResponseWithDefaults

`func NewGetBusinessAssetsResponseWithDefaults() *GetBusinessAssetsResponse`

NewGetBusinessAssetsResponseWithDefaults instantiates a new GetBusinessAssetsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetId

`func (o *GetBusinessAssetsResponse) GetAssetId() string`

GetAssetId returns the AssetId field if non-nil, zero value otherwise.

### GetAssetIdOk

`func (o *GetBusinessAssetsResponse) GetAssetIdOk() (*string, bool)`

GetAssetIdOk returns a tuple with the AssetId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetId

`func (o *GetBusinessAssetsResponse) SetAssetId(v string)`

SetAssetId sets AssetId field to given value.

### HasAssetId

`func (o *GetBusinessAssetsResponse) HasAssetId() bool`

HasAssetId returns a boolean if a field has been set.

### GetAssetType

`func (o *GetBusinessAssetsResponse) GetAssetType() string`

GetAssetType returns the AssetType field if non-nil, zero value otherwise.

### GetAssetTypeOk

`func (o *GetBusinessAssetsResponse) GetAssetTypeOk() (*string, bool)`

GetAssetTypeOk returns a tuple with the AssetType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetType

`func (o *GetBusinessAssetsResponse) SetAssetType(v string)`

SetAssetType sets AssetType field to given value.

### HasAssetType

`func (o *GetBusinessAssetsResponse) HasAssetType() bool`

HasAssetType returns a boolean if a field has been set.

### GetAssetGroupInfo

`func (o *GetBusinessAssetsResponse) GetAssetGroupInfo() AssetGroupBinding`

GetAssetGroupInfo returns the AssetGroupInfo field if non-nil, zero value otherwise.

### GetAssetGroupInfoOk

`func (o *GetBusinessAssetsResponse) GetAssetGroupInfoOk() (*AssetGroupBinding, bool)`

GetAssetGroupInfoOk returns a tuple with the AssetGroupInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupInfo

`func (o *GetBusinessAssetsResponse) SetAssetGroupInfo(v AssetGroupBinding)`

SetAssetGroupInfo sets AssetGroupInfo field to given value.

### HasAssetGroupInfo

`func (o *GetBusinessAssetsResponse) HasAssetGroupInfo() bool`

HasAssetGroupInfo returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


