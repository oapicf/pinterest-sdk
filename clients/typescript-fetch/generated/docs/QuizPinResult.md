
# QuizPinResult

The result, and link out, based on the user’s choice.

## Properties

Name | Type
------------ | -------------
`organicPinId` | string
`androidDeepLink` | string
`iosDeepLink` | string
`destinationUrl` | string
`resultId` | number

## Example

```typescript
import type { QuizPinResult } from ''

// TODO: Update the object below with actual values
const example = {
  "organicPinId": null,
  "androidDeepLink": null,
  "iosDeepLink": null,
  "destinationUrl": null,
  "resultId": null,
} satisfies QuizPinResult

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as QuizPinResult
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


