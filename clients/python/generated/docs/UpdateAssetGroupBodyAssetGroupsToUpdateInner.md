# UpdateAssetGroupBodyAssetGroupsToUpdateInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_id** | **str** | Unique identifier of the asset group to update. | 
**asset_group_types** | [**List[AssetGroupType]**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional] 
**assets_to_add** | **List[str]** | A list of asset ids to add to the asset group. | [optional] 
**assets_to_remove** | **List[str]** | A list of asset ids to remove from the asset group. | [optional] 
**description** | **str** | Asset group description | [optional] 
**name** | **str** | Asset Group name | [optional] 

## Example

```python
from pinterestsdk.models.update_asset_group_body_asset_groups_to_update_inner import UpdateAssetGroupBodyAssetGroupsToUpdateInner

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateAssetGroupBodyAssetGroupsToUpdateInner from a JSON string
update_asset_group_body_asset_groups_to_update_inner_instance = UpdateAssetGroupBodyAssetGroupsToUpdateInner.from_json(json)
# print the JSON string representation of the object
print(UpdateAssetGroupBodyAssetGroupsToUpdateInner.to_json())

# convert the object into a dict
update_asset_group_body_asset_groups_to_update_inner_dict = update_asset_group_body_asset_groups_to_update_inner_instance.to_dict()
# create an instance of UpdateAssetGroupBodyAssetGroupsToUpdateInner from a dict
update_asset_group_body_asset_groups_to_update_inner_from_dict = UpdateAssetGroupBodyAssetGroupsToUpdateInner.from_dict(update_asset_group_body_asset_groups_to_update_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


