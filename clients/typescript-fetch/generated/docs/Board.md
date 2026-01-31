
# Board

Board

## Properties

Name | Type
------------ | -------------
`id` | string
`createdAt` | Date
`boardPinsModifiedAt` | Date
`name` | string
`description` | string
`collaboratorCount` | number
`pinCount` | number
`followerCount` | number
`media` | [BoardMedia](BoardMedia.md)
`owner` | [BoardOwner](BoardOwner.md)
`privacy` | string

## Example

```typescript
import type { Board } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 549755885175,
  "createdAt": 2020-01-01T20:10:40Z,
  "boardPinsModifiedAt": 2020-01-01T20:10:40Z,
  "name": Summer Recipes,
  "description": My favorite summer recipes,
  "collaboratorCount": 17,
  "pinCount": 5,
  "followerCount": 13,
  "media": null,
  "owner": null,
  "privacy": null,
} satisfies Board

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Board
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


