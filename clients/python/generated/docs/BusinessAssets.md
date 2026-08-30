# BusinessAssets


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] 
**asset_id** | **str** | Unique identifier of a business asset. | [optional] 
**asset_type** | [**AssetTypeResponse**](AssetTypeResponse.md) |  | [optional] 
**permissions** | **List[str]** | Permission levels the requesting business has on an asset. | [optional] 
**catalog_info** | [**CatalogBinding**](CatalogBinding.md) | An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;. | [optional] 

## Example

```python
from pinterestsdk.models.business_assets import BusinessAssets

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessAssets from a JSON string
business_assets_instance = BusinessAssets.from_json(json)
# print the JSON string representation of the object
print(BusinessAssets.to_json())

# convert the object into a dict
business_assets_dict = business_assets_instance.to_dict()
# create an instance of BusinessAssets from a dict
business_assets_from_dict = BusinessAssets.from_dict(business_assets_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


