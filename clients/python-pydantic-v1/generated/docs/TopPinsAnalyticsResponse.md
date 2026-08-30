# TopPinsAnalyticsResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_availability** | [**TopPinsAnalyticsResponseDateAvailability**](TopPinsAnalyticsResponseDateAvailability.md) |  | [optional] 
**pins** | [**List[TopPinsAnalyticsResponsePinsItems]**](TopPinsAnalyticsResponsePinsItems.md) |  | [optional] 
**sort_by** | [**TopPinsSortBy**](TopPinsSortBy.md) |  | [optional] 

## Example

```python
from openapi_client.models.top_pins_analytics_response import TopPinsAnalyticsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of TopPinsAnalyticsResponse from a JSON string
top_pins_analytics_response_instance = TopPinsAnalyticsResponse.from_json(json)
# print the JSON string representation of the object
print TopPinsAnalyticsResponse.to_json()

# convert the object into a dict
top_pins_analytics_response_dict = top_pins_analytics_response_instance.to_dict()
# create an instance of TopPinsAnalyticsResponse from a dict
top_pins_analytics_response_from_dict = TopPinsAnalyticsResponse.from_dict(top_pins_analytics_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


