
# Table `TrendingKeyword`
(mapped from: TrendingKeyword)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**demographics** | demographics | long |  | [**TrendingKeywordDemographics**](TrendingKeywordDemographics.md) |  |  [optional] [foreignkey]
**hasPrediction** | has_prediction | boolean |  | **kotlin.Boolean** | Indicates whether the keyword has a prediction available for the next 90 days.&lt;br /&gt; This field is only applicable when &#x60;include_prediction&#x60; query parameter is set to &#x60;true&#x60;. &lt;br /&gt; By default, the value is &#x60;false&#x60; and no prediction data is included in the response. |  [optional]
**keyword** | keyword | text |  | **kotlin.String** | The keyword that is trending. |  [optional]
**pctGrowthMom** | pct_growth_mom | int |  | **kotlin.Int** | The month-over-month percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth. |  [optional]
**pctGrowthWow** | pct_growth_wow | int |  | **kotlin.Int** | The week-over-week percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth. |  [optional]
**pctGrowthYoy** | pct_growth_yoy | int |  | **kotlin.Int** | The year-over-year percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth. |  [optional]
**predictedTimeSeries** | predicted_time_series | long |  | [**PredictedTimeSeries**](PredictedTimeSeries.md) |  |  [optional] [foreignkey]
**timeSeries** | time_series | long |  | [**TimeSeries**](TimeSeries.md) |  |  [optional] [foreignkey]










