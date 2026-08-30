
# ProductTagsBulkDeleteRequest

Request body for bulk deleting product tags from a pin.

## Properties

Name | Type
------------ | -------------
`productTags` | [Array&lt;ProductTagItem&gt;](ProductTagItem.md)

## Example

```typescript
import type { ProductTagsBulkDeleteRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "productTags": null,
} satisfies ProductTagsBulkDeleteRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ProductTagsBulkDeleteRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


