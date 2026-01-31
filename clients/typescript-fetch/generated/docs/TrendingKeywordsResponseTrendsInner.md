
# TrendingKeywordsResponseTrendsInner


## Properties

Name | Type
------------ | -------------
`keyword` | string
`pctGrowthWow` | number
`pctGrowthMom` | number
`pctGrowthYoy` | number
`timeSeries` | [TrendingKeywordsResponseTrendsInnerTimeSeries](TrendingKeywordsResponseTrendsInnerTimeSeries.md)

## Example

```typescript
import type { TrendingKeywordsResponseTrendsInner } from ''

// TODO: Update the object below with actual values
const example = {
  "keyword": couples halloween costumes,
  "pctGrowthWow": 50,
  "pctGrowthMom": 400,
  "pctGrowthYoy": -5,
  "timeSeries": null,
} satisfies TrendingKeywordsResponseTrendsInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TrendingKeywordsResponseTrendsInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


