
# PinUpdate

Resource create or update operation model.

## Properties

Name | Type
------------ | -------------
`aiDisclosures` | [AiDisclosuresUpdate](AiDisclosuresUpdate.md)
`altText` | string
`boardId` | string
`boardSectionId` | string
`carouselSlots` | [Array&lt;CarouselSlot&gt;](CarouselSlot.md)
`description` | string
`link` | string
`title` | string

## Example

```typescript
import type { PinUpdate } from ''

// TODO: Update the object below with actual values
const example = {
  "aiDisclosures": null,
  "altText": null,
  "boardId": null,
  "boardSectionId": null,
  "carouselSlots": null,
  "description": null,
  "link": null,
  "title": null,
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


