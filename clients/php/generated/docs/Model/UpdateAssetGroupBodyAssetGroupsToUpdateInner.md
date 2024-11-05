# # UpdateAssetGroupBodyAssetGroupsToUpdateInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_id** | **string** | Unique identifier of the asset group to update. |
**name** | **string** | Asset Group name | [optional]
**description** | **string** | Asset group description | [optional]
**asset_group_types** | [**\OpenAPI\Client\Model\AssetGroupType[]**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional]
**assets_to_add** | **string[]** | A list of asset ids to add to the asset group. | [optional]
**assets_to_remove** | **string[]** | A list of asset ids to remove from the asset group. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
