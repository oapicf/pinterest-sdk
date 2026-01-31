
# CatalogsRetailProductGroupCreateRequest

Request object for creating a product group.

## Properties

Name | Type
------------ | -------------
`catalogId` | string
`catalogType` | string
`country` | [Country](Country.md)
`description` | string
`filters` | [CatalogsProductGroupFiltersRequest](CatalogsProductGroupFiltersRequest.md)
`locale` | [CatalogsLocale](CatalogsLocale.md)
`name` | string

## Example

```typescript
import type { CatalogsRetailProductGroupCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": 2680059592705,
  "catalogType": null,
  "country": null,
  "description": null,
  "filters": null,
  "locale": null,
  "name": null,
} satisfies CatalogsRetailProductGroupCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsRetailProductGroupCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


