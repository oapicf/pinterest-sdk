
# MediaUploadParameters


## Properties

Name | Type
------------ | -------------
`contentType` | string
`key` | string
`policy` | string
`xAmzAlgorithm` | string
`xAmzCredential` | string
`xAmzDate` | string
`xAmzSecurityToken` | string
`xAmzSignature` | string

## Example

```typescript
import type { MediaUploadParameters } from ''

// TODO: Update the object below with actual values
const example = {
  "contentType": multipart/form-data,
  "key": uploads/11/aa/22/3:video:203014033110991560:5212123920968240771,
  "policy": eyJleHBpcmF0aW9uIjoiMj..==,
  "xAmzAlgorithm": AWS4-HMAC-SHA256,
  "xAmzCredential": ASIA6QZJ64OPIKV7FRVX/20220127/us-east-1/s3/aws4_request,
  "xAmzDate": 20220127T185143Z,
  "xAmzSecurityToken": IQoJb3JpZ2luX2VjEJr...==,
  "xAmzSignature": fcd6309a6aaee213348666a72abed8b44552a43acb6b340e8e1b288d21a5fe92,
} satisfies MediaUploadParameters

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MediaUploadParameters
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


