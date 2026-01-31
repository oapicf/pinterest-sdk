
# TrendingKeywordsResponseTrendsInnerTimeSeries

A sequence of weekly observations of the relative search volume for this keyword over the past year.<br /> These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.<br /> **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.

## Properties

Name | Type
------------ | -------------
`date` | Date

## Example

```typescript
import type { TrendingKeywordsResponseTrendsInnerTimeSeries } from ''

// TODO: Update the object below with actual values
const example = {
  "date": null,
} satisfies TrendingKeywordsResponseTrendsInnerTimeSeries

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TrendingKeywordsResponseTrendsInnerTimeSeries
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


