# AdsAnalyticsMetricsFilter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | [**AdsAnalyticsFilterColumn**](AdsAnalyticsFilterColumn.md) |  | 
**operator** | [**AdsAnalyticsFilterOperator**](AdsAnalyticsFilterOperator.md) |  | 
**values** | **List[float]** | List of values for filtering | 

## Example

```python
from openapi_client.models.ads_analytics_metrics_filter import AdsAnalyticsMetricsFilter

# TODO update the JSON string below
json = "{}"
# create an instance of AdsAnalyticsMetricsFilter from a JSON string
ads_analytics_metrics_filter_instance = AdsAnalyticsMetricsFilter.from_json(json)
# print the JSON string representation of the object
print AdsAnalyticsMetricsFilter.to_json()

# convert the object into a dict
ads_analytics_metrics_filter_dict = ads_analytics_metrics_filter_instance.to_dict()
# create an instance of AdsAnalyticsMetricsFilter from a dict
ads_analytics_metrics_filter_from_dict = AdsAnalyticsMetricsFilter.from_dict(ads_analytics_metrics_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


