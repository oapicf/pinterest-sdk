
# MediaUploadAllOfUploadParameters

The list of parameter key/value pairs you will need to send with your POST request to upload your media file.

## Properties

Name | Type
------------ | -------------
`xAmzDate` | string
`xAmzSignature` | string
`xAmzSecurityToken` | string
`xAmzAlgorithm` | string
`key` | string
`policy` | string
`xAmzCredential` | string
`contentType` | string

## Example

```typescript
import type { MediaUploadAllOfUploadParameters } from ''

// TODO: Update the object below with actual values
const example = {
  "xAmzDate": null,
  "xAmzSignature": null,
  "xAmzSecurityToken": null,
  "xAmzAlgorithm": null,
  "key": null,
  "policy": null,
  "xAmzCredential": null,
  "contentType": multipart/form-data,
} satisfies MediaUploadAllOfUploadParameters

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MediaUploadAllOfUploadParameters
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


