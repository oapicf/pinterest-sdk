# AssetGroupDeletionDelete


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_groups_to_delete** | **List[str]** |  | 

## Example

```python
from openapi_client.models.asset_group_deletion_delete import AssetGroupDeletionDelete

# TODO update the JSON string below
json = "{}"
# create an instance of AssetGroupDeletionDelete from a JSON string
asset_group_deletion_delete_instance = AssetGroupDeletionDelete.from_json(json)
# print the JSON string representation of the object
print AssetGroupDeletionDelete.to_json()

# convert the object into a dict
asset_group_deletion_delete_dict = asset_group_deletion_delete_instance.to_dict()
# create an instance of AssetGroupDeletionDelete from a dict
asset_group_deletion_delete_from_dict = AssetGroupDeletionDelete.from_dict(asset_group_deletion_delete_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


