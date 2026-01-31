
# BoardWithUpdatePrivacyUpdate

Resource create or update operation model.

## Properties

Name | Type
------------ | -------------
`description` | string
`name` | string
`privacy` | [BoardUpdatePrivacy](BoardUpdatePrivacy.md)

## Example

```typescript
import type { BoardWithUpdatePrivacyUpdate } from ''

// TODO: Update the object below with actual values
const example = {
  "description": My favorite summer recipes,
  "name": Summer recipes,
  "privacy": null,
} satisfies BoardWithUpdatePrivacyUpdate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BoardWithUpdatePrivacyUpdate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


