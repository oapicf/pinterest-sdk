# TopVideoPinsAnalyticsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_availability** | [**TopPinsAnalyticsResponseDateAvailability**](TopPinsAnalyticsResponseDateAvailability.md) |  | [optional] 
**pins** | [**List[TopVideoPinsAnalyticsResponsePinsInner]**](TopVideoPinsAnalyticsResponsePinsInner.md) |  | [optional] 
**sort_by** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.top_video_pins_analytics_response import TopVideoPinsAnalyticsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of TopVideoPinsAnalyticsResponse from a JSON string
top_video_pins_analytics_response_instance = TopVideoPinsAnalyticsResponse.from_json(json)
# print the JSON string representation of the object
print(TopVideoPinsAnalyticsResponse.to_json())

# convert the object into a dict
top_video_pins_analytics_response_dict = top_video_pins_analytics_response_instance.to_dict()
# create an instance of TopVideoPinsAnalyticsResponse from a dict
top_video_pins_analytics_response_from_dict = TopVideoPinsAnalyticsResponse.from_dict(top_video_pins_analytics_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


