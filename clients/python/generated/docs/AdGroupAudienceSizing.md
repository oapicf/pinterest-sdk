# AdGroupAudienceSizing


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_size_lower_bound** | **float** | The lower confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. | [optional] [readonly] 
**audience_size_upper_bound** | **float** | The upper confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.ad_group_audience_sizing import AdGroupAudienceSizing

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupAudienceSizing from a JSON string
ad_group_audience_sizing_instance = AdGroupAudienceSizing.from_json(json)
# print the JSON string representation of the object
print(AdGroupAudienceSizing.to_json())

# convert the object into a dict
ad_group_audience_sizing_dict = ad_group_audience_sizing_instance.to_dict()
# create an instance of AdGroupAudienceSizing from a dict
ad_group_audience_sizing_from_dict = AdGroupAudienceSizing.from_dict(ad_group_audience_sizing_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


