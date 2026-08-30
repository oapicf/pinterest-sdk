# ConversionEvents

Conversion events.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | [**List[ConversionApiResponseEventsItems]**](ConversionApiResponseEventsItems.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | [readonly] 
**num_events_processed** | **int** | Number of events that were successfully processed from the events. | [readonly] 
**num_events_received** | **int** | Total number of events received in the request. | [readonly] 

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


