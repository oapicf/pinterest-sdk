# CatalogsHotelItemResponse

Object describing a hotel record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  | [optional] 
**catalog_type** | **str** |  | 
**hotel_id** | **str** | The catalog hotel id in the merchant namespace | [optional] 
**item_response_kind** | **str** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**List[Pin]**](Pin.md) | The pins mapped to the item | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_hotel_item_response import CatalogsHotelItemResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelItemResponse from a JSON string
catalogs_hotel_item_response_instance = CatalogsHotelItemResponse.from_json(json)
# print the JSON string representation of the object
print(CatalogsHotelItemResponse.to_json())

# convert the object into a dict
catalogs_hotel_item_response_dict = catalogs_hotel_item_response_instance.to_dict()
# create an instance of CatalogsHotelItemResponse from a dict
catalogs_hotel_item_response_from_dict = CatalogsHotelItemResponse.from_dict(catalogs_hotel_item_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


