# CatalogsDeleteHotelItem

A hotel item to be deleted

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hotel_id** | **str** | The catalog hotel id in the merchant namespace | 
**operation** | **str** |  | 

## Example

```python
from openapi_client.models.catalogs_delete_hotel_item import CatalogsDeleteHotelItem

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsDeleteHotelItem from a JSON string
catalogs_delete_hotel_item_instance = CatalogsDeleteHotelItem.from_json(json)
# print the JSON string representation of the object
print CatalogsDeleteHotelItem.to_json()

# convert the object into a dict
catalogs_delete_hotel_item_dict = catalogs_delete_hotel_item_instance.to_dict()
# create an instance of CatalogsDeleteHotelItem from a dict
catalogs_delete_hotel_item_from_dict = CatalogsDeleteHotelItem.from_dict(catalogs_delete_hotel_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


