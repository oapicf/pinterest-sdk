# CatalogsHotelBatchItem

Hotel batch item

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsUpdatableHotelAttributes**](CatalogsUpdatableHotelAttributes.md) |  | 
**hotel_id** | **str** | The catalog hotel id in the merchant namespace | 
**operation** | **str** |  | 

## Example

```python
from openapi_client.models.catalogs_hotel_batch_item import CatalogsHotelBatchItem

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelBatchItem from a JSON string
catalogs_hotel_batch_item_instance = CatalogsHotelBatchItem.from_json(json)
# print the JSON string representation of the object
print CatalogsHotelBatchItem.to_json()

# convert the object into a dict
catalogs_hotel_batch_item_dict = catalogs_hotel_batch_item_instance.to_dict()
# create an instance of CatalogsHotelBatchItem from a dict
catalogs_hotel_batch_item_from_dict = CatalogsHotelBatchItem.from_dict(catalogs_hotel_batch_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


