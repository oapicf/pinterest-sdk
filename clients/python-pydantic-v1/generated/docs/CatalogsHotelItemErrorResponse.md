# CatalogsHotelItemErrorResponse

Object describing a hotel item error

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**errors** | [**List[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**hotel_id** | **str** | The catalog hotel id in the merchant namespace | [optional] 
**item_response_kind** | **str** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 

## Example

```python
from openapi_client.models.catalogs_hotel_item_error_response import CatalogsHotelItemErrorResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelItemErrorResponse from a JSON string
catalogs_hotel_item_error_response_instance = CatalogsHotelItemErrorResponse.from_json(json)
# print the JSON string representation of the object
print CatalogsHotelItemErrorResponse.to_json()

# convert the object into a dict
catalogs_hotel_item_error_response_dict = catalogs_hotel_item_error_response_instance.to_dict()
# create an instance of CatalogsHotelItemErrorResponse from a dict
catalogs_hotel_item_error_response_from_dict = CatalogsHotelItemErrorResponse.from_dict(catalogs_hotel_item_error_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


