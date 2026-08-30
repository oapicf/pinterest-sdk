
# ConversionEvents

Conversion events.

## Properties

Name | Type
------------ | -------------
`events` | [Array&lt;ConversionApiResponseEventsItems&gt;](ConversionApiResponseEventsItems.md)
`numEventsProcessed` | number
`numEventsReceived` | number

## Example

```typescript
import type { ConversionEvents } from ''

// TODO: Update the object below with actual values
const example = {
  "events": null,
  "numEventsProcessed": 1,
  "numEventsReceived": 1,
} satisfies ConversionEvents

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionEvents
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


