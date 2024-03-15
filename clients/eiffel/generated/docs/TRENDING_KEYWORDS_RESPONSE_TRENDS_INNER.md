# TRENDING_KEYWORDS_RESPONSE_TRENDS_INNER

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyword** | [**STRING_32**](STRING_32.md) | The keyword that is trending. | [optional] [default to null]
**pct_growth_wow** | **INTEGER_32** | The week-over-week percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth. | [optional] [default to null]
**pct_growth_mom** | **INTEGER_32** | The month-over-month percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth. | [optional] [default to null]
**pct_growth_yoy** | **INTEGER_32** | The year-over-year percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth. | [optional] [default to null]
**time_series** | [**TRENDING_KEYWORDS_RESPONSE_TRENDS_INNER_TIME_SERIES**](TrendingKeywordsResponse_trends_inner_time_series.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


