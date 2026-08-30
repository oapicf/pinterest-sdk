# TargetingTemplateAudienceSizing

Gets an audience size estimate for a set of given targeting spec data. **Returns:** An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reach_estimate** | [**TargetingTemplateAudienceSizingReachEstimate**](TargetingTemplateAudienceSizingReachEstimate.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.targeting_template_audience_sizing import TargetingTemplateAudienceSizing

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingTemplateAudienceSizing from a JSON string
targeting_template_audience_sizing_instance = TargetingTemplateAudienceSizing.from_json(json)
# print the JSON string representation of the object
print(TargetingTemplateAudienceSizing.to_json())

# convert the object into a dict
targeting_template_audience_sizing_dict = targeting_template_audience_sizing_instance.to_dict()
# create an instance of TargetingTemplateAudienceSizing from a dict
targeting_template_audience_sizing_from_dict = TargetingTemplateAudienceSizing.from_dict(targeting_template_audience_sizing_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


