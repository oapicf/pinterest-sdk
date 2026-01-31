# PinAnalyticsMetricsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**daily_metrics** | [**List[PinAnalyticsMetricsResponseDailyMetricsInner]**](PinAnalyticsMetricsResponseDailyMetricsInner.md) | Array with the requested daily metric records | [optional] 
**lifetime_metrics** | **Dict[str, int]** | The lifetime metric name and value. | [optional] 
**summary_metrics** | **Dict[str, float]** | The metric name and value over the requested period for each requested metric | [optional] 

## Example

```python
from pinterestsdk.models.pin_analytics_metrics_response import PinAnalyticsMetricsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PinAnalyticsMetricsResponse from a JSON string
pin_analytics_metrics_response_instance = PinAnalyticsMetricsResponse.from_json(json)
# print the JSON string representation of the object
print(PinAnalyticsMetricsResponse.to_json())

# convert the object into a dict
pin_analytics_metrics_response_dict = pin_analytics_metrics_response_instance.to_dict()
# create an instance of PinAnalyticsMetricsResponse from a dict
pin_analytics_metrics_response_from_dict = PinAnalyticsMetricsResponse.from_dict(pin_analytics_metrics_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


