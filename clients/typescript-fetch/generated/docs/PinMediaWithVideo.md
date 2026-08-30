
# PinMediaWithVideo

Pin with video.

## Properties

Name | Type
------------ | -------------
`coverImageUrl` | string
`duration` | number
`height` | number
`images` | [ImageSize](ImageSize.md)
`mediaType` | string
`videoUrl` | string
`videoUrlHls` | string
`width` | number

## Example

```typescript
import type { PinMediaWithVideo } from ''

// TODO: Update the object below with actual values
const example = {
  "coverImageUrl": null,
  "duration": null,
  "height": null,
  "images": null,
  "mediaType": null,
  "videoUrl": null,
  "videoUrlHls": null,
  "width": null,
} satisfies PinMediaWithVideo

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PinMediaWithVideo
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


