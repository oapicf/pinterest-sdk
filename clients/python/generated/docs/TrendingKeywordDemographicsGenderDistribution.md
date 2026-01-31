# TrendingKeywordDemographicsGenderDistribution

This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gender_distribution** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.trending_keyword_demographics_gender_distribution import TrendingKeywordDemographicsGenderDistribution

# TODO update the JSON string below
json = "{}"
# create an instance of TrendingKeywordDemographicsGenderDistribution from a JSON string
trending_keyword_demographics_gender_distribution_instance = TrendingKeywordDemographicsGenderDistribution.from_json(json)
# print the JSON string representation of the object
print(TrendingKeywordDemographicsGenderDistribution.to_json())

# convert the object into a dict
trending_keyword_demographics_gender_distribution_dict = trending_keyword_demographics_gender_distribution_instance.to_dict()
# create an instance of TrendingKeywordDemographicsGenderDistribution from a dict
trending_keyword_demographics_gender_distribution_from_dict = TrendingKeywordDemographicsGenderDistribution.from_dict(trending_keyword_demographics_gender_distribution_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


