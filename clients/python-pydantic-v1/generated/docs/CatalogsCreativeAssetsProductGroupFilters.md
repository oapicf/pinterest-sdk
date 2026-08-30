# CatalogsCreativeAssetsProductGroupFilters

Object holding a group of filters for a creative assets product group

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**any_of** | [**List[CatalogsCreativeAssetsProductGroupFilterKeys]**](CatalogsCreativeAssetsProductGroupFilterKeys.md) |  | 
**all_of** | [**List[CatalogsCreativeAssetsProductGroupFilterKeys]**](CatalogsCreativeAssetsProductGroupFilterKeys.md) |  | 

## Example

```python
from openapi_client.models.catalogs_creative_assets_product_group_filters import CatalogsCreativeAssetsProductGroupFilters

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsProductGroupFilters from a JSON string
catalogs_creative_assets_product_group_filters_instance = CatalogsCreativeAssetsProductGroupFilters.from_json(json)
# print the JSON string representation of the object
print CatalogsCreativeAssetsProductGroupFilters.to_json()

# convert the object into a dict
catalogs_creative_assets_product_group_filters_dict = catalogs_creative_assets_product_group_filters_instance.to_dict()
# create an instance of CatalogsCreativeAssetsProductGroupFilters from a dict
catalogs_creative_assets_product_group_filters_from_dict = CatalogsCreativeAssetsProductGroupFilters.from_dict(catalogs_creative_assets_product_group_filters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


