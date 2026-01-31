# CatalogsRetailListProductsByCatalogBasedFilterRequest

Request object to list products for a given retail catalog_id and product group filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the retail product group. | 
**catalog_type** | **str** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | 
**country** | [**Country**](Country.md) |  | 
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_retail_list_products_by_catalog_based_filter_request import CatalogsRetailListProductsByCatalogBasedFilterRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailListProductsByCatalogBasedFilterRequest from a JSON string
catalogs_retail_list_products_by_catalog_based_filter_request_instance = CatalogsRetailListProductsByCatalogBasedFilterRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsRetailListProductsByCatalogBasedFilterRequest.to_json())

# convert the object into a dict
catalogs_retail_list_products_by_catalog_based_filter_request_dict = catalogs_retail_list_products_by_catalog_based_filter_request_instance.to_dict()
# create an instance of CatalogsRetailListProductsByCatalogBasedFilterRequest from a dict
catalogs_retail_list_products_by_catalog_based_filter_request_from_dict = CatalogsRetailListProductsByCatalogBasedFilterRequest.from_dict(catalogs_retail_list_products_by_catalog_based_filter_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


