# ItemProcessingRecord

Object describing an item processing record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**item_id** | **str** | The catalog item id in the merchant namespace | [optional] 
**status** | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] 
**warnings** | [**List[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 

## Example

```python
from pinterestsdk.models.item_processing_record import ItemProcessingRecord

# TODO update the JSON string below
json = "{}"
# create an instance of ItemProcessingRecord from a JSON string
item_processing_record_instance = ItemProcessingRecord.from_json(json)
# print the JSON string representation of the object
print(ItemProcessingRecord.to_json())

# convert the object into a dict
item_processing_record_dict = item_processing_record_instance.to_dict()
# create an instance of ItemProcessingRecord from a dict
item_processing_record_from_dict = ItemProcessingRecord.from_dict(item_processing_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


