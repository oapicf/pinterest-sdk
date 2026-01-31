# ConversionApiResponseEventsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error_message** | **str** | Error message containing more information about why the event failed to be processed. | [optional] 
**status** | **str** | Whether the event was processed successfully. | 
**warning_message** | **str** | Warning messages about any fields in the event which are not standard. These are not critical to event processing. | [optional] 

## Example

```python
from pinterestsdk.models.conversion_api_response_events_inner import ConversionApiResponseEventsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionApiResponseEventsInner from a JSON string
conversion_api_response_events_inner_instance = ConversionApiResponseEventsInner.from_json(json)
# print the JSON string representation of the object
print(ConversionApiResponseEventsInner.to_json())

# convert the object into a dict
conversion_api_response_events_inner_dict = conversion_api_response_events_inner_instance.to_dict()
# create an instance of ConversionApiResponseEventsInner from a dict
conversion_api_response_events_inner_from_dict = ConversionApiResponseEventsInner.from_dict(conversion_api_response_events_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


