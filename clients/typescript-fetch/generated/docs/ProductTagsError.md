
# ProductTagsError

Error response for requests containing ineligible product tags.

## Properties

Name | Type
------------ | -------------
`code` | number
`details` | [IneligibleProductTagsErrorDetails](IneligibleProductTagsErrorDetails.md)
`message` | string

## Example

```typescript
import type { ProductTagsError } from ''

// TODO: Update the object below with actual values
const example = {
  "code": null,
  "details": null,
  "message": null,
} satisfies ProductTagsError

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ProductTagsError
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


