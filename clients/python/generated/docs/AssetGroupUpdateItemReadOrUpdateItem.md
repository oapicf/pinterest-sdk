# AssetGroupUpdateItemReadOrUpdateItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_id** | **str** | Unique identifier of the asset group to update. | 
**asset_group_types** | [**List[AssetGroupType]**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional] 
**assets_to_add** | **List[str]** | A list of asset ids to add to the asset group. | [optional] 
**assets_to_remove** | **List[str]** | A list of asset ids to remove from the asset group. | [optional] 
**description** | **str** | Asset group description. | [optional] 
**name** | **str** | Asset Group name. | [optional] 

## Example

```python
from pinterestsdk.models.asset_group_update_item_read_or_update_item import AssetGroupUpdateItemReadOrUpdateItem

# TODO update the JSON string below
json = "{}"
# create an instance of AssetGroupUpdateItemReadOrUpdateItem from a JSON string
asset_group_update_item_read_or_update_item_instance = AssetGroupUpdateItemReadOrUpdateItem.from_json(json)
# print the JSON string representation of the object
print(AssetGroupUpdateItemReadOrUpdateItem.to_json())

# convert the object into a dict
asset_group_update_item_read_or_update_item_dict = asset_group_update_item_read_or_update_item_instance.to_dict()
# create an instance of AssetGroupUpdateItemReadOrUpdateItem from a dict
asset_group_update_item_read_or_update_item_from_dict = AssetGroupUpdateItemReadOrUpdateItem.from_dict(asset_group_update_item_read_or_update_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


