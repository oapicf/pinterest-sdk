
# PinCreate

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
`boardId` | string
`boardSectionId` | string
`boardOwner` | [BoardOwner](BoardOwner.md)
`media` | [PinMedia](PinMedia.md)
`mediaSource` | [PinMediaSource](PinMediaSource.md)
`parentPinId` | string
`note` | string

## Example

```typescript
import type { PinCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 813744226420795884,
  "createdAt": 2020-01-01T20:10:40Z,
  "link": https://www.pinterest.com/,
  "title": null,
  "description": null,
  "dominantColor": #6E7874,
  "altText": null,
  "boardId": null,
  "boardSectionId": null,
  "boardOwner": null,
  "media": null,
  "mediaSource": null,
  "parentPinId": null,
  "note": null,
} satisfies PinCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PinCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


