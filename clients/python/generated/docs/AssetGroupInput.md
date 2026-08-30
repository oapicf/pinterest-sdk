# AssetGroupInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.asset_group_input import AssetGroupInput

# TODO update the JSON string below
json = "{}"
# create an instance of AssetGroupInput from a JSON string
asset_group_input_instance = AssetGroupInput.from_json(json)
# print the JSON string representation of the object
print(AssetGroupInput.to_json())

# convert the object into a dict
asset_group_input_dict = asset_group_input_instance.to_dict()
# create an instance of AssetGroupInput from a dict
asset_group_input_from_dict = AssetGroupInput.from_dict(asset_group_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


