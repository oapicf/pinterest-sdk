
# TopPinsAnalyticsResponse


## Properties

Name | Type
------------ | -------------
`dateAvailability` | [TopPinsAnalyticsResponseDateAvailability](TopPinsAnalyticsResponseDateAvailability.md)
`pins` | [Array&lt;TopPinsAnalyticsResponsePinsInner&gt;](TopPinsAnalyticsResponsePinsInner.md)
`sortBy` | string

## Example

```typescript
import type { TopPinsAnalyticsResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "dateAvailability": null,
  "pins": null,
  "sortBy": IMPRESSION,
} satisfies TopPinsAnalyticsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TopPinsAnalyticsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


