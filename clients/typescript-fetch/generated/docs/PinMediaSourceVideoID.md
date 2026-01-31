
# PinMediaSourceVideoID

Video ID-based media source

## Properties

Name | Type
------------ | -------------
`sourceType` | string
`coverImageUrl` | string
`coverImageContentType` | string
`coverImageData` | string
`mediaId` | string
`isStandard` | boolean

## Example

```typescript
import type { PinMediaSourceVideoID } from ''

// TODO: Update the object below with actual values
const example = {
  "sourceType": null,
  "coverImageUrl": null,
  "coverImageContentType": null,
  "coverImageData": null,
  "mediaId": null,
  "isStandard": null,
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


