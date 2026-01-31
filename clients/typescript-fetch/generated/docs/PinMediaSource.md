
# PinMediaSource

Pin media source that can be an image, video, or a mix of both passed in as a request.

## Properties

Name | Type
------------ | -------------
`contentType` | [ContentType](ContentType.md)
`data` | string
`isStandard` | boolean
`sourceType` | string
`url` | string
`coverImageContentType` | [ContentType](ContentType.md)
`coverImageData` | string
`coverImageKeyFrameTime` | number
`coverImageUrl` | string
`mediaId` | string
`index` | number
`items` | [Array&lt;PinMediaSourceImagesURLItem&gt;](PinMediaSourceImagesURLItem.md)
`isAffiliateLink` | boolean

## Example

```typescript
import type { PinMediaSource } from ''

// TODO: Update the object below with actual values
const example = {
  "contentType": null,
  "data": null,
  "isStandard": null,
  "sourceType": null,
  "url": null,
  "coverImageContentType": null,
  "coverImageData": null,
  "coverImageKeyFrameTime": null,
  "coverImageUrl": null,
  "mediaId": null,
  "index": null,
  "items": null,
  "isAffiliateLink": null,
} satisfies PinMediaSource

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PinMediaSource
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


