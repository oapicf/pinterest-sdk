
# CatalogsHotelListProductsByCatalogBasedFilterRequest

Request object to list products for a given hotel catalog_id and product group filter.

## Properties

Name | Type
------------ | -------------
`catalogId` | string
`catalogType` | string
`filters` | [CatalogsHotelProductGroupFilters](CatalogsHotelProductGroupFilters.md)

## Example

```typescript
import type { CatalogsHotelListProductsByCatalogBasedFilterRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": 2680059592705,
  "catalogType": null,
  "filters": null,
} satisfies CatalogsHotelListProductsByCatalogBasedFilterRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsHotelListProductsByCatalogBasedFilterRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


