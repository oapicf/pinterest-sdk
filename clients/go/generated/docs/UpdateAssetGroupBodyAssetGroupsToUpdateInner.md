# UpdateAssetGroupBodyAssetGroupsToUpdateInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupId** | **string** | Unique identifier of the asset group to update. | 
**Name** | Pointer to **string** | Asset Group name | [optional] 
**Description** | Pointer to **string** | Asset group description | [optional] 
**AssetGroupTypes** | Pointer to [**[]AssetGroupType**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional] 
**AssetsToAdd** | Pointer to **[]string** | A list of asset ids to add to the asset group. | [optional] 
**AssetsToRemove** | Pointer to **[]string** | A list of asset ids to remove from the asset group. | [optional] 

## Methods

### NewUpdateAssetGroupBodyAssetGroupsToUpdateInner

`func NewUpdateAssetGroupBodyAssetGroupsToUpdateInner(assetGroupId string, ) *UpdateAssetGroupBodyAssetGroupsToUpdateInner`

NewUpdateAssetGroupBodyAssetGroupsToUpdateInner instantiates a new UpdateAssetGroupBodyAssetGroupsToUpdateInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateAssetGroupBodyAssetGroupsToUpdateInnerWithDefaults

`func NewUpdateAssetGroupBodyAssetGroupsToUpdateInnerWithDefaults() *UpdateAssetGroupBodyAssetGroupsToUpdateInner`

NewUpdateAssetGroupBodyAssetGroupsToUpdateInnerWithDefaults instantiates a new UpdateAssetGroupBodyAssetGroupsToUpdateInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetGroupId

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) GetAssetGroupId() string`

GetAssetGroupId returns the AssetGroupId field if non-nil, zero value otherwise.

### GetAssetGroupIdOk

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) GetAssetGroupIdOk() (*string, bool)`

GetAssetGroupIdOk returns a tuple with the AssetGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupId

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) SetAssetGroupId(v string)`

SetAssetGroupId sets AssetGroupId field to given value.


### GetName

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetDescription

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetAssetGroupTypes

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) GetAssetGroupTypes() []AssetGroupType`

GetAssetGroupTypes returns the AssetGroupTypes field if non-nil, zero value otherwise.

### GetAssetGroupTypesOk

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) GetAssetGroupTypesOk() (*[]AssetGroupType, bool)`

GetAssetGroupTypesOk returns a tuple with the AssetGroupTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupTypes

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) SetAssetGroupTypes(v []AssetGroupType)`

SetAssetGroupTypes sets AssetGroupTypes field to given value.

### HasAssetGroupTypes

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) HasAssetGroupTypes() bool`

HasAssetGroupTypes returns a boolean if a field has been set.

### GetAssetsToAdd

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) GetAssetsToAdd() []string`

GetAssetsToAdd returns the AssetsToAdd field if non-nil, zero value otherwise.

### GetAssetsToAddOk

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) GetAssetsToAddOk() (*[]string, bool)`

GetAssetsToAddOk returns a tuple with the AssetsToAdd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetsToAdd

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) SetAssetsToAdd(v []string)`

SetAssetsToAdd sets AssetsToAdd field to given value.

### HasAssetsToAdd

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) HasAssetsToAdd() bool`

HasAssetsToAdd returns a boolean if a field has been set.

### GetAssetsToRemove

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) GetAssetsToRemove() []string`

GetAssetsToRemove returns the AssetsToRemove field if non-nil, zero value otherwise.

### GetAssetsToRemoveOk

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) GetAssetsToRemoveOk() (*[]string, bool)`

GetAssetsToRemoveOk returns a tuple with the AssetsToRemove field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetsToRemove

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) SetAssetsToRemove(v []string)`

SetAssetsToRemove sets AssetsToRemove field to given value.

### HasAssetsToRemove

`func (o *UpdateAssetGroupBodyAssetGroupsToUpdateInner) HasAssetsToRemove() bool`

HasAssetsToRemove returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


