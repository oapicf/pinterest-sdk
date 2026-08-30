# CatalogsHotelProductGroupCreateRequest

Request object for creating a hotel product group.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog ID pertaining to the product group. | 
**catalog_type** | **str** |  | 
**description** | **str** |  | [optional] 
**filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 
**name** | **str** |  | 

## Example

```python
from openapi_client.models.catalogs_hotel_product_group_create_request import CatalogsHotelProductGroupCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelProductGroupCreateRequest from a JSON string
catalogs_hotel_product_group_create_request_instance = CatalogsHotelProductGroupCreateRequest.from_json(json)
# print the JSON string representation of the object
print CatalogsHotelProductGroupCreateRequest.to_json()

# convert the object into a dict
catalogs_hotel_product_group_create_request_dict = catalogs_hotel_product_group_create_request_instance.to_dict()
# create an instance of CatalogsHotelProductGroupCreateRequest from a dict
catalogs_hotel_product_group_create_request_from_dict = CatalogsHotelProductGroupCreateRequest.from_dict(catalogs_hotel_product_group_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


