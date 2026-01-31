
# CatalogsVerticalBatchRequest

A request object that can have multiple operations on a single batch

## Properties

Name | Type
------------ | -------------
`catalogType` | string
`country` | [Country](Country.md)
`language` | string
`items` | [Array&lt;CatalogsCreativeAssetsBatchItem&gt;](CatalogsCreativeAssetsBatchItem.md)
`catalogId` | string

## Example

```typescript
import type { CatalogsVerticalBatchRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "country": null,
  "language": null,
  "items": null,
  "catalogId": 2680059592705,
} satisfies CatalogsVerticalBatchRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsVerticalBatchRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


