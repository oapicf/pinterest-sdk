
# SummaryPin

Summarized pin information

## Properties

Name | Type
------------ | -------------
`altText` | string
`description` | string
`id` | string
`link` | string
`media` | [PinMedia](PinMedia.md)
`title` | string

## Example

```typescript
import type { SummaryPin } from ''

// TODO: Update the object below with actual values
const example = {
  "altText": null,
  "description": null,
  "id": null,
  "link": null,
  "media": null,
  "title": null,
} satisfies SummaryPin

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SummaryPin
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


