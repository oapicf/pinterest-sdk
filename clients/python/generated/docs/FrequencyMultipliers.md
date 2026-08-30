# FrequencyMultipliers

This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**impression_count** | **str** | Impression count identifier. | [optional] 

## Example

```python
from pinterestsdk.models.frequency_multipliers import FrequencyMultipliers

# TODO update the JSON string below
json = "{}"
# create an instance of FrequencyMultipliers from a JSON string
frequency_multipliers_instance = FrequencyMultipliers.from_json(json)
# print the JSON string representation of the object
print(FrequencyMultipliers.to_json())

# convert the object into a dict
frequency_multipliers_dict = frequency_multipliers_instance.to_dict()
# create an instance of FrequencyMultipliers from a dict
frequency_multipliers_from_dict = FrequencyMultipliers.from_dict(frequency_multipliers_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


