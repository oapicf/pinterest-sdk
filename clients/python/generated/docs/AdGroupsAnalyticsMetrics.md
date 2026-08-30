# AdGroupsAnalyticsMetrics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **str** | The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true. | [optional] 
**var_date** | **date** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 

## Example

```python
from pinterestsdk.models.ad_groups_analytics_metrics import AdGroupsAnalyticsMetrics

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupsAnalyticsMetrics from a JSON string
ad_groups_analytics_metrics_instance = AdGroupsAnalyticsMetrics.from_json(json)
# print the JSON string representation of the object
print(AdGroupsAnalyticsMetrics.to_json())

# convert the object into a dict
ad_groups_analytics_metrics_dict = ad_groups_analytics_metrics_instance.to_dict()
# create an instance of AdGroupsAnalyticsMetrics from a dict
ad_groups_analytics_metrics_from_dict = AdGroupsAnalyticsMetrics.from_dict(ad_groups_analytics_metrics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


