
# CatalogsVerticalProductGroupCreateRequest

Request object for creating a catalog based product group.

## Properties

Name | Type
------------ | -------------
`catalogType` | string
`name` | string
`description` | string
`filters` | [CatalogsCreativeAssetsProductGroupFilters](CatalogsCreativeAssetsProductGroupFilters.md)
`catalogId` | string
`country` | [Country](Country.md)
`locale` | [CatalogsLocale](CatalogsLocale.md)

## Example

```typescript
import type { CatalogsVerticalProductGroupCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "name": null,
  "description": null,
  "filters": null,
  "catalogId": 2680059592705,
  "country": null,
  "locale": null,
} satisfies CatalogsVerticalProductGroupCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsVerticalProductGroupCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


