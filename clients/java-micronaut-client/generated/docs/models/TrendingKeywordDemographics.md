

# TrendingKeywordDemographics

A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. For each dimension: Key: The category (e.g., \"female\", \"18-24\"). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when `include_demographics` query parameter is set to `true`.

The class is defined in **[TrendingKeywordDemographics.java](../../src/main/java/org/openapitools/model/TrendingKeywordDemographics.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ageDistribution** | `TrendsAgeDistribution` |  |  [optional property]
**genderDistribution** | `TrendsGenderDistribution` |  |  [optional property]




