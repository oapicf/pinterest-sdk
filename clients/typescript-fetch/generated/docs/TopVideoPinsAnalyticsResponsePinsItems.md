
# TopVideoPinsAnalyticsResponsePinsItems

Array with metrics, status, and pin id for the requested metric

## Properties

Name | Type
------------ | -------------
`dataStatus` | [{ [key: string]: DataStatus; }](DataStatus.md)
`metrics` | { [key: string]: number; }
`pinId` | string

## Example

```typescript
import type { TopVideoPinsAnalyticsResponsePinsItems } from ''

// TODO: Update the object below with actual values
const example = {
  "dataStatus": null,
  "metrics": null,
  "pinId": null,
} satisfies TopVideoPinsAnalyticsResponsePinsItems

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TopVideoPinsAnalyticsResponsePinsItems
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


