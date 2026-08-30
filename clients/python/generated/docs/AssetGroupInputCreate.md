# AssetGroupInputCreate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 
**asset_group_description** | **str** | Asset group description. | 
**asset_group_name** | **str** | Asset Group name. | 
**asset_group_types** | [**List[AssetGroupType]**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | 

## Example

```python
from pinterestsdk.models.asset_group_input_create import AssetGroupInputCreate

# TODO update the JSON string below
json = "{}"
# create an instance of AssetGroupInputCreate from a JSON string
asset_group_input_create_instance = AssetGroupInputCreate.from_json(json)
# print the JSON string representation of the object
print(AssetGroupInputCreate.to_json())

# convert the object into a dict
asset_group_input_create_dict = asset_group_input_create_instance.to_dict()
# create an instance of AssetGroupInputCreate from a dict
asset_group_input_create_from_dict = AssetGroupInputCreate.from_dict(asset_group_input_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


