# AdPinAnalytics


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_date** | **date** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 
**pin_id** | **str** | The ID of the pin that the metric belongs to. | 

## Example

```python
from openapi_client.models.ad_pin_analytics import AdPinAnalytics

# TODO update the JSON string below
json = "{}"
# create an instance of AdPinAnalytics from a JSON string
ad_pin_analytics_instance = AdPinAnalytics.from_json(json)
# print the JSON string representation of the object
print AdPinAnalytics.to_json()

# convert the object into a dict
ad_pin_analytics_dict = ad_pin_analytics_instance.to_dict()
# create an instance of AdPinAnalytics from a dict
ad_pin_analytics_from_dict = AdPinAnalytics.from_dict(ad_pin_analytics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


