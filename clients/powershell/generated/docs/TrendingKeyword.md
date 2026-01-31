# TrendingKeyword
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Demographics** | [**TrendingKeywordDemographics**](TrendingKeywordDemographics.md) |  | [optional] 
**HasPrediction** | **Boolean** | Indicates whether the keyword has a prediction available for the next 90 days.&lt;br /&gt; This field is only applicable when &#x60;include_prediction&#x60; query parameter is set to &#x60;true&#x60;. &lt;br /&gt; By default, the value is &#x60;false&#x60; and no prediction data is included in the response. | [optional] 
**Keyword** | **String** | The keyword that is trending. | [optional] 
**PctGrowthMom** | **Int32** | The month-over-month percent change in search volume for this keyword.&lt;br /&gt; For example, a value of &quot;&quot;400&quot;&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth. | [optional] 
**PctGrowthWow** | **Int32** | The week-over-week percent change in search volume for this keyword.&lt;br /&gt; For example, a value of &quot;&quot;50&quot;&quot; would represent a 50% increase in searches in the last seven days compared to the week prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth. | [optional] 
**PctGrowthYoy** | **Int32** | The year-over-year percent change in search volume for this keyword.&lt;br /&gt; For example, a value of &quot;&quot;-5&quot;&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth. | [optional] 
**PredictedTimeSeries** | [**PredictedTimeSeries**](PredictedTimeSeries.md) |  | [optional] 
**TimeSeries** | [**TimeSeries**](TimeSeries.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TrendingKeyword = Initialize-PSOpenAPIToolsTrendingKeyword  -Demographics null `
 -HasPrediction false `
 -Keyword couples halloween costumes `
 -PctGrowthMom 400 `
 -PctGrowthWow 50 `
 -PctGrowthYoy -5 `
 -PredictedTimeSeries null `
 -TimeSeries null
```

- Convert the resource to JSON
```powershell
$TrendingKeyword | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

