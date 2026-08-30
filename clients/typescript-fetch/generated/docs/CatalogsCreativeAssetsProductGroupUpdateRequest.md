
# CatalogsCreativeAssetsProductGroupUpdateRequest

Request object for updating a creative assets product group.

## Properties

Name | Type
------------ | -------------
`catalogType` | string
`description` | string
`filters` | [CatalogsCreativeAssetsProductGroupFilters](CatalogsCreativeAssetsProductGroupFilters.md)
`name` | string

## Example

```typescript
import type { CatalogsCreativeAssetsProductGroupUpdateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "description": null,
  "filters": null,
  "name": Most Popular,
} satisfies CatalogsCreativeAssetsProductGroupUpdateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsCreativeAssetsProductGroupUpdateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


