# AssetGroupDeletion


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleted_asset_groups** | **List[str]** |  | [optional] [readonly] 
**exceptions** | [**List[AssetGroupDeleteError]**](AssetGroupDeleteError.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.asset_group_deletion import AssetGroupDeletion

# TODO update the JSON string below
json = "{}"
# create an instance of AssetGroupDeletion from a JSON string
asset_group_deletion_instance = AssetGroupDeletion.from_json(json)
# print the JSON string representation of the object
print(AssetGroupDeletion.to_json())

# convert the object into a dict
asset_group_deletion_dict = asset_group_deletion_instance.to_dict()
# create an instance of AssetGroupDeletion from a dict
asset_group_deletion_from_dict = AssetGroupDeletion.from_dict(asset_group_deletion_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


