# CampaignsAnalyticsMetrics


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **str** | The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true. | [optional] 
**var_date** | **date** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 

## Example

```python
from openapi_client.models.campaigns_analytics_metrics import CampaignsAnalyticsMetrics

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignsAnalyticsMetrics from a JSON string
campaigns_analytics_metrics_instance = CampaignsAnalyticsMetrics.from_json(json)
# print the JSON string representation of the object
print CampaignsAnalyticsMetrics.to_json()

# convert the object into a dict
campaigns_analytics_metrics_dict = campaigns_analytics_metrics_instance.to_dict()
# create an instance of CampaignsAnalyticsMetrics from a dict
campaigns_analytics_metrics_from_dict = CampaignsAnalyticsMetrics.from_dict(campaigns_analytics_metrics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


