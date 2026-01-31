
# BoardCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`description` | string
`isAdsOnly` | boolean
`name` | string
`privacy` | [BoardPrivacy](BoardPrivacy.md)

## Example

```typescript
import type { BoardCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "description": My favorite summer recipes,
  "isAdsOnly": true,
  "name": Summer recipes,
  "privacy": null,
} satisfies BoardCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BoardCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


