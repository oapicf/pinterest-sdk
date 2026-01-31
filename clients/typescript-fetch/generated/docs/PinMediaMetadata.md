
# PinMediaMetadata


## Properties

Name | Type
------------ | -------------
`itemType` | string
`title` | string
`description` | string
`link` | string
`images` | [ImageMetadataImages](ImageMetadataImages.md)
`coverImageUrl` | string
`videoUrl` | string
`duration` | number
`height` | number
`width` | number

## Example

```typescript
import type { PinMediaMetadata } from ''

// TODO: Update the object below with actual values
const example = {
  "itemType": null,
  "title": null,
  "description": null,
  "link": null,
  "images": null,
  "coverImageUrl": null,
  "videoUrl": null,
  "duration": null,
  "height": null,
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


