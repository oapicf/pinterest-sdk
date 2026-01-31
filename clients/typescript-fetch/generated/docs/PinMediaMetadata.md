
# PinMediaMetadata


## Properties

Name | Type
------------ | -------------
`description` | string
`images` | [ImageSize](ImageSize.md)
`itemType` | string
`link` | string
`title` | string
`coverImageUrl` | string
`duration` | number
`height` | number
`videoUrl` | string
`width` | number

## Example

```typescript
import type { PinMediaMetadata } from ''

// TODO: Update the object below with actual values
const example = {
  "description": null,
  "images": null,
  "itemType": null,
  "link": null,
  "title": null,
  "coverImageUrl": null,
  "duration": null,
  "height": null,
  "videoUrl": null,
  "width": null,
} satisfies PinMediaMetadata

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PinMediaMetadata
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


