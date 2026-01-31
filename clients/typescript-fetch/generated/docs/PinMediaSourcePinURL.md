
# PinMediaSourcePinURL

Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.

## Properties

Name | Type
------------ | -------------
`sourceType` | string
`isAffiliateLink` | boolean

## Example

```typescript
import type { PinMediaSourcePinURL } from ''

// TODO: Update the object below with actual values
const example = {
  "sourceType": null,
  "isAffiliateLink": null,
} satisfies PinMediaSourcePinURL

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PinMediaSourcePinURL
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


