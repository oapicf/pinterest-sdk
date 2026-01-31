
# Pin

Pin model containing properties related to a Pinterest Pin.

## Properties

Name | Type
------------ | -------------
`altText` | string
`boardId` | string
`boardOwner` | [BoardOwner](BoardOwner.md)
`boardSectionId` | string
`createdAt` | Date
`creativeType` | [CreativeType](CreativeType.md)
`description` | string
`dominantColor` | string
`hasBeenPromoted` | boolean
`id` | string
`isOwner` | boolean
`isStandard` | boolean
`link` | string
`media` | [PinMedia](PinMedia.md)
`parentPinId` | string
`pinMetrics` | object
`title` | string

## Example

```typescript
import type { Pin } from ''

// TODO: Update the object below with actual values
const example = {
  "altText": null,
  "boardId": null,
  "boardOwner": null,
  "boardSectionId": null,
  "createdAt": null,
  "creativeType": null,
  "description": null,
  "dominantColor": null,
  "hasBeenPromoted": null,
  "id": null,
  "isOwner": null,
  "isStandard": null,
  "link": null,
  "media": null,
  "parentPinId": null,
  "pinMetrics": {"90d":{"pin_click":7,"impression":2,"clickthrough":3},"lifetime_metrics":{"pin_click":7,"impression":2,"clickthrough":3,"reaction":10,"comment":2}},
  "title": null,
} satisfies Pin

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Pin
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


