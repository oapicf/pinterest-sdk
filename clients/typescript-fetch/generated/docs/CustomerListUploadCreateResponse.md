
# CustomerListUploadCreateResponse


## Properties

Name | Type
------------ | -------------
`customerListUpload` | [CustomerListUpload](CustomerListUpload.md)
`s3MultipartUploadData` | [S3MultipartUploadData](S3MultipartUploadData.md)

## Example

```typescript
import type { CustomerListUploadCreateResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "customerListUpload": null,
  "s3MultipartUploadData": null,
} satisfies CustomerListUploadCreateResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CustomerListUploadCreateResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


