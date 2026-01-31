# TrendingKeywordDemographics
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AgeDistribution** | [**TrendingKeywordDemographicsAgeDistribution**](TrendingKeywordDemographicsAgeDistribution.md) |  | [optional] 
**GenderDistribution** | [**TrendingKeywordDemographicsGenderDistribution**](TrendingKeywordDemographicsGenderDistribution.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TrendingKeywordDemographics = Initialize-PSOpenAPIToolsTrendingKeywordDemographics  -AgeDistribution null `
 -GenderDistribution null
```

- Convert the resource to JSON
```powershell
$TrendingKeywordDemographics | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

