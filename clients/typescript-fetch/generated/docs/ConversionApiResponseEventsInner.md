
# ConversionApiResponseEventsInner


## Properties

Name | Type
------------ | -------------
`status` | string
`errorMessage` | string
`warningMessage` | string

## Example

```typescript
import type { ConversionApiResponseEventsInner } from ''

// TODO: Update the object below with actual values
const example = {
  "status": processed,
  "errorMessage": null,
  "warningMessage": null,
} satisfies ConversionApiResponseEventsInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionApiResponseEventsInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


