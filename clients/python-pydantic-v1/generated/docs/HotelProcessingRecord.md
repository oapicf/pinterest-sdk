# HotelProcessingRecord

Object describing an item processing record

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**hotel_id** | **str** | The catalog hotel id in the merchant namespace | [optional] 
**status** | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] 
**warnings** | [**List[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 

## Example

```python
from openapi_client.models.hotel_processing_record import HotelProcessingRecord

# TODO update the JSON string below
json = "{}"
# create an instance of HotelProcessingRecord from a JSON string
hotel_processing_record_instance = HotelProcessingRecord.from_json(json)
# print the JSON string representation of the object
print HotelProcessingRecord.to_json()

# convert the object into a dict
hotel_processing_record_dict = hotel_processing_record_instance.to_dict()
# create an instance of HotelProcessingRecord from a dict
hotel_processing_record_from_dict = HotelProcessingRecord.from_dict(hotel_processing_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


