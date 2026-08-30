# AdsAnalytics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_id** | **str** |  | 
**var_date** | **date** |  | [optional] 

## Example

```python
from pinterestsdk.models.ads_analytics import AdsAnalytics

# TODO update the JSON string below
json = "{}"
# create an instance of AdsAnalytics from a JSON string
ads_analytics_instance = AdsAnalytics.from_json(json)
# print the JSON string representation of the object
print(AdsAnalytics.to_json())

# convert the object into a dict
ads_analytics_dict = ads_analytics_instance.to_dict()
# create an instance of AdsAnalytics from a dict
ads_analytics_from_dict = AdsAnalytics.from_dict(ads_analytics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


