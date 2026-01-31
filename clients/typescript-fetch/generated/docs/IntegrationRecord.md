
# IntegrationRecord

Integration record

## Properties

Name | Type
------------ | -------------
`additionalId1` | string
`connectedAdvertiserId` | string
`connectedLbaId` | string
`connectedMerchantId` | string
`connectedTagId` | string
`connectedUserId` | string
`createdTime` | number
`externalBusinessId` | string
`id` | string
`partnerAccessToken` | string
`partnerAccessTokenExpiry` | number
`partnerMetadata` | string
`partnerPrimaryEmail` | string
`partnerRefreshToken` | string
`partnerRefreshTokenExpiry` | number
`scopes` | string
`updatedTime` | number

## Example

```typescript
import type { IntegrationRecord } from ''

// TODO: Update the object below with actual values
const example = {
  "additionalId1": null,
  "connectedAdvertiserId": null,
  "connectedLbaId": null,
  "connectedMerchantId": null,
  "connectedTagId": null,
  "connectedUserId": null,
  "createdTime": null,
  "externalBusinessId": null,
  "id": null,
  "partnerAccessToken": null,
  "partnerAccessTokenExpiry": null,
  "partnerMetadata": null,
  "partnerPrimaryEmail": null,
  "partnerRefreshToken": null,
  "partnerRefreshTokenExpiry": null,
  "scopes": null,
  "updatedTime": null,
} satisfies IntegrationRecord

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as IntegrationRecord
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


