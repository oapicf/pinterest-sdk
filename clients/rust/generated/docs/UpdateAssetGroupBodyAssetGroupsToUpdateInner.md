# UpdateAssetGroupBodyAssetGroupsToUpdateInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_id** | **String** | Unique identifier of the asset group to update. | 
**name** | Option<**String**> | Asset Group name | [optional]
**description** | Option<**String**> | Asset group description | [optional]
**asset_group_types** | Option<[**Vec<models::AssetGroupType>**](AssetGroupType.md)> | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional]
**assets_to_add** | Option<**Vec<String>**> | A list of asset ids to add to the asset group. | [optional]
**assets_to_remove** | Option<**Vec<String>**> | A list of asset ids to remove from the asset group. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


