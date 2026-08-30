# TrendingKeywordDemographics

A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. For each dimension: Key: The category (e.g., \"female\", \"18-24\"). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when `include_demographics` query parameter is set to `true`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age_distribution** | [**TrendsAgeDistribution**](TrendsAgeDistribution.md) |  | [optional] 
**gender_distribution** | [**TrendsGenderDistribution**](TrendsGenderDistribution.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.trending_keyword_demographics import TrendingKeywordDemographics

# TODO update the JSON string below
json = "{}"
# create an instance of TrendingKeywordDemographics from a JSON string
trending_keyword_demographics_instance = TrendingKeywordDemographics.from_json(json)
# print the JSON string representation of the object
print(TrendingKeywordDemographics.to_json())

# convert the object into a dict
trending_keyword_demographics_dict = trending_keyword_demographics_instance.to_dict()
# create an instance of TrendingKeywordDemographics from a dict
trending_keyword_demographics_from_dict = TrendingKeywordDemographics.from_dict(trending_keyword_demographics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


