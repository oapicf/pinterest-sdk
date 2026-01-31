
# PinMediaSourceVideoID

Video ID-based media source.

## Properties

Name | Type
------------ | -------------
`coverImageContentType` | [ContentType](ContentType.md)
`coverImageData` | string
`coverImageKeyFrameTime` | number
`coverImageUrl` | string
`isStandard` | boolean
`mediaId` | string
`sourceType` | string

## Example

```typescript
import type { PinMediaSourceVideoID } from ''

// TODO: Update the object below with actual values
const example = {
  "coverImageContentType": null,
  "coverImageData": null,
  "coverImageKeyFrameTime": null,
  "coverImageUrl": null,
  "isStandard": null,
  "mediaId": null,
  "sourceType": null,
} satisfies PinMediaSourceVideoID

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PinMediaSourceVideoID
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


