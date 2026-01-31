
# TrendingKeyword


## Properties

Name | Type
------------ | -------------
`demographics` | [TrendingKeywordDemographics](TrendingKeywordDemographics.md)
`hasPrediction` | boolean
`keyword` | string
`pctGrowthMom` | number
`pctGrowthWow` | number
`pctGrowthYoy` | number
`predictedTimeSeries` | [PredictedTimeSeries](PredictedTimeSeries.md)
`timeSeries` | [TimeSeries](TimeSeries.md)

## Example

```typescript
import type { TrendingKeyword } from ''

// TODO: Update the object below with actual values
const example = {
  "demographics": null,
  "hasPrediction": false,
  "keyword": couples halloween costumes,
  "pctGrowthMom": 400,
  "pctGrowthWow": 50,
  "pctGrowthYoy": -5,
  "predictedTimeSeries": null,
  "timeSeries": null,
} satisfies TrendingKeyword

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TrendingKeyword
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


