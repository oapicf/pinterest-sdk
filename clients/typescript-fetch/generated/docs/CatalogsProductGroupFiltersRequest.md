
# CatalogsProductGroupFiltersRequest

Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.

## Properties

Name | Type
------------ | -------------
`anyOf` | [Array&lt;CatalogsProductGroupFilterKeys&gt;](CatalogsProductGroupFilterKeys.md)
`allOf` | [Array&lt;CatalogsProductGroupFilterKeys&gt;](CatalogsProductGroupFilterKeys.md)

## Example

```typescript
import type { CatalogsProductGroupFiltersRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "anyOf": null,
  "allOf": null,
} satisfies CatalogsProductGroupFiltersRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsProductGroupFiltersRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


