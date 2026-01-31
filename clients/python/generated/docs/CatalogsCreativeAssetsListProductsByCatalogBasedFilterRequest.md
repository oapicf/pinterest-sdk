# CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest

Request object to list products for a given creative assets catalog_id and product group filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the creative assets product group. | 
**catalog_type** | **str** |  | 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_creative_assets_list_products_by_catalog_based_filter_request import CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest from a JSON string
catalogs_creative_assets_list_products_by_catalog_based_filter_request_instance = CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.to_json())

# convert the object into a dict
catalogs_creative_assets_list_products_by_catalog_based_filter_request_dict = catalogs_creative_assets_list_products_by_catalog_based_filter_request_instance.to_dict()
# create an instance of CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest from a dict
catalogs_creative_assets_list_products_by_catalog_based_filter_request_from_dict = CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.from_dict(catalogs_creative_assets_list_products_by_catalog_based_filter_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


