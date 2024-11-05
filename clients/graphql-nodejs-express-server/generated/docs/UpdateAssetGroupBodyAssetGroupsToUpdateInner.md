# UpdateAssetGroupBodyAssetGroupsToUpdateInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetGroupId** | **String!** | Unique identifier of the asset group to update. | [default to null]
**name** | **String!** | Asset Group name | [optional] [default to null]
**description** | **String!** | Asset group description | [optional] [default to null]
**assetGroupTypes** | [**AssetGroupType**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional] [default to null]
**assetsToAdd** | **String!** | A list of asset ids to add to the asset group. | [optional] [default to null]
**assetsToRemove** | **String!** | A list of asset ids to remove from the asset group. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


