
# AdAccountGetSubscriptionResponse


## Properties

Name | Type
------------ | -------------
`leadFormId` | string
`webhookUrl` | string
`id` | string
`userAccountId` | string
`adAccountId` | string
`apiVersion` | string
`cryptographicKey` | string
`cryptographicAlgorithm` | string
`createdTime` | number

## Example

```typescript
import type { AdAccountGetSubscriptionResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "leadFormId": 383791336903426390,
  "webhookUrl": https://webhook.example.com/xyz,
  "id": 8078432025948590686,
  "userAccountId": 549755885175,
  "adAccountId": 549755885176,
  "apiVersion": v5,
  "cryptographicKey": ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54,
  "cryptographicAlgorithm": AES-256-GCM,
  "createdTime": 1699209842000,
} satisfies AdAccountGetSubscriptionResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdAccountGetSubscriptionResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


