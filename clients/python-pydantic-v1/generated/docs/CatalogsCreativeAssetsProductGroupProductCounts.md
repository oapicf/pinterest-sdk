# CatalogsCreativeAssetsProductGroupProductCounts

Product counts for a Creative Assets CatalogsProductGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_links** | **float** |  | 
**catalog_type** | **str** |  | 
**images** | **float** |  | 
**total** | **float** |  | 
**videos** | **float** |  | 

## Example

```python
from openapi_client.models.catalogs_creative_assets_product_group_product_counts import CatalogsCreativeAssetsProductGroupProductCounts

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsProductGroupProductCounts from a JSON string
catalogs_creative_assets_product_group_product_counts_instance = CatalogsCreativeAssetsProductGroupProductCounts.from_json(json)
# print the JSON string representation of the object
print CatalogsCreativeAssetsProductGroupProductCounts.to_json()

# convert the object into a dict
catalogs_creative_assets_product_group_product_counts_dict = catalogs_creative_assets_product_group_product_counts_instance.to_dict()
# create an instance of CatalogsCreativeAssetsProductGroupProductCounts from a dict
catalogs_creative_assets_product_group_product_counts_from_dict = CatalogsCreativeAssetsProductGroupProductCounts.from_dict(catalogs_creative_assets_product_group_product_counts_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


