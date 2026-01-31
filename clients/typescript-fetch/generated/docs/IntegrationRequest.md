
# IntegrationRequest

Schema used for creating the integration metadata.

## Properties

Name | Type
------------ | -------------
`additionalId1` | string
`connectedAdvertiserId` | string
`connectedLbaId` | string
`connectedMerchantId` | string
`connectedTagId` | string
`externalBusinessId` | string
`partnerAccessToken` | string
`partnerAccessTokenExpiry` | number
`partnerMetadata` | string
`partnerPrimaryEmail` | string
`partnerRefreshToken` | string
`partnerRefreshTokenExpiry` | number
`scopes` | string

## Example

```typescript
import type { IntegrationRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "additionalId1": null,
  "connectedAdvertiserId": null,
  "connectedLbaId": null,
  "connectedMerchantId": null,
  "connectedTagId": null,
  "externalBusinessId": null,
  "partnerAccessToken": null,
  "partnerAccessTokenExpiry": null,
  "partnerMetadata": null,
  "partnerPrimaryEmail": null,
  "partnerRefreshToken": null,
  "partnerRefreshTokenExpiry": null,
  "scopes": null,
} satisfies IntegrationRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as IntegrationRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


