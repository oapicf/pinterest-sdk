
# LeadSubscriptionPostParamsCreate


## Properties

Name | Type
------------ | -------------
`leadFormId` | string
`webhookUrl` | string
`partnerAccessToken` | string
`partnerMetadata` | [PartnerMetadata](PartnerMetadata.md)
`partnerRefreshToken` | string

## Example

```typescript
import type { LeadSubscriptionPostParamsCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "leadFormId": null,
  "webhookUrl": null,
  "partnerAccessToken": null,
  "partnerMetadata": null,
  "partnerRefreshToken": null,
} satisfies LeadSubscriptionPostParamsCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LeadSubscriptionPostParamsCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


