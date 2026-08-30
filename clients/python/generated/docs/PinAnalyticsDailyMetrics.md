# PinAnalyticsDailyMetrics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_status** | [**DataStatus**](DataStatus.md) |  | [optional] 
**var_date** | **str** | Metrics date (UTC): YYYY-MM-DD. | [optional] 
**metrics** | **Dict[str, float]** |  | [optional] 

## Example

```python
from pinterestsdk.models.pin_analytics_daily_metrics import PinAnalyticsDailyMetrics

# TODO update the JSON string below
json = "{}"
# create an instance of PinAnalyticsDailyMetrics from a JSON string
pin_analytics_daily_metrics_instance = PinAnalyticsDailyMetrics.from_json(json)
# print the JSON string representation of the object
print(PinAnalyticsDailyMetrics.to_json())

# convert the object into a dict
pin_analytics_daily_metrics_dict = pin_analytics_daily_metrics_instance.to_dict()
# create an instance of PinAnalyticsDailyMetrics from a dict
pin_analytics_daily_metrics_from_dict = PinAnalyticsDailyMetrics.from_dict(pin_analytics_daily_metrics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


