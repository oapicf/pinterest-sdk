# DeleteAssetGroupBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupsToDelete** | **[]string** | List of ids of asset groups to be deleted | 

## Methods

### NewDeleteAssetGroupBody

`func NewDeleteAssetGroupBody(assetGroupsToDelete []string, ) *DeleteAssetGroupBody`

NewDeleteAssetGroupBody instantiates a new DeleteAssetGroupBody object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeleteAssetGroupBodyWithDefaults

`func NewDeleteAssetGroupBodyWithDefaults() *DeleteAssetGroupBody`

NewDeleteAssetGroupBodyWithDefaults instantiates a new DeleteAssetGroupBody object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetGroupsToDelete

`func (o *DeleteAssetGroupBody) GetAssetGroupsToDelete() []string`

GetAssetGroupsToDelete returns the AssetGroupsToDelete field if non-nil, zero value otherwise.

### GetAssetGroupsToDeleteOk

`func (o *DeleteAssetGroupBody) GetAssetGroupsToDeleteOk() (*[]string, bool)`

GetAssetGroupsToDeleteOk returns a tuple with the AssetGroupsToDelete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupsToDelete

`func (o *DeleteAssetGroupBody) SetAssetGroupsToDelete(v []string)`

SetAssetGroupsToDelete sets AssetGroupsToDelete field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


