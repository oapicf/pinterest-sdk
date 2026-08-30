# BaseBusinessAssets

An object containing the permissions a business has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] 
**asset_id** | **str** | Unique identifier of a business asset. | [optional] 
**asset_type** | [**AssetTypeResponse**](AssetTypeResponse.md) |  | [optional] 
**permissions** | **List[str]** | Permission levels the requesting business has on an asset. | [optional] 

## Example

```python
from pinterestsdk.models.base_business_assets import BaseBusinessAssets

# TODO update the JSON string below
json = "{}"
# create an instance of BaseBusinessAssets from a JSON string
base_business_assets_instance = BaseBusinessAssets.from_json(json)
# print the JSON string representation of the object
print(BaseBusinessAssets.to_json())

# convert the object into a dict
base_business_assets_dict = base_business_assets_instance.to_dict()
# create an instance of BaseBusinessAssets from a dict
base_business_assets_from_dict = BaseBusinessAssets.from_dict(base_business_assets_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


