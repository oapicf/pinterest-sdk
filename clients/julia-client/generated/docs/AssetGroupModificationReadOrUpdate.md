# AssetGroupModificationReadOrUpdate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`asset_groups_to_update`** | [**`Vector{AssetGroupUpdateItemReadOrUpdateItem}`**](AssetGroupUpdateItemReadOrUpdateItem.md) | A list of asset groups and the data that will be used to update them. | [optional] [default to nothing]
**`exceptions`** | [**`Vector{AssetGroupUpdateError}`**](AssetGroupUpdateError.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] [readonly] [default to nothing]
**`updated_asset_groups`** | [**`Vector{AssetGroupBinding}`**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional] [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


