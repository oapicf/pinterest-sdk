

# UpdateAssetGroupBodyAssetGroupsToUpdateInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetGroupId** | **String** | Unique identifier of the asset group to update. | 
**name** | **String** | Asset Group name |  [optional]
**description** | **String** | Asset group description |  [optional]
**assetGroupTypes** | [**List&lt;AssetGroupType&gt;**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. |  [optional]
**assetsToAdd** | **List&lt;String&gt;** | A list of asset ids to add to the asset group. |  [optional]
**assetsToRemove** | **List&lt;String&gt;** | A list of asset ids to remove from the asset group. |  [optional]




