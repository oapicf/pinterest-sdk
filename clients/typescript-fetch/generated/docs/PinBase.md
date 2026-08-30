
# PinBase


## Properties

Name | Type
------------ | -------------
`aiDisclosures` | [AiDisclosures](AiDisclosures.md)
`boardId` | string
`boardOwner` | [BoardOwner](BoardOwner.md)
`boardSectionId` | string
`createdAt` | Date
`creativeType` | [CreativeType](CreativeType.md)
`dominantColor` | string
`hasBeenPromoted` | boolean
`id` | string
`isOwner` | boolean
`isProduct` | boolean
`isStandard` | boolean
`media` | [PinMedia](PinMedia.md)
`parentPinId` | string
`pinMetrics` | object

## Example

```typescript
import type { PinBase } from ''

// TODO: Update the object below with actual values
const example = {
  "aiDisclosures": null,
  "boardId": null,
  "boardOwner": null,
  "boardSectionId": null,
  "createdAt": null,
  "creativeType": null,
  "dominantColor": null,
  "hasBeenPromoted": null,
  "id": null,
  "isOwner": null,
  "isProduct": null,
  "isStandard": null,
  "media": null,
  "parentPinId": null,
  "pinMetrics": {"90d":{"pin_click":7,"impression":2,"clickthrough":3},"lifetime_metrics":{"pin_click":7,"impression":2,"clickthrough":3,"reaction":10,"comment":2}},
} satisfies PinBase

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PinBase
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


