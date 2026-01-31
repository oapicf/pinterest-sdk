
# BoardBase


## Properties

Name | Type
------------ | -------------
`boardPinsModifiedAt` | Date
`collaboratorCount` | number
`createdAt` | Date
`description` | string
`followerCount` | number
`id` | string
`isAdsOnly` | boolean
`media` | [BoardMedia](BoardMedia.md)
`name` | string
`owner` | [BoardOwner](BoardOwner.md)
`pinCount` | number

## Example

```typescript
import type { BoardBase } from ''

// TODO: Update the object below with actual values
const example = {
  "boardPinsModifiedAt": null,
  "collaboratorCount": 17,
  "createdAt": null,
  "description": My favorite summer recipes,
  "followerCount": 13,
  "id": 549755885175,
  "isAdsOnly": true,
  "media": null,
  "name": Summer recipes,
  "owner": null,
  "pinCount": 5,
} satisfies BoardBase

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BoardBase
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


