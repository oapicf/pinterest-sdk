# CatalogsProductGroupProductCountsVertical

Product counts for a CatalogsProductGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**in_stock** | **float** |  | 
**out_of_stock** | **float** |  | 
**preorder** | **float** |  | 
**total** | **float** |  | 
**videos** | **float** |  | 
**app_links** | **float** |  | 
**images** | **float** |  | 

## Example

```python
from openapi_client.models.catalogs_product_group_product_counts_vertical import CatalogsProductGroupProductCountsVertical

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupProductCountsVertical from a JSON string
catalogs_product_group_product_counts_vertical_instance = CatalogsProductGroupProductCountsVertical.from_json(json)
# print the JSON string representation of the object
print CatalogsProductGroupProductCountsVertical.to_json()

# convert the object into a dict
catalogs_product_group_product_counts_vertical_dict = catalogs_product_group_product_counts_vertical_instance.to_dict()
# create an instance of CatalogsProductGroupProductCountsVertical from a dict
catalogs_product_group_product_counts_vertical_from_dict = CatalogsProductGroupProductCountsVertical.from_dict(catalogs_product_group_product_counts_vertical_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


