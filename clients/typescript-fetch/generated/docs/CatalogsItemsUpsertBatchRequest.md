
# CatalogsItemsUpsertBatchRequest

Request object to upsert catalogs items

## Properties

Name | Type
------------ | -------------
`country` | [Country](Country.md)
`language` | string
`operation` | [BatchOperation](BatchOperation.md)
`items` | [Array&lt;ItemUpsertBatchRecord&gt;](ItemUpsertBatchRecord.md)

## Example

```typescript
import type { CatalogsItemsUpsertBatchRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "country": null,
  "language": null,
  "operation": null,
  "items": null,
} satisfies CatalogsItemsUpsertBatchRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsItemsUpsertBatchRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


