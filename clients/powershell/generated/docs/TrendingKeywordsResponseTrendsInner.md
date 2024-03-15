# TrendingKeywordsResponseTrendsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Keyword** | **String** | The keyword that is trending. | [optional] 
**PctGrowthWow** | **Int32** | The week-over-week percent change in search volume for this keyword.&lt;br /&gt; For example, a value of &quot;&quot;50&quot;&quot; would represent a 50% increase in searches in the last seven days compared to the week prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth. | [optional] 
**PctGrowthMom** | **Int32** | The month-over-month percent change in search volume for this keyword.&lt;br /&gt; For example, a value of &quot;&quot;400&quot;&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth. | [optional] 
**PctGrowthYoy** | **Int32** | The year-over-year percent change in search volume for this keyword.&lt;br /&gt; For example, a value of &quot;&quot;-5&quot;&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth. | [optional] 
**TimeSeries** | [**TrendingKeywordsResponseTrendsInnerTimeSeries**](TrendingKeywordsResponseTrendsInnerTimeSeries.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TrendingKeywordsResponseTrendsInner = Initialize-PSOpenAPIToolsTrendingKeywordsResponseTrendsInner  -Keyword couples halloween costumes `
 -PctGrowthWow 50 `
 -PctGrowthMom 400 `
 -PctGrowthYoy -5 `
 -TimeSeries null
```

- Convert the resource to JSON
```powershell
$TrendingKeywordsResponseTrendsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

