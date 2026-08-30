
# AdvertiserDefinedEventsCreateRequest

Request body for creating or updating advertiser defined events

## Properties

Name | Type
------------ | -------------
`items` | [Array&lt;AdvertiserDefinedEventInput&gt;](AdvertiserDefinedEventInput.md)

## Example

```typescript
import type { AdvertiserDefinedEventsCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "items": null,
} satisfies AdvertiserDefinedEventsCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdvertiserDefinedEventsCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


