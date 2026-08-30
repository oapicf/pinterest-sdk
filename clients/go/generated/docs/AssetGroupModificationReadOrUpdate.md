# AssetGroupModificationReadOrUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupsToUpdate** | Pointer to [**[]AssetGroupUpdateItemReadOrUpdateItem**](AssetGroupUpdateItemReadOrUpdateItem.md) | A list of asset groups and the data that will be used to update them. | [optional] 
**Exceptions** | Pointer to [**[]AssetGroupUpdateError**](AssetGroupUpdateError.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] [readonly] 
**UpdatedAssetGroups** | Pointer to [**[]AssetGroupBinding**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional] [readonly] 

## Methods

### NewAssetGroupModificationReadOrUpdate

`func NewAssetGroupModificationReadOrUpdate() *AssetGroupModificationReadOrUpdate`

NewAssetGroupModificationReadOrUpdate instantiates a new AssetGroupModificationReadOrUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssetGroupModificationReadOrUpdateWithDefaults

`func NewAssetGroupModificationReadOrUpdateWithDefaults() *AssetGroupModificationReadOrUpdate`

NewAssetGroupModificationReadOrUpdateWithDefaults instantiates a new AssetGroupModificationReadOrUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetGroupsToUpdate

`func (o *AssetGroupModificationReadOrUpdate) GetAssetGroupsToUpdate() []AssetGroupUpdateItemReadOrUpdateItem`

GetAssetGroupsToUpdate returns the AssetGroupsToUpdate field if non-nil, zero value otherwise.

### GetAssetGroupsToUpdateOk

`func (o *AssetGroupModificationReadOrUpdate) GetAssetGroupsToUpdateOk() (*[]AssetGroupUpdateItemReadOrUpdateItem, bool)`

GetAssetGroupsToUpdateOk returns a tuple with the AssetGroupsToUpdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupsToUpdate

`func (o *AssetGroupModificationReadOrUpdate) SetAssetGroupsToUpdate(v []AssetGroupUpdateItemReadOrUpdateItem)`

SetAssetGroupsToUpdate sets AssetGroupsToUpdate field to given value.

### HasAssetGroupsToUpdate

`func (o *AssetGroupModificationReadOrUpdate) HasAssetGroupsToUpdate() bool`

HasAssetGroupsToUpdate returns a boolean if a field has been set.

### GetExceptions

`func (o *AssetGroupModificationReadOrUpdate) GetExceptions() []AssetGroupUpdateError`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *AssetGroupModificationReadOrUpdate) GetExceptionsOk() (*[]AssetGroupUpdateError, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *AssetGroupModificationReadOrUpdate) SetExceptions(v []AssetGroupUpdateError)`

SetExceptions sets Exceptions field to given value.

### HasExceptions

`func (o *AssetGroupModificationReadOrUpdate) HasExceptions() bool`

HasExceptions returns a boolean if a field has been set.

### GetUpdatedAssetGroups

`func (o *AssetGroupModificationReadOrUpdate) GetUpdatedAssetGroups() []AssetGroupBinding`

GetUpdatedAssetGroups returns the UpdatedAssetGroups field if non-nil, zero value otherwise.

### GetUpdatedAssetGroupsOk

`func (o *AssetGroupModificationReadOrUpdate) GetUpdatedAssetGroupsOk() (*[]AssetGroupBinding, bool)`

GetUpdatedAssetGroupsOk returns a tuple with the UpdatedAssetGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAssetGroups

`func (o *AssetGroupModificationReadOrUpdate) SetUpdatedAssetGroups(v []AssetGroupBinding)`

SetUpdatedAssetGroups sets UpdatedAssetGroups field to given value.

### HasUpdatedAssetGroups

`func (o *AssetGroupModificationReadOrUpdate) HasUpdatedAssetGroups() bool`

HasUpdatedAssetGroups returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


