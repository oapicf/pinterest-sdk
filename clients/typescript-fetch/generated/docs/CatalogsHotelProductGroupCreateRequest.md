
# CatalogsHotelProductGroupCreateRequest

Request object for creating a hotel product group.

## Properties

Name | Type
------------ | -------------
`catalogId` | string
`catalogType` | string
`description` | string
`filters` | [CatalogsHotelProductGroupFilters](CatalogsHotelProductGroupFilters.md)
`name` | string

## Example

```typescript
import type { CatalogsHotelProductGroupCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": 2680059592705,
  "catalogType": null,
  "description": null,
  "filters": null,
  "name": null,
} satisfies CatalogsHotelProductGroupCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsHotelProductGroupCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


