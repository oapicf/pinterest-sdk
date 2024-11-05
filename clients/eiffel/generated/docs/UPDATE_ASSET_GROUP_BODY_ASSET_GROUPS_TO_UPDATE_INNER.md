# UPDATE_ASSET_GROUP_BODY_ASSET_GROUPS_TO_UPDATE_INNER

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_id** | [**STRING_32**](STRING_32.md) | Unique identifier of the asset group to update. | [default to null]
**name** | [**STRING_32**](STRING_32.md) | Asset Group name | [optional] [default to null]
**description** | [**STRING_32**](STRING_32.md) | Asset group description | [optional] [default to null]
**asset_group_types** | [**LIST [ASSET_GROUP_TYPE]**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional] [default to null]
**assets_to_add** | [**LIST [STRING_32]**](STRING_32.md) | A list of asset ids to add to the asset group. | [optional] [default to null]
**assets_to_remove** | [**LIST [STRING_32]**](STRING_32.md) | A list of asset ids to remove from the asset group. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


