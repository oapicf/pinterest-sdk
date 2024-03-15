# TrendingKeywordsResponseTrendsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyword** | Option<**String**> | The keyword that is trending. | [optional]
**pct_growth_wow** | Option<**i32**> | The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth. | [optional]
**pct_growth_mom** | Option<**i32**> | The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth. | [optional]
**pct_growth_yoy** | Option<**i32**> | The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth. | [optional]
**time_series** | Option<[**models::TrendingKeywordsResponseTrendsInnerTimeSeries**](TrendingKeywordsResponse_trends_inner_time_series.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


