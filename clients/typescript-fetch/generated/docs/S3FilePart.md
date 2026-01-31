
# S3FilePart


## Properties

Name | Type
------------ | -------------
`partNumber` | number
`presignedUrl` | string

## Example

```typescript
import type { S3FilePart } from ''

// TODO: Update the object below with actual values
const example = {
  "partNumber": 1,
  "presignedUrl": null,
} satisfies S3FilePart

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as S3FilePart
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


