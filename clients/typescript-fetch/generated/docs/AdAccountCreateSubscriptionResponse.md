
# AdAccountCreateSubscriptionResponse


## Properties

Name | Type
------------ | -------------
`id` | string
`cryptographicKey` | string
`cryptographicAlgorithm` | string
`createdTime` | number

## Example

```typescript
import type { AdAccountCreateSubscriptionResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 8078432025948590686,
  "cryptographicKey": ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54,
  "cryptographicAlgorithm": AES-256-GCM,
  "createdTime": 1699209842000,
} satisfies AdAccountCreateSubscriptionResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdAccountCreateSubscriptionResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


