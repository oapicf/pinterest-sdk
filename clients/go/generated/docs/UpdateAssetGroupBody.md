# UpdateAssetGroupBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupsToUpdate** | Pointer to [**[]UpdateAssetGroupBodyAssetGroupsToUpdateInner**](UpdateAssetGroupBodyAssetGroupsToUpdateInner.md) | A list of asset groups and the data that will be used to update them. | [optional] 

## Methods

### NewUpdateAssetGroupBody

`func NewUpdateAssetGroupBody() *UpdateAssetGroupBody`

NewUpdateAssetGroupBody instantiates a new UpdateAssetGroupBody object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateAssetGroupBodyWithDefaults

`func NewUpdateAssetGroupBodyWithDefaults() *UpdateAssetGroupBody`

NewUpdateAssetGroupBodyWithDefaults instantiates a new UpdateAssetGroupBody object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetGroupsToUpdate

`func (o *UpdateAssetGroupBody) GetAssetGroupsToUpdate() []UpdateAssetGroupBodyAssetGroupsToUpdateInner`

GetAssetGroupsToUpdate returns the AssetGroupsToUpdate field if non-nil, zero value otherwise.

### GetAssetGroupsToUpdateOk

`func (o *UpdateAssetGroupBody) GetAssetGroupsToUpdateOk() (*[]UpdateAssetGroupBodyAssetGroupsToUpdateInner, bool)`

GetAssetGroupsToUpdateOk returns a tuple with the AssetGroupsToUpdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupsToUpdate

`func (o *UpdateAssetGroupBody) SetAssetGroupsToUpdate(v []UpdateAssetGroupBodyAssetGroupsToUpdateInner)`

SetAssetGroupsToUpdate sets AssetGroupsToUpdate field to given value.

### HasAssetGroupsToUpdate

`func (o *UpdateAssetGroupBody) HasAssetGroupsToUpdate() bool`

HasAssetGroupsToUpdate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


