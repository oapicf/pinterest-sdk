# AssetGroupUpdateItemReadOrUpdateItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`asset_group_id`** | **`String`** | Unique identifier of the asset group to update. | [default to nothing]
**`asset_group_types`** | [**`Vector{AssetGroupType}`**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional] [default to nothing]
**`assets_to_add`** | **`Vector{String}`** | A list of asset ids to add to the asset group. | [optional] [default to nothing]
**`assets_to_remove`** | **`Vector{String}`** | A list of asset ids to remove from the asset group. | [optional] [default to nothing]
**`description`** | **`String`** | Asset group description. | [optional] [default to nothing]
**`name`** | **`String`** | Asset Group name. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


