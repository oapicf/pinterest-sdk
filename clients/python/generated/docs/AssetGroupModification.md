# AssetGroupModification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exceptions** | [**List[AssetGroupUpdateError]**](AssetGroupUpdateError.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] [readonly] 
**updated_asset_groups** | [**List[AssetGroupBinding]**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.asset_group_modification import AssetGroupModification

# TODO update the JSON string below
json = "{}"
# create an instance of AssetGroupModification from a JSON string
asset_group_modification_instance = AssetGroupModification.from_json(json)
# print the JSON string representation of the object
print(AssetGroupModification.to_json())

# convert the object into a dict
asset_group_modification_dict = asset_group_modification_instance.to_dict()
# create an instance of AssetGroupModification from a dict
asset_group_modification_from_dict = AssetGroupModification.from_dict(asset_group_modification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


