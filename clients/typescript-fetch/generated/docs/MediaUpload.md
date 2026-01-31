
# MediaUpload

Media upload that has been registered but not uploaded/processed yet.

## Properties

Name | Type
------------ | -------------
`mediaId` | string
`mediaType` | [MediaUploadType](MediaUploadType.md)
`uploadUrl` | string
`uploadParameters` | [MediaUploadAllOfUploadParameters](MediaUploadAllOfUploadParameters.md)

## Example

```typescript
import type { MediaUpload } from ''

// TODO: Update the object below with actual values
const example = {
  "mediaId": null,
  "mediaType": null,
  "uploadUrl": https://pinterest-media-upload.s3-accelerate.amazonaws.com/,
  "uploadParameters": null,
} satisfies MediaUpload

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MediaUpload
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


