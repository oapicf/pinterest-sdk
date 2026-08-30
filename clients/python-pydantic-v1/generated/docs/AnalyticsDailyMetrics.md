# AnalyticsDailyMetrics


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_status** | [**DataStatus**](DataStatus.md) |  | [optional] 
**var_date** | **str** | Metrics date (UTC): YYYY-MM-DD. | [optional] 
**metrics** | **Dict[str, float]** |  | [optional] 

## Example

```python
from openapi_client.models.analytics_daily_metrics import AnalyticsDailyMetrics

# TODO update the JSON string below
json = "{}"
# create an instance of AnalyticsDailyMetrics from a JSON string
analytics_daily_metrics_instance = AnalyticsDailyMetrics.from_json(json)
# print the JSON string representation of the object
print AnalyticsDailyMetrics.to_json()

# convert the object into a dict
analytics_daily_metrics_dict = analytics_daily_metrics_instance.to_dict()
# create an instance of AnalyticsDailyMetrics from a dict
analytics_daily_metrics_from_dict = AnalyticsDailyMetrics.from_dict(analytics_daily_metrics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


