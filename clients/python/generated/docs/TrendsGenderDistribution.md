# TrendsGenderDistribution

This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gender_distribution** | [**TrendsGender**](TrendsGender.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.trends_gender_distribution import TrendsGenderDistribution

# TODO update the JSON string below
json = "{}"
# create an instance of TrendsGenderDistribution from a JSON string
trends_gender_distribution_instance = TrendsGenderDistribution.from_json(json)
# print the JSON string representation of the object
print(TrendsGenderDistribution.to_json())

# convert the object into a dict
trends_gender_distribution_dict = trends_gender_distribution_instance.to_dict()
# create an instance of TrendsGenderDistribution from a dict
trends_gender_distribution_from_dict = TrendsGenderDistribution.from_dict(trends_gender_distribution_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


