# TopPinsAnalyticsResponsePinsInner

Array with metrics, status, and pin id for the requested metric

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_status** | [**Dict[str, DataStatus]**](DataStatus.md) |  | [optional] 
**metrics** | **Dict[str, float]** | The metric name and daily value for each requested metric | [optional] 
**pin_id** | **str** | The pin id | [optional] 

## Example

```python
from pinterestsdk.models.top_pins_analytics_response_pins_inner import TopPinsAnalyticsResponsePinsInner

# TODO update the JSON string below
json = "{}"
# create an instance of TopPinsAnalyticsResponsePinsInner from a JSON string
top_pins_analytics_response_pins_inner_instance = TopPinsAnalyticsResponsePinsInner.from_json(json)
# print the JSON string representation of the object
print(TopPinsAnalyticsResponsePinsInner.to_json())

# convert the object into a dict
top_pins_analytics_response_pins_inner_dict = top_pins_analytics_response_pins_inner_instance.to_dict()
# create an instance of TopPinsAnalyticsResponsePinsInner from a dict
top_pins_analytics_response_pins_inner_from_dict = TopPinsAnalyticsResponsePinsInner.from_dict(top_pins_analytics_response_pins_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


