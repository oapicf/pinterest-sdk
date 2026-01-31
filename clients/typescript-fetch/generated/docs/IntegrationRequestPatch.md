
# IntegrationRequestPatch

Schema used for updating the integration metadata.

## Properties

Name | Type
------------ | -------------
`connectedMerchantId` | string
`connectedAdvertiserId` | string
`connectedLbaId` | string
`connectedTagId` | string
`partnerAccessToken` | string
`partnerRefreshToken` | string
`partnerPrimaryEmail` | string
`partnerAccessTokenExpiry` | number
`partnerRefreshTokenExpiry` | number
`scopes` | string
`additionalId1` | string
`partnerMetadata` | string

## Example

```typescript
import type { IntegrationRequestPatch } from ''

// TODO: Update the object below with actual values
const example = {
  "connectedMerchantId": null,
  "connectedAdvertiserId": null,
  "connectedLbaId": null,
  "connectedTagId": null,
  "partnerAccessToken": null,
  "partnerRefreshToken": null,
  "partnerPrimaryEmail": null,
  "partnerAccessTokenExpiry": null,
  "partnerRefreshTokenExpiry": null,
  "scopes": null,
  "additionalId1": null,
  "partnerMetadata": null,
} satisfies IntegrationRequestPatch

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as IntegrationRequestPatch
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


