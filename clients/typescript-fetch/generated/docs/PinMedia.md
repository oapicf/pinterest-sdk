
# PinMedia

Pin media that can be an image, video, or a mix of both.

## Properties

Name | Type
------------ | -------------
`images` | [ImageSize](ImageSize.md)
`mediaType` | string
`coverImageUrl` | string
`duration` | number
`height` | number
`videoUrl` | string
`videoUrlHls` | string
`width` | number
`items` | [Array&lt;PinMediaMetadata&gt;](PinMediaMetadata.md)

## Example

```typescript
import type { PinMedia } from ''

// TODO: Update the object below with actual values
const example = {
  "images": null,
  "mediaType": null,
  "coverImageUrl": null,
  "duration": null,
  "height": null,
  "videoUrl": null,
  "videoUrlHls": null,
  "width": null,
  "items": null,
} satisfies PinMedia

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PinMedia
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


