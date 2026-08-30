# AssetGroupDeleteError


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_id** | **str** | Asset group id of the exception. | [optional] 
**code** | **int** | Error code associated with the error deleting asset group. | [optional] 
**message** | **str** | Error message associated with the error deleting asset group. | [optional] 

## Example

```python
from openapi_client.models.asset_group_delete_error import AssetGroupDeleteError

# TODO update the JSON string below
json = "{}"
# create an instance of AssetGroupDeleteError from a JSON string
asset_group_delete_error_instance = AssetGroupDeleteError.from_json(json)
# print the JSON string representation of the object
print AssetGroupDeleteError.to_json()

# convert the object into a dict
asset_group_delete_error_dict = asset_group_delete_error_instance.to_dict()
# create an instance of AssetGroupDeleteError from a dict
asset_group_delete_error_from_dict = AssetGroupDeleteError.from_dict(asset_group_delete_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


