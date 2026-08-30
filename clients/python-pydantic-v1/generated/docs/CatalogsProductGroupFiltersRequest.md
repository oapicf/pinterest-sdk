# CatalogsProductGroupFiltersRequest

Object holding a group of filters for request on catalog product group.  This is a distinct schema. It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**any_of** | [**List[CatalogsProductGroupFilterKeys]**](CatalogsProductGroupFilterKeys.md) |  | 
**all_of** | [**List[CatalogsProductGroupFilterKeys]**](CatalogsProductGroupFilterKeys.md) |  | 

## Example

```python
from openapi_client.models.catalogs_product_group_filters_request import CatalogsProductGroupFiltersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupFiltersRequest from a JSON string
catalogs_product_group_filters_request_instance = CatalogsProductGroupFiltersRequest.from_json(json)
# print the JSON string representation of the object
print CatalogsProductGroupFiltersRequest.to_json()

# convert the object into a dict
catalogs_product_group_filters_request_dict = catalogs_product_group_filters_request_instance.to_dict()
# create an instance of CatalogsProductGroupFiltersRequest from a dict
catalogs_product_group_filters_request_from_dict = CatalogsProductGroupFiltersRequest.from_dict(catalogs_product_group_filters_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


