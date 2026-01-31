# CatalogsVerticalsListProductsByCatalogBasedFilterRequest

Request object to list products for a given catalog_id and product group filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the creative assets product group. | 
**catalog_type** | **str** |  | 
**country** | [**Country**](Country.md) |  | 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_verticals_list_products_by_catalog_based_filter_request import CatalogsVerticalsListProductsByCatalogBasedFilterRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsVerticalsListProductsByCatalogBasedFilterRequest from a JSON string
catalogs_verticals_list_products_by_catalog_based_filter_request_instance = CatalogsVerticalsListProductsByCatalogBasedFilterRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsVerticalsListProductsByCatalogBasedFilterRequest.to_json())

# convert the object into a dict
catalogs_verticals_list_products_by_catalog_based_filter_request_dict = catalogs_verticals_list_products_by_catalog_based_filter_request_instance.to_dict()
# create an instance of CatalogsVerticalsListProductsByCatalogBasedFilterRequest from a dict
catalogs_verticals_list_products_by_catalog_based_filter_request_from_dict = CatalogsVerticalsListProductsByCatalogBasedFilterRequest.from_dict(catalogs_verticals_list_products_by_catalog_based_filter_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


