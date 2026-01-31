
# CatalogsItemsBatchRequest

Request object of catalogs items batch

## Properties

Name | Type
------------ | -------------
`country` | [Country](Country.md)
`language` | string
`operation` | [BatchOperation](BatchOperation.md)
`items` | [Array&lt;ItemDeleteBatchRecord&gt;](ItemDeleteBatchRecord.md)

## Example

```typescript
import type { CatalogsItemsBatchRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "country": null,
  "language": null,
  "operation": null,
  "items": null,
} satisfies CatalogsItemsBatchRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsItemsBatchRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


