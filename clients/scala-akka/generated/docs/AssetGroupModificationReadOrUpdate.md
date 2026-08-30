

# AssetGroupModificationReadOrUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetGroupsToUpdate** | [**Seq&lt;AssetGroupUpdateItemReadOrUpdateItem&gt;**](AssetGroupUpdateItemReadOrUpdateItem.md) | A list of asset groups and the data that will be used to update them. |  [optional]
**exceptions** | [**Seq&lt;AssetGroupUpdateError&gt;**](AssetGroupUpdateError.md) | A list of errors associated with the asset groups. Will be returned if there is an error. |  [optional] [readonly]
**updatedAssetGroups** | [**Seq&lt;AssetGroupBinding&gt;**](AssetGroupBinding.md) | A list of successfully edited asset groups. |  [optional] [readonly]



