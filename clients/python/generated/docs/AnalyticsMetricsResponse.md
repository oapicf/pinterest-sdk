# AnalyticsMetricsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**daily_metrics** | [**List[AnalyticsDailyMetrics]**](AnalyticsDailyMetrics.md) | Array with the requested daily metric records | [optional] 
**summary_metrics** | **Dict[str, float]** | The metric name and value over the requested period for each requested metric | [optional] 

## Example

```python
from pinterestsdk.models.analytics_metrics_response import AnalyticsMetricsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AnalyticsMetricsResponse from a JSON string
analytics_metrics_response_instance = AnalyticsMetricsResponse.from_json(json)
# print the JSON string representation of the object
print(AnalyticsMetricsResponse.to_json())

# convert the object into a dict
analytics_metrics_response_dict = analytics_metrics_response_instance.to_dict()
# create an instance of AnalyticsMetricsResponse from a dict
analytics_metrics_response_from_dict = AnalyticsMetricsResponse.from_dict(analytics_metrics_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


