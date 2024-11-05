
# UpdateAssetGroupBodyAssetGroupsToUpdateInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **assetGroupId** | **kotlin.String** | Unique identifier of the asset group to update. |  |
| **name** | **kotlin.String** | Asset Group name |  [optional] |
| **description** | **kotlin.String** | Asset group description |  [optional] |
| **assetGroupTypes** | [**kotlin.collections.List&lt;AssetGroupType&gt;**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. |  [optional] |
| **assetsToAdd** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of asset ids to add to the asset group. |  [optional] |
| **assetsToRemove** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of asset ids to remove from the asset group. |  [optional] |



