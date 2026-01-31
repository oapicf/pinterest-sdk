# CatalogsUpsertHotelItem

A hotel item to be upserted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  | 
**hotel_id** | **str** | The catalog hotel id in the merchant namespace | 
**operation** | **str** |  | 

## Example

```python
from pinterestsdk.models.catalogs_upsert_hotel_item import CatalogsUpsertHotelItem

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsUpsertHotelItem from a JSON string
catalogs_upsert_hotel_item_instance = CatalogsUpsertHotelItem.from_json(json)
# print the JSON string representation of the object
print(CatalogsUpsertHotelItem.to_json())

# convert the object into a dict
catalogs_upsert_hotel_item_dict = catalogs_upsert_hotel_item_instance.to_dict()
# create an instance of CatalogsUpsertHotelItem from a dict
catalogs_upsert_hotel_item_from_dict = CatalogsUpsertHotelItem.from_dict(catalogs_upsert_hotel_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


