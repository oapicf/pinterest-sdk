# TrendsAgeDistribution

This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age_distribution** | [**TrendsAgeBucket**](TrendsAgeBucket.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.trends_age_distribution import TrendsAgeDistribution

# TODO update the JSON string below
json = "{}"
# create an instance of TrendsAgeDistribution from a JSON string
trends_age_distribution_instance = TrendsAgeDistribution.from_json(json)
# print the JSON string representation of the object
print(TrendsAgeDistribution.to_json())

# convert the object into a dict
trends_age_distribution_dict = trends_age_distribution_instance.to_dict()
# create an instance of TrendsAgeDistribution from a dict
trends_age_distribution_from_dict = TrendsAgeDistribution.from_dict(trends_age_distribution_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


