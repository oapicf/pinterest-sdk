
# PinCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`aiDisclosures` | [AiDisclosures](AiDisclosures.md)
`altText` | string
`boardId` | string
`boardSectionId` | string
`description` | string
`dominantColor` | string
`link` | string
`mediaSource` | [PinMediaSource](PinMediaSource.md)
`parentPinId` | string
`sponsorId` | string
`title` | string

## Example

```typescript
import type { PinCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "aiDisclosures": null,
  "altText": null,
  "boardId": null,
  "boardSectionId": null,
  "description": null,
  "dominantColor": null,
  "link": null,
  "mediaSource": null,
  "parentPinId": null,
  "sponsorId": null,
  "title": null,
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


