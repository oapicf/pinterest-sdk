# ConversionApiResponse

Schema describing the object in the response, which contains information about the events that were received and processed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | [**List[ConversionApiResponseEventsInner]**](ConversionApiResponseEventsInner.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | 
**num_events_processed** | **int** | Number of events that were successfully processed from the events. | 
**num_events_received** | **int** | Total number of events received in the request. | 

## Example

```python
from pinterestsdk.models.conversion_api_response import ConversionApiResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionApiResponse from a JSON string
conversion_api_response_instance = ConversionApiResponse.from_json(json)
# print the JSON string representation of the object
print(ConversionApiResponse.to_json())

# convert the object into a dict
conversion_api_response_dict = conversion_api_response_instance.to_dict()
# create an instance of ConversionApiResponse from a dict
conversion_api_response_from_dict = ConversionApiResponse.from_dict(conversion_api_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


