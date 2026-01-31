# TrendingTopic

Individual trending topic within an interest category

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **string** | Description of the trending topic | [default to undefined]
**percent_growth_mom** | **number** | Month-over-month growth percentage | [default to undefined]
**pins** | [**Array&lt;TrendingPin&gt;**](TrendingPin.md) | Array of pin images related to this trend (up to 6) | [default to undefined]
**related_interests** | **Array&lt;string&gt;** | List of related interest categories | [default to undefined]
**related_searches** | **Array&lt;string&gt;** | List of related search terms | [default to undefined]
**time_series** | **{ [key: string]: number; }** | Time series data showing trend values over time, with dates as keys and values as numeric | [default to undefined]
**title** | **string** | Title of the trending topic | [default to undefined]

## Example

```typescript
import { TrendingTopic } from './api';

const instance: TrendingTopic = {
    description,
    percent_growth_mom,
    pins,
    related_interests,
    related_searches,
    time_series,
    title,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
