# AdsAnalyticsResponseInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_id** | **str** | The ID of the ad that this metrics belongs to. | 
**var_date** | **date** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 

## Example

```python
from pinterestsdk.models.ads_analytics_response_inner import AdsAnalyticsResponseInner

# TODO update the JSON string below
json = "{}"
# create an instance of AdsAnalyticsResponseInner from a JSON string
ads_analytics_response_inner_instance = AdsAnalyticsResponseInner.from_json(json)
# print the JSON string representation of the object
print(AdsAnalyticsResponseInner.to_json())

# convert the object into a dict
ads_analytics_response_inner_dict = ads_analytics_response_inner_instance.to_dict()
# create an instance of AdsAnalyticsResponseInner from a dict
ads_analytics_response_inner_from_dict = AdsAnalyticsResponseInner.from_dict(ads_analytics_response_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


