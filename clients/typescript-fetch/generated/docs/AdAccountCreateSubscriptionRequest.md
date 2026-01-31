
# AdAccountCreateSubscriptionRequest


## Properties

Name | Type
------------ | -------------
`webhookUrl` | string
`leadFormId` | string
`partnerAccessToken` | string
`partnerRefreshToken` | string
`partnerMetadata` | [AdAccountCreateSubscriptionRequestPartnerMetadata](AdAccountCreateSubscriptionRequestPartnerMetadata.md)

## Example

```typescript
import type { AdAccountCreateSubscriptionRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "webhookUrl": https://webhook.example.com/xyz,
  "leadFormId": 383791336903426390,
  "partnerAccessToken": null,
  "partnerRefreshToken": null,
  "partnerMetadata": null,
} satisfies AdAccountCreateSubscriptionRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdAccountCreateSubscriptionRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


