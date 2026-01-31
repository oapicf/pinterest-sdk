
# AdAccountCreateSubscriptionResponse


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`apiVersion` | string
`createdTime` | number
`cryptographicAlgorithm` | string
`cryptographicKey` | string
`id` | string
`leadFormId` | string
`userAccountId` | string
`webhookUrl` | string

## Example

```typescript
import type { AdAccountCreateSubscriptionResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": 549755885176,
  "apiVersion": v5,
  "createdTime": 1699209842000,
  "cryptographicAlgorithm": AES-256-GCM,
  "cryptographicKey": ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54,
  "id": 8078432025948590686,
  "leadFormId": 383791336903426390,
  "userAccountId": 549755885175,
  "webhookUrl": https://webhook.example.com/xyz,
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


