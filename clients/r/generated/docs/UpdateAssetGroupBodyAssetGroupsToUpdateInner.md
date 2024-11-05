# openapi::UpdateAssetGroupBodyAssetGroupsToUpdateInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_id** | **character** | Unique identifier of the asset group to update. | 
**name** | **character** | Asset Group name | [optional] 
**description** | **character** | Asset group description | [optional] 
**asset_group_types** | [**array[AssetGroupType]**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional] 
**assets_to_add** | **array[character]** | A list of asset ids to add to the asset group. | [optional] 
**assets_to_remove** | **array[character]** | A list of asset ids to remove from the asset group. | [optional] 


