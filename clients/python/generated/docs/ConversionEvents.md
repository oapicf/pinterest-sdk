# ConversionEvents

A list of events (one or more) encapsulated by a data object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[ConversionEventsDataInner]**](ConversionEventsDataInner.md) |  | 

## Example

```python
from pinterestsdk.models.conversion_events import ConversionEvents

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionEvents from a JSON string
conversion_events_instance = ConversionEvents.from_json(json)
# print the JSON string representation of the object
print(ConversionEvents.to_json())

# convert the object into a dict
conversion_events_dict = conversion_events_instance.to_dict()
# create an instance of ConversionEvents from a dict
conversion_events_from_dict = ConversionEvents.from_dict(conversion_events_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


