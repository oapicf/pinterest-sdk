

# TrendingKeyword


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**demographics** | [**TrendingKeywordDemographics**](TrendingKeywordDemographics.md) |  |  [optional] |
|**hasPrediction** | **Boolean** | Indicates whether the keyword has a prediction available for the next 90 days.&lt;br /&gt; This field is only applicable when &#x60;include_prediction&#x60; query parameter is set to &#x60;true&#x60;. &lt;br /&gt; By default, the value is &#x60;false&#x60; and no prediction data is included in the response. |  [optional] |
|**keyword** | **String** | The keyword that is trending. |  [optional] |
|**pctGrowthMom** | **Integer** | The month-over-month percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth. |  [optional] |
|**pctGrowthWow** | **Integer** | The week-over-week percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth. |  [optional] |
|**pctGrowthYoy** | **Integer** | The year-over-year percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth. |  [optional] |
|**predictedTimeSeries** | **PredictedTimeSeries** |  |  [optional] |
|**timeSeries** | **TimeSeries** |  |  [optional] |



