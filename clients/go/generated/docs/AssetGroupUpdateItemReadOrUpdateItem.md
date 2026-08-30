# AssetGroupUpdateItemReadOrUpdateItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupId** | **string** | Unique identifier of the asset group to update. | 
**AssetGroupTypes** | Pointer to [**[]AssetGroupType**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional] 
**AssetsToAdd** | Pointer to **[]string** | A list of asset ids to add to the asset group. | [optional] 
**AssetsToRemove** | Pointer to **[]string** | A list of asset ids to remove from the asset group. | [optional] 
**Description** | Pointer to **string** | Asset group description. | [optional] 
**Name** | Pointer to **string** | Asset Group name. | [optional] 

## Methods

### NewAssetGroupUpdateItemReadOrUpdateItem

`func NewAssetGroupUpdateItemReadOrUpdateItem(assetGroupId string, ) *AssetGroupUpdateItemReadOrUpdateItem`

NewAssetGroupUpdateItemReadOrUpdateItem instantiates a new AssetGroupUpdateItemReadOrUpdateItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssetGroupUpdateItemReadOrUpdateItemWithDefaults

`func NewAssetGroupUpdateItemReadOrUpdateItemWithDefaults() *AssetGroupUpdateItemReadOrUpdateItem`

NewAssetGroupUpdateItemReadOrUpdateItemWithDefaults instantiates a new AssetGroupUpdateItemReadOrUpdateItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetGroupId

`func (o *AssetGroupUpdateItemReadOrUpdateItem) GetAssetGroupId() string`

GetAssetGroupId returns the AssetGroupId field if non-nil, zero value otherwise.

### GetAssetGroupIdOk

`func (o *AssetGroupUpdateItemReadOrUpdateItem) GetAssetGroupIdOk() (*string, bool)`

GetAssetGroupIdOk returns a tuple with the AssetGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupId

`func (o *AssetGroupUpdateItemReadOrUpdateItem) SetAssetGroupId(v string)`

SetAssetGroupId sets AssetGroupId field to given value.


### GetAssetGroupTypes

`func (o *AssetGroupUpdateItemReadOrUpdateItem) GetAssetGroupTypes() []AssetGroupType`

GetAssetGroupTypes returns the AssetGroupTypes field if non-nil, zero value otherwise.

### GetAssetGroupTypesOk

`func (o *AssetGroupUpdateItemReadOrUpdateItem) GetAssetGroupTypesOk() (*[]AssetGroupType, bool)`

GetAssetGroupTypesOk returns a tuple with the AssetGroupTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupTypes

`func (o *AssetGroupUpdateItemReadOrUpdateItem) SetAssetGroupTypes(v []AssetGroupType)`

SetAssetGroupTypes sets AssetGroupTypes field to given value.

### HasAssetGroupTypes

`func (o *AssetGroupUpdateItemReadOrUpdateItem) HasAssetGroupTypes() bool`

HasAssetGroupTypes returns a boolean if a field has been set.

### GetAssetsToAdd

`func (o *AssetGroupUpdateItemReadOrUpdateItem) GetAssetsToAdd() []string`

GetAssetsToAdd returns the AssetsToAdd field if non-nil, zero value otherwise.

### GetAssetsToAddOk

`func (o *AssetGroupUpdateItemReadOrUpdateItem) GetAssetsToAddOk() (*[]string, bool)`

GetAssetsToAddOk returns a tuple with the AssetsToAdd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetsToAdd

`func (o *AssetGroupUpdateItemReadOrUpdateItem) SetAssetsToAdd(v []string)`

SetAssetsToAdd sets AssetsToAdd field to given value.

### HasAssetsToAdd

`func (o *AssetGroupUpdateItemReadOrUpdateItem) HasAssetsToAdd() bool`

HasAssetsToAdd returns a boolean if a field has been set.

### GetAssetsToRemove

`func (o *AssetGroupUpdateItemReadOrUpdateItem) GetAssetsToRemove() []string`

GetAssetsToRemove returns the AssetsToRemove field if non-nil, zero value otherwise.

### GetAssetsToRemoveOk

`func (o *AssetGroupUpdateItemReadOrUpdateItem) GetAssetsToRemoveOk() (*[]string, bool)`

GetAssetsToRemoveOk returns a tuple with the AssetsToRemove field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetsToRemove

`func (o *AssetGroupUpdateItemReadOrUpdateItem) SetAssetsToRemove(v []string)`

SetAssetsToRemove sets AssetsToRemove field to given value.

### HasAssetsToRemove

`func (o *AssetGroupUpdateItemReadOrUpdateItem) HasAssetsToRemove() bool`

HasAssetsToRemove returns a boolean if a field has been set.

### GetDescription

`func (o *AssetGroupUpdateItemReadOrUpdateItem) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *AssetGroupUpdateItemReadOrUpdateItem) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *AssetGroupUpdateItemReadOrUpdateItem) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *AssetGroupUpdateItemReadOrUpdateItem) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetName

`func (o *AssetGroupUpdateItemReadOrUpdateItem) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AssetGroupUpdateItemReadOrUpdateItem) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AssetGroupUpdateItemReadOrUpdateItem) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AssetGroupUpdateItemReadOrUpdateItem) HasName() bool`

HasName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


