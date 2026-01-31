# CatalogsHotelListProductsByCatalogBasedFilterRequest

Request object to list products for a given hotel catalog_id and product group filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the hotel product group. | 
**catalog_type** | **str** |  | 
**filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_hotel_list_products_by_catalog_based_filter_request import CatalogsHotelListProductsByCatalogBasedFilterRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelListProductsByCatalogBasedFilterRequest from a JSON string
catalogs_hotel_list_products_by_catalog_based_filter_request_instance = CatalogsHotelListProductsByCatalogBasedFilterRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsHotelListProductsByCatalogBasedFilterRequest.to_json())

# convert the object into a dict
catalogs_hotel_list_products_by_catalog_based_filter_request_dict = catalogs_hotel_list_products_by_catalog_based_filter_request_instance.to_dict()
# create an instance of CatalogsHotelListProductsByCatalogBasedFilterRequest from a dict
catalogs_hotel_list_products_by_catalog_based_filter_request_from_dict = CatalogsHotelListProductsByCatalogBasedFilterRequest.from_dict(catalogs_hotel_list_products_by_catalog_based_filter_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


