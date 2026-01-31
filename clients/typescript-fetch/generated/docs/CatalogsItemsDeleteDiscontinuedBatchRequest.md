
# CatalogsItemsDeleteDiscontinuedBatchRequest

Request object to discontinue catalogs items

## Properties

Name | Type
------------ | -------------
`country` | [Country](Country.md)
`items` | [Array&lt;ItemDeleteDiscontinuedBatchRecord&gt;](ItemDeleteDiscontinuedBatchRecord.md)
`language` | string
`operation` | [BatchOperation](BatchOperation.md)

## Example

```typescript
import type { CatalogsItemsDeleteDiscontinuedBatchRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "country": null,
  "items": null,
  "language": null,
  "operation": null,
} satisfies CatalogsItemsDeleteDiscontinuedBatchRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsItemsDeleteDiscontinuedBatchRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


