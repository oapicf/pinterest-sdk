# ItemValidationEvent

Object describing an item validation event

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribute** | **str** | The attribute that the item validation event references | [optional] 
**code** | **int** | The event code that the item validation event references | [optional] 
**message** | **str** | Title message describing the item validation event | [optional] 

## Example

```python
from openapi_client.models.item_validation_event import ItemValidationEvent

# TODO update the JSON string below
json = "{}"
# create an instance of ItemValidationEvent from a JSON string
item_validation_event_instance = ItemValidationEvent.from_json(json)
# print the JSON string representation of the object
print ItemValidationEvent.to_json()

# convert the object into a dict
item_validation_event_dict = item_validation_event_instance.to_dict()
# create an instance of ItemValidationEvent from a dict
item_validation_event_from_dict = ItemValidationEvent.from_dict(item_validation_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


