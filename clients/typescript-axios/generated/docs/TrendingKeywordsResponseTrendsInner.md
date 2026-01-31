# TrendingKeywordsResponseTrendsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyword** | **string** | The keyword that is trending. | [optional] [default to undefined]
**pct_growth_wow** | **number** | The week-over-week percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth. | [optional] [default to undefined]
**pct_growth_mom** | **number** | The month-over-month percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth. | [optional] [default to undefined]
**pct_growth_yoy** | **number** | The year-over-year percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth. | [optional] [default to undefined]
**time_series** | [**TrendingKeywordsResponseTrendsInnerTimeSeries**](TrendingKeywordsResponseTrendsInnerTimeSeries.md) |  | [optional] [default to undefined]

## Example

```typescript
import { TrendingKeywordsResponseTrendsInner } from './api';

const instance: TrendingKeywordsResponseTrendsInner = {
    keyword,
    pct_growth_wow,
    pct_growth_mom,
    pct_growth_yoy,
    time_series,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
