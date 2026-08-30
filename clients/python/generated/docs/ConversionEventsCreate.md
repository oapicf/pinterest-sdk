# ConversionEventsCreate

Conversion events.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[ConversionEventsDataItems]**](ConversionEventsDataItems.md) | A list of events (one or more) encapsulated by a data object. | 

## Example

```python
from pinterestsdk.models.conversion_events_create import ConversionEventsCreate

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionEventsCreate from a JSON string
conversion_events_create_instance = ConversionEventsCreate.from_json(json)
# print the JSON string representation of the object
print(ConversionEventsCreate.to_json())

# convert the object into a dict
conversion_events_create_dict = conversion_events_create_instance.to_dict()
# create an instance of ConversionEventsCreate from a dict
conversion_events_create_from_dict = ConversionEventsCreate.from_dict(conversion_events_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


