# GetBusinessAssetsResponseCatalogInfo

An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** | Catalog type | [optional] 
**id** | **str** | Catalog ID. | [optional] 
**name** | **str** | Catalog name | [optional] 

## Example

```python
from pinterestsdk.models.get_business_assets_response_catalog_info import GetBusinessAssetsResponseCatalogInfo

# TODO update the JSON string below
json = "{}"
# create an instance of GetBusinessAssetsResponseCatalogInfo from a JSON string
get_business_assets_response_catalog_info_instance = GetBusinessAssetsResponseCatalogInfo.from_json(json)
# print the JSON string representation of the object
print(GetBusinessAssetsResponseCatalogInfo.to_json())

# convert the object into a dict
get_business_assets_response_catalog_info_dict = get_business_assets_response_catalog_info_instance.to_dict()
# create an instance of GetBusinessAssetsResponseCatalogInfo from a dict
get_business_assets_response_catalog_info_from_dict = GetBusinessAssetsResponseCatalogInfo.from_dict(get_business_assets_response_catalog_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


