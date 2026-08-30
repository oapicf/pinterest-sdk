# TopVideoPinsAnalyticsResponsePinsItems

Array with metrics, status, and pin id for the requested metric

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_status** | [**Dict[str, DataStatus]**](DataStatus.md) |  | [optional] 
**metrics** | **Dict[str, float]** |  | [optional] 
**pin_id** | **str** | The pin id | [optional] 

## Example

```python
from openapi_client.models.top_video_pins_analytics_response_pins_items import TopVideoPinsAnalyticsResponsePinsItems

# TODO update the JSON string below
json = "{}"
# create an instance of TopVideoPinsAnalyticsResponsePinsItems from a JSON string
top_video_pins_analytics_response_pins_items_instance = TopVideoPinsAnalyticsResponsePinsItems.from_json(json)
# print the JSON string representation of the object
print TopVideoPinsAnalyticsResponsePinsItems.to_json()

# convert the object into a dict
top_video_pins_analytics_response_pins_items_dict = top_video_pins_analytics_response_pins_items_instance.to_dict()
# create an instance of TopVideoPinsAnalyticsResponsePinsItems from a dict
top_video_pins_analytics_response_pins_items_from_dict = TopVideoPinsAnalyticsResponsePinsItems.from_dict(top_video_pins_analytics_response_pins_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


