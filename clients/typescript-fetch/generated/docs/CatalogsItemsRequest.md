
# CatalogsItemsRequest

Request object of catalogs items

## Properties

Name | Type
------------ | -------------
`country` | [Country](Country.md)
`language` | string
`filters` | [CatalogsItemsPostFilters](CatalogsItemsPostFilters.md)

## Example

```typescript
import type { CatalogsItemsRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "country": null,
  "language": null,
  "filters": null,
} satisfies CatalogsItemsRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsItemsRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


