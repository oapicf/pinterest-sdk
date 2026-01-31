# TrendingTopic
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **String** | Description of the trending topic | 
**PercentGrowthMom** | **Int32** | Month-over-month growth percentage | 
**Pins** | [**TrendingPin[]**](TrendingPin.md) | Array of pin images related to this trend (up to 6) | 
**RelatedInterests** | **String[]** | List of related interest categories | 
**RelatedSearches** | **String[]** | List of related search terms | 
**TimeSeries** | **System.Collections.Hashtable** | Time series data showing trend values over time, with dates as keys and values as numeric | 
**Title** | **String** | Title of the trending topic | 

## Examples

- Prepare the resource
```powershell
$TrendingTopic = Initialize-PSOpenAPIToolsTrendingTopic  -Description null `
 -PercentGrowthMom null `
 -Pins null `
 -RelatedInterests null `
 -RelatedSearches null `
 -TimeSeries null `
 -Title null
```

- Convert the resource to JSON
```powershell
$TrendingTopic | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

