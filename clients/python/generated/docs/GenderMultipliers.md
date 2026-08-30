# GenderMultipliers

This represents a mapping from gender targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified gender in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gender** | [**TargetingSpecGender**](TargetingSpecGender.md) | Gender identifier. | [optional] 

## Example

```python
from pinterestsdk.models.gender_multipliers import GenderMultipliers

# TODO update the JSON string below
json = "{}"
# create an instance of GenderMultipliers from a JSON string
gender_multipliers_instance = GenderMultipliers.from_json(json)
# print the JSON string representation of the object
print(GenderMultipliers.to_json())

# convert the object into a dict
gender_multipliers_dict = gender_multipliers_instance.to_dict()
# create an instance of GenderMultipliers from a dict
gender_multipliers_from_dict = GenderMultipliers.from_dict(gender_multipliers_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


