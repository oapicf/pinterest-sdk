
# PinAnalyticsMetricsResponse


## Properties

Name | Type
------------ | -------------
`lifetimeMetrics` | { [key: string]: number; }
`dailyMetrics` | [Array&lt;PinAnalyticsMetricsResponseDailyMetricsInner&gt;](PinAnalyticsMetricsResponseDailyMetricsInner.md)
`summaryMetrics` | { [key: string]: number; }

## Example

```typescript
import type { PinAnalyticsMetricsResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "lifetimeMetrics": {"TOTAL_COMMENTS":10,"TOTAL_REACTIONS":12},
  "dailyMetrics": null,
  "summaryMetrics": {"IMPRESSION":240,"OUTBOUND_CLICK":20,"PIN_CLICK":37,"QUARTILE_95_PERCENT_VIEW":8,"SAVE":20,"SAVE_RATE":0.18,"VIDEO_10S_VIEW":2,"VIDEO_AVG_WATCH_TIME":2507.75,"VIDEO_MRC_VIEW":20,"VIDEO_START":29,"VIDEO_V50_WATCH_TIME":10031},
} satisfies PinAnalyticsMetricsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PinAnalyticsMetricsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


