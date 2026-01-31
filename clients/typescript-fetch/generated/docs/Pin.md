
# Pin

Pin

## Properties

Name | Type
------------ | -------------
`id` | string
`createdAt` | Date
`link` | string
`title` | string
`description` | string
`dominantColor` | string
`altText` | string
`creativeType` | [CreativeType](CreativeType.md)
`boardId` | string
`boardSectionId` | string
`boardOwner` | [BoardOwner](BoardOwner.md)
`isOwner` | boolean
`media` | [PinMedia](PinMedia.md)
`mediaSource` | [PinMediaSource](PinMediaSource.md)
`parentPinId` | string
`isStandard` | boolean
`hasBeenPromoted` | boolean
`note` | string
`pinMetrics` | object

## Example

```typescript
import type { Pin } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 813744226420795884,
  "createdAt": 2020-01-01T20:10:40Z,
  "link": https://www.pinterest.com/,
  "title": null,
  "description": null,
  "dominantColor": #6E7874,
  "altText": null,
  "creativeType": null,
  "boardId": null,
  "boardSectionId": null,
  "boardOwner": null,
  "isOwner": null,
  "media": null,
  "mediaSource": null,
  "parentPinId": null,
  "isStandard": null,
  "hasBeenPromoted": null,
  "note": null,
  "pinMetrics": {"90d":{"pin_click":7,"impression":2,"clickthrough":3},"lifetime_metrics":{"pin_click":7,"impression":2,"clickthrough":3,"reaction":10,"comment":2}},
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


