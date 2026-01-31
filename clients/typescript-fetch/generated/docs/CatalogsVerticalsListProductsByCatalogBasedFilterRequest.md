
# CatalogsVerticalsListProductsByCatalogBasedFilterRequest

Request object to list products for a given catalog_id and product group filter.

## Properties

Name | Type
------------ | -------------
`catalogId` | string
`catalogType` | string
`country` | [Country](Country.md)
`filters` | [CatalogsCreativeAssetsProductGroupFilters](CatalogsCreativeAssetsProductGroupFilters.md)
`locale` | [CatalogsLocale](CatalogsLocale.md)

## Example

```typescript
import type { CatalogsVerticalsListProductsByCatalogBasedFilterRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": 2680059592705,
  "catalogType": null,
  "country": null,
  "filters": null,
  "locale": null,
} satisfies CatalogsVerticalsListProductsByCatalogBasedFilterRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsVerticalsListProductsByCatalogBasedFilterRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


