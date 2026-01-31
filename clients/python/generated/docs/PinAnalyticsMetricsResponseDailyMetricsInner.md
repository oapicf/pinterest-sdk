# PinAnalyticsMetricsResponseDailyMetricsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_status** | [**DataStatus**](DataStatus.md) |  | [optional] 
**var_date** | **str** | Metrics date (UTC): YYYY-MM-DD. | [optional] 
**metrics** | **Dict[str, float]** | The metric name and daily value for each requested metric | [optional] 

## Example

```python
from pinterestsdk.models.pin_analytics_metrics_response_daily_metrics_inner import PinAnalyticsMetricsResponseDailyMetricsInner

# TODO update the JSON string below
json = "{}"
# create an instance of PinAnalyticsMetricsResponseDailyMetricsInner from a JSON string
pin_analytics_metrics_response_daily_metrics_inner_instance = PinAnalyticsMetricsResponseDailyMetricsInner.from_json(json)
# print the JSON string representation of the object
print(PinAnalyticsMetricsResponseDailyMetricsInner.to_json())

# convert the object into a dict
pin_analytics_metrics_response_daily_metrics_inner_dict = pin_analytics_metrics_response_daily_metrics_inner_instance.to_dict()
# create an instance of PinAnalyticsMetricsResponseDailyMetricsInner from a dict
pin_analytics_metrics_response_daily_metrics_inner_from_dict = PinAnalyticsMetricsResponseDailyMetricsInner.from_dict(pin_analytics_metrics_response_daily_metrics_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


