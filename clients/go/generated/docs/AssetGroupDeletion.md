# AssetGroupDeletion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeletedAssetGroups** | Pointer to **[]string** |  | [optional] [readonly] 
**Exceptions** | Pointer to [**[]AssetGroupDeleteError**](AssetGroupDeleteError.md) |  | [optional] 

## Methods

### NewAssetGroupDeletion

`func NewAssetGroupDeletion() *AssetGroupDeletion`

NewAssetGroupDeletion instantiates a new AssetGroupDeletion object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssetGroupDeletionWithDefaults

`func NewAssetGroupDeletionWithDefaults() *AssetGroupDeletion`

NewAssetGroupDeletionWithDefaults instantiates a new AssetGroupDeletion object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDeletedAssetGroups

`func (o *AssetGroupDeletion) GetDeletedAssetGroups() []string`

GetDeletedAssetGroups returns the DeletedAssetGroups field if non-nil, zero value otherwise.

### GetDeletedAssetGroupsOk

`func (o *AssetGroupDeletion) GetDeletedAssetGroupsOk() (*[]string, bool)`

GetDeletedAssetGroupsOk returns a tuple with the DeletedAssetGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeletedAssetGroups

`func (o *AssetGroupDeletion) SetDeletedAssetGroups(v []string)`

SetDeletedAssetGroups sets DeletedAssetGroups field to given value.

### HasDeletedAssetGroups

`func (o *AssetGroupDeletion) HasDeletedAssetGroups() bool`

HasDeletedAssetGroups returns a boolean if a field has been set.

### GetExceptions

`func (o *AssetGroupDeletion) GetExceptions() []AssetGroupDeleteError`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *AssetGroupDeletion) GetExceptionsOk() (*[]AssetGroupDeleteError, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *AssetGroupDeletion) SetExceptions(v []AssetGroupDeleteError)`

SetExceptions sets Exceptions field to given value.

### HasExceptions

`func (o *AssetGroupDeletion) HasExceptions() bool`

HasExceptions returns a boolean if a field has been set.

### SetExceptionsNil

`func (o *AssetGroupDeletion) SetExceptionsNil(b bool)`

 SetExceptionsNil sets the value for Exceptions to be an explicit nil

### UnsetExceptions
`func (o *AssetGroupDeletion) UnsetExceptions()`

UnsetExceptions ensures that no value is present for Exceptions, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


