# Org.OpenAPITools.Model.TrendingKeywordDemographics
A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. <br /> For each dimension: <br />   - Key: The category (e.g., \"female\", \"18-24\"). <br />   - Value: The proportion of search volume (e.g., 0.12 for 12%). <br />     Values less than 0.05 are set to 0.04 for privacy. <br />     The sum for all categories in a dimension will approximately equal 1. <br />     Only applicable when `include_demographics` query parameter is set to `true`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AgeDistribution** | [**TrendingKeywordDemographicsAgeDistribution**](TrendingKeywordDemographicsAgeDistribution.md) |  | [optional] 
**GenderDistribution** | [**TrendingKeywordDemographicsGenderDistribution**](TrendingKeywordDemographicsGenderDistribution.md) |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

