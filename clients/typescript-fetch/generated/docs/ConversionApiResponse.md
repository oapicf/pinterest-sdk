
# ConversionApiResponse

Schema describing the object in the response, which contains information about the events that were received and processed.

## Properties

Name | Type
------------ | -------------
`numEventsReceived` | number
`numEventsProcessed` | number
`events` | [Array&lt;ConversionApiResponseEventsInner&gt;](ConversionApiResponseEventsInner.md)

## Example

```typescript
import type { ConversionApiResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "numEventsReceived": null,
  "numEventsProcessed": null,
  "events": null,
} satisfies ConversionApiResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionApiResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


