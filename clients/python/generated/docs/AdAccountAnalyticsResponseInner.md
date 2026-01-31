# AdAccountAnalyticsResponseInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | The ID of the advertiser that this metrics belongs to. | 
**var_date** | **date** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 

## Example

```python
from pinterestsdk.models.ad_account_analytics_response_inner import AdAccountAnalyticsResponseInner

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountAnalyticsResponseInner from a JSON string
ad_account_analytics_response_inner_instance = AdAccountAnalyticsResponseInner.from_json(json)
# print the JSON string representation of the object
print(AdAccountAnalyticsResponseInner.to_json())

# convert the object into a dict
ad_account_analytics_response_inner_dict = ad_account_analytics_response_inner_instance.to_dict()
# create an instance of AdAccountAnalyticsResponseInner from a dict
ad_account_analytics_response_inner_from_dict = AdAccountAnalyticsResponseInner.from_dict(ad_account_analytics_response_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


