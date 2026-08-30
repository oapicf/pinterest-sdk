# CatalogsHotelBatchRequest

Request object to update catalogs hotel items

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] 
**catalog_type** | **str** |  | 
**country** | [**Country**](Country.md) |  | 
**items** | [**List[CatalogsHotelBatchItem]**](CatalogsHotelBatchItem.md) | Array with catalogs item operations | 
**language** | **str** | We recommend using the CatalogsLocale values. | 

## Example

```python
from openapi_client.models.catalogs_hotel_batch_request import CatalogsHotelBatchRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelBatchRequest from a JSON string
catalogs_hotel_batch_request_instance = CatalogsHotelBatchRequest.from_json(json)
# print the JSON string representation of the object
print CatalogsHotelBatchRequest.to_json()

# convert the object into a dict
catalogs_hotel_batch_request_dict = catalogs_hotel_batch_request_instance.to_dict()
# create an instance of CatalogsHotelBatchRequest from a dict
catalogs_hotel_batch_request_from_dict = CatalogsHotelBatchRequest.from_dict(catalogs_hotel_batch_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


