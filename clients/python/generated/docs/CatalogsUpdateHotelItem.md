# CatalogsUpdateHotelItem

Object describing an hotel item batch record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsUpdatableHotelAttributes**](CatalogsUpdatableHotelAttributes.md) |  | 
**hotel_id** | **str** | The catalog hotel item id in the merchant namespace | 
**operation** | **str** |  | 

## Example

```python
from pinterestsdk.models.catalogs_update_hotel_item import CatalogsUpdateHotelItem

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsUpdateHotelItem from a JSON string
catalogs_update_hotel_item_instance = CatalogsUpdateHotelItem.from_json(json)
# print the JSON string representation of the object
print(CatalogsUpdateHotelItem.to_json())

# convert the object into a dict
catalogs_update_hotel_item_dict = catalogs_update_hotel_item_instance.to_dict()
# create an instance of CatalogsUpdateHotelItem from a dict
catalogs_update_hotel_item_from_dict = CatalogsUpdateHotelItem.from_dict(catalogs_update_hotel_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


