# CatalogsListProductsByFilterRequest

Request object to list products for a given product group filter.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feed_id** | **str** | Catalog Feed id pertaining to the catalog product group filter. | 
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 

## Example

```python
from openapi_client.models.catalogs_list_products_by_filter_request import CatalogsListProductsByFilterRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsListProductsByFilterRequest from a JSON string
catalogs_list_products_by_filter_request_instance = CatalogsListProductsByFilterRequest.from_json(json)
# print the JSON string representation of the object
print CatalogsListProductsByFilterRequest.to_json()

# convert the object into a dict
catalogs_list_products_by_filter_request_dict = catalogs_list_products_by_filter_request_instance.to_dict()
# create an instance of CatalogsListProductsByFilterRequest from a dict
catalogs_list_products_by_filter_request_from_dict = CatalogsListProductsByFilterRequest.from_dict(catalogs_list_products_by_filter_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


