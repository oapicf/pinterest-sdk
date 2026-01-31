# CatalogsRetailProductGroupProductCounts

Product counts for a Retail CatalogsProductGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**in_stock** | **float** |  | 
**out_of_stock** | **float** |  | 
**preorder** | **float** |  | 
**total** | **float** |  | 
**videos** | **float** |  | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_retail_product_group_product_counts import CatalogsRetailProductGroupProductCounts

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailProductGroupProductCounts from a JSON string
catalogs_retail_product_group_product_counts_instance = CatalogsRetailProductGroupProductCounts.from_json(json)
# print the JSON string representation of the object
print(CatalogsRetailProductGroupProductCounts.to_json())

# convert the object into a dict
catalogs_retail_product_group_product_counts_dict = catalogs_retail_product_group_product_counts_instance.to_dict()
# create an instance of CatalogsRetailProductGroupProductCounts from a dict
catalogs_retail_product_group_product_counts_from_dict = CatalogsRetailProductGroupProductCounts.from_dict(catalogs_retail_product_group_product_counts_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


