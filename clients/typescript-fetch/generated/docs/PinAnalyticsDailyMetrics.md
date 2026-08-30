
# PinAnalyticsDailyMetrics


## Properties

Name | Type
------------ | -------------
`dataStatus` | [DataStatus](DataStatus.md)
`date` | string
`metrics` | { [key: string]: number; }

## Example

```typescript
import type { PinAnalyticsDailyMetrics } from ''

// TODO: Update the object below with actual values
const example = {
  "dataStatus": null,
  "date": null,
  "metrics": null,
} satisfies PinAnalyticsDailyMetrics

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PinAnalyticsDailyMetrics
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


