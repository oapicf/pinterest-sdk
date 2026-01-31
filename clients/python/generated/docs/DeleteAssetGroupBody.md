# DeleteAssetGroupBody

Request body used to delete asset groups

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_groups_to_delete** | **List[str]** | List of ids of asset groups to be deleted | 

## Example

```python
from pinterestsdk.models.delete_asset_group_body import DeleteAssetGroupBody

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteAssetGroupBody from a JSON string
delete_asset_group_body_instance = DeleteAssetGroupBody.from_json(json)
# print the JSON string representation of the object
print(DeleteAssetGroupBody.to_json())

# convert the object into a dict
delete_asset_group_body_dict = delete_asset_group_body_instance.to_dict()
# create an instance of DeleteAssetGroupBody from a dict
delete_asset_group_body_from_dict = DeleteAssetGroupBody.from_dict(delete_asset_group_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


