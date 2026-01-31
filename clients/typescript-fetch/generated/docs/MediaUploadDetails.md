
# MediaUploadDetails

Media upload details

## Properties

Name | Type
------------ | -------------
`mediaId` | string
`mediaType` | [MediaUploadType](MediaUploadType.md)
`status` | [MediaUploadStatus](MediaUploadStatus.md)

## Example

```typescript
import type { MediaUploadDetails } from ''

// TODO: Update the object below with actual values
const example = {
  "mediaId": null,
  "mediaType": null,
  "status": null,
} satisfies MediaUploadDetails

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MediaUploadDetails
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


