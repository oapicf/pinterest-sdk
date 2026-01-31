
# IntegrationRecord

Integration record

## Properties

Name | Type
------------ | -------------
`id` | string
`externalBusinessId` | string
`connectedMerchantId` | string
`connectedUserId` | string
`connectedAdvertiserId` | string
`connectedLbaId` | string
`connectedTagId` | string
`partnerAccessToken` | string
`partnerRefreshToken` | string
`partnerPrimaryEmail` | string
`partnerAccessTokenExpiry` | number
`partnerRefreshTokenExpiry` | number
`scopes` | string
`partnerMetadata` | string
`additionalId1` | string
`createdTime` | number
`updatedTime` | number

## Example

```typescript
import type { IntegrationRecord } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "externalBusinessId": null,
  "connectedMerchantId": null,
  "connectedUserId": null,
  "connectedAdvertiserId": null,
  "connectedLbaId": null,
  "connectedTagId": null,
  "partnerAccessToken": null,
  "partnerRefreshToken": null,
  "partnerPrimaryEmail": null,
  "partnerAccessTokenExpiry": null,
  "partnerRefreshTokenExpiry": null,
  "scopes": null,
  "partnerMetadata": null,
  "additionalId1": null,
  "createdTime": null,
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


