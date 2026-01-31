
# CatalogsHotelProductGroupUpdateRequest

Request object for updating a hotel product group.

## Properties

Name | Type
------------ | -------------
`catalogType` | string
`name` | string
`description` | string
`filters` | [CatalogsHotelProductGroupFilters](CatalogsHotelProductGroupFilters.md)

## Example

```typescript
import type { CatalogsHotelProductGroupUpdateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "name": null,
  "description": null,
  "filters": null,
} satisfies CatalogsHotelProductGroupUpdateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsHotelProductGroupUpdateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


