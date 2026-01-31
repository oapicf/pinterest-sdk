
# S3MultipartUploadData


## Properties

Name | Type
------------ | -------------
`fileParts` | [Array&lt;S3FilePart&gt;](S3FilePart.md)

## Example

```typescript
import type { S3MultipartUploadData } from ''

// TODO: Update the object below with actual values
const example = {
  "fileParts": null,
} satisfies S3MultipartUploadData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as S3MultipartUploadData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


