
# ProductTagsResponse

Response containing a list of product tags for a pin.

## Properties

Name | Type
------------ | -------------
`productTags` | [Array&lt;ProductTagItem&gt;](ProductTagItem.md)

## Example

```typescript
import type { ProductTagsResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "productTags": null,
} satisfies ProductTagsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ProductTagsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


