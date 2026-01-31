
# PinUpdate

Pin fields for updates

## Properties

Name | Type
------------ | -------------
`altText` | string
`boardId` | string
`boardSectionId` | string
`description` | string
`link` | string
`title` | string
`carouselSlots` | [Array&lt;PinUpdateCarouselSlotsInner&gt;](PinUpdateCarouselSlotsInner.md)
`note` | string

## Example

```typescript
import type { PinUpdate } from ''

// TODO: Update the object below with actual values
const example = {
  "altText": null,
  "boardId": null,
  "boardSectionId": null,
  "description": null,
  "link": https://www.pinterest.com/,
  "title": null,
  "carouselSlots": null,
  "note": null,
} satisfies PinUpdate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PinUpdate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


