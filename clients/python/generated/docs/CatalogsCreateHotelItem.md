# CatalogsCreateHotelItem

A hotel item to be created.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  | 
**hotel_id** | **str** | The catalog hotel id in the merchant namespace | 
**operation** | **str** |  | 

## Example

```python
from pinterestsdk.models.catalogs_create_hotel_item import CatalogsCreateHotelItem

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreateHotelItem from a JSON string
catalogs_create_hotel_item_instance = CatalogsCreateHotelItem.from_json(json)
# print the JSON string representation of the object
print(CatalogsCreateHotelItem.to_json())

# convert the object into a dict
catalogs_create_hotel_item_dict = catalogs_create_hotel_item_instance.to_dict()
# create an instance of CatalogsCreateHotelItem from a dict
catalogs_create_hotel_item_from_dict = CatalogsCreateHotelItem.from_dict(catalogs_create_hotel_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


