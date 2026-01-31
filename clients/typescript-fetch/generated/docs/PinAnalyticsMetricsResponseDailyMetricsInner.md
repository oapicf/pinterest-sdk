
# PinAnalyticsMetricsResponseDailyMetricsInner


## Properties

Name | Type
------------ | -------------
`dataStatus` | [DataStatus](DataStatus.md)
`date` | string
`metrics` | { [key: string]: number; }

## Example

```typescript
import type { PinAnalyticsMetricsResponseDailyMetricsInner } from ''

// TODO: Update the object below with actual values
const example = {
  "dataStatus": null,
  "date": 2019-12-01,
  "metrics": {"IMPRESSION":240,"OUTBOUND_CLICK":20,"PIN_CLICK":37,"QUARTILE_95_PERCENT_VIEW":8,"SAVE":20,"SAVE_RATE":0.18,"VIDEO_10S_VIEW":2,"VIDEO_AVG_WATCH_TIME":2507.75,"VIDEO_MRC_VIEW":20,"VIDEO_START":29,"VIDEO_V50_WATCH_TIME":10031},
} satisfies PinAnalyticsMetricsResponseDailyMetricsInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PinAnalyticsMetricsResponseDailyMetricsInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


