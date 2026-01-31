# AdGroupsAnalyticsResponseInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **str** | The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true. | [optional] 
**var_date** | **date** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 

## Example

```python
from pinterestsdk.models.ad_groups_analytics_response_inner import AdGroupsAnalyticsResponseInner

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupsAnalyticsResponseInner from a JSON string
ad_groups_analytics_response_inner_instance = AdGroupsAnalyticsResponseInner.from_json(json)
# print the JSON string representation of the object
print(AdGroupsAnalyticsResponseInner.to_json())

# convert the object into a dict
ad_groups_analytics_response_inner_dict = ad_groups_analytics_response_inner_instance.to_dict()
# create an instance of AdGroupsAnalyticsResponseInner from a dict
ad_groups_analytics_response_inner_from_dict = AdGroupsAnalyticsResponseInner.from_dict(ad_groups_analytics_response_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


