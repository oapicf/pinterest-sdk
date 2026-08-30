# AssetGroupUpdateError


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_id** | **str** |  | [optional] 
**code** | **int** |  | [optional] 
**message** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.asset_group_update_error import AssetGroupUpdateError

# TODO update the JSON string below
json = "{}"
# create an instance of AssetGroupUpdateError from a JSON string
asset_group_update_error_instance = AssetGroupUpdateError.from_json(json)
# print the JSON string representation of the object
print(AssetGroupUpdateError.to_json())

# convert the object into a dict
asset_group_update_error_dict = asset_group_update_error_instance.to_dict()
# create an instance of AssetGroupUpdateError from a dict
asset_group_update_error_from_dict = AssetGroupUpdateError.from_dict(asset_group_update_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


