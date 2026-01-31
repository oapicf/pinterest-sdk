
# AdsCreditRedeemRequest


## Properties

Name | Type
------------ | -------------
`offerCodeHash` | string
`validateOnly` | boolean

## Example

```typescript
import type { AdsCreditRedeemRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "offerCodeHash": 138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67,
  "validateOnly": true,
} satisfies AdsCreditRedeemRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdsCreditRedeemRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


