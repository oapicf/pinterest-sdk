
# CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest

Request object to list products for a given creative assets catalog_id and product group filter.

## Properties

Name | Type
------------ | -------------
`catalogId` | string
`catalogType` | string
`filters` | [CatalogsCreativeAssetsProductGroupFilters](CatalogsCreativeAssetsProductGroupFilters.md)

## Example

```typescript
import type { CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": 2680059592705,
  "catalogType": null,
  "filters": null,
} satisfies CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


