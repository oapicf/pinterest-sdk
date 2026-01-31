
# TopVideoPinsAnalyticsResponsePinsInner

Array with metrics, status, and pin id for the requested metric

## Properties

Name | Type
------------ | -------------
`dataStatus` | [{ [key: string]: DataStatus; }](DataStatus.md)
`metrics` | { [key: string]: number; }
`pinId` | string

## Example

```typescript
import type { TopVideoPinsAnalyticsResponsePinsInner } from ''

// TODO: Update the object below with actual values
const example = {
  "dataStatus": null,
  "metrics": {"IMPRESSION":7,"QUARTILE_95_PERCENT_VIEW":2,"SAVE":1,"VIDEO_10S_VIEW":5,"VIDEO_AVG_WATCH_TIME":86989,"VIDEO_MRC_VIEW":2,"VIDEO_START":2,"VIDEO_V50_WATCH_TIME":173979,"OUTBOUND_CLICK":2},
  "pinId": 642396334344813594,
} satisfies TopVideoPinsAnalyticsResponsePinsInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TopVideoPinsAnalyticsResponsePinsInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


