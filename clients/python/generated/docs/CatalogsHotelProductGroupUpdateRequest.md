# CatalogsHotelProductGroupUpdateRequest

Request object for updating a hotel product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_hotel_product_group_update_request import CatalogsHotelProductGroupUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelProductGroupUpdateRequest from a JSON string
catalogs_hotel_product_group_update_request_instance = CatalogsHotelProductGroupUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsHotelProductGroupUpdateRequest.to_json())

# convert the object into a dict
catalogs_hotel_product_group_update_request_dict = catalogs_hotel_product_group_update_request_instance.to_dict()
# create an instance of CatalogsHotelProductGroupUpdateRequest from a dict
catalogs_hotel_product_group_update_request_from_dict = CatalogsHotelProductGroupUpdateRequest.from_dict(catalogs_hotel_product_group_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


