
# CatalogsItemsDeleteBatchRequest

Request object to delete catalogs items

## Properties

Name | Type
------------ | -------------
`country` | [Country](Country.md)
`items` | [Array&lt;ItemDeleteBatchRecord&gt;](ItemDeleteBatchRecord.md)
`language` | string
`operation` | string

## Example

```typescript
import type { CatalogsItemsDeleteBatchRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "country": null,
  "items": null,
  "language": null,
  "operation": null,
} satisfies CatalogsItemsDeleteBatchRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsItemsDeleteBatchRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


