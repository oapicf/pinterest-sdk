# AssetGroupModification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exceptions** | Pointer to [**[]AssetGroupUpdateError**](AssetGroupUpdateError.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] [readonly] 
**UpdatedAssetGroups** | Pointer to [**[]AssetGroupBinding**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional] [readonly] 

## Methods

### NewAssetGroupModification

`func NewAssetGroupModification() *AssetGroupModification`

NewAssetGroupModification instantiates a new AssetGroupModification object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssetGroupModificationWithDefaults

`func NewAssetGroupModificationWithDefaults() *AssetGroupModification`

NewAssetGroupModificationWithDefaults instantiates a new AssetGroupModification object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExceptions

`func (o *AssetGroupModification) GetExceptions() []AssetGroupUpdateError`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *AssetGroupModification) GetExceptionsOk() (*[]AssetGroupUpdateError, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *AssetGroupModification) SetExceptions(v []AssetGroupUpdateError)`

SetExceptions sets Exceptions field to given value.

### HasExceptions

`func (o *AssetGroupModification) HasExceptions() bool`

HasExceptions returns a boolean if a field has been set.

### GetUpdatedAssetGroups

`func (o *AssetGroupModification) GetUpdatedAssetGroups() []AssetGroupBinding`

GetUpdatedAssetGroups returns the UpdatedAssetGroups field if non-nil, zero value otherwise.

### GetUpdatedAssetGroupsOk

`func (o *AssetGroupModification) GetUpdatedAssetGroupsOk() (*[]AssetGroupBinding, bool)`

GetUpdatedAssetGroupsOk returns a tuple with the UpdatedAssetGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAssetGroups

`func (o *AssetGroupModification) SetUpdatedAssetGroups(v []AssetGroupBinding)`

SetUpdatedAssetGroups sets UpdatedAssetGroups field to given value.

### HasUpdatedAssetGroups

`func (o *AssetGroupModification) HasUpdatedAssetGroups() bool`

HasUpdatedAssetGroups returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


