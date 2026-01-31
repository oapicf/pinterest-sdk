
# IntegrationMetadata

Integration metadata

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
`partnerAccessTokenExpiry` | number
`partnerRefreshTokenExpiry` | number
`scopes` | string
`createdTimestamp` | number
`updatedTimestamp` | number
`additionalId1` | string
`partnerMetadata` | string

## Example

```typescript
import type { IntegrationMetadata } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "externalBusinessId": null,
  "connectedMerchantId": null,
  "connectedUserId": null,
  "connectedAdvertiserId": null,
  "connectedLbaId": null,
  "connectedTagId": null,
  "partnerAccessTokenExpiry": null,
  "partnerRefreshTokenExpiry": null,
  "scopes": null,
  "createdTimestamp": null,
  "updatedTimestamp": null,
  "additionalId1": null,
  "partnerMetadata": null,
} satisfies IntegrationMetadata

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as IntegrationMetadata
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


