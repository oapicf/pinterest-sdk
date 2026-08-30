
# CatalogUpdate

Resource create or update operation model.

## Properties

Name | Type
------------ | -------------
`catalogType` | [CatalogsType](CatalogsType.md)
`name` | string

## Example

```typescript
import type { CatalogUpdate } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "name": null,
} satisfies CatalogUpdate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogUpdate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


