
# IntegrationMetadata

Integration metadata

## Properties

Name | Type
------------ | -------------
`additionalId1` | string
`connectedAdvertiserId` | string
`connectedLbaId` | string
`connectedMerchantId` | string
`connectedTagId` | string
`connectedUserId` | string
`createdTimestamp` | number
`externalBusinessId` | string
`id` | string
`partnerAccessTokenExpiry` | number
`partnerMetadata` | string
`partnerRefreshTokenExpiry` | number
`scopes` | string
`updatedTimestamp` | number

## Example

```typescript
import type { IntegrationMetadata } from ''

// TODO: Update the object below with actual values
const example = {
  "additionalId1": null,
  "connectedAdvertiserId": null,
  "connectedLbaId": null,
  "connectedMerchantId": null,
  "connectedTagId": null,
  "connectedUserId": null,
  "createdTimestamp": null,
  "externalBusinessId": null,
  "id": null,
  "partnerAccessTokenExpiry": null,
  "partnerMetadata": null,
  "partnerRefreshTokenExpiry": null,
  "scopes": null,
  "updatedTimestamp": null,
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


