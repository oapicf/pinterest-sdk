
# CatalogsProductGroupFilters

Object holding a group of filters for a catalog product group

## Properties

Name | Type
------------ | -------------
`anyOf` | [Array&lt;CatalogsProductGroupFilterKeys&gt;](CatalogsProductGroupFilterKeys.md)
`allOf` | [Array&lt;CatalogsProductGroupFilterKeys&gt;](CatalogsProductGroupFilterKeys.md)

## Example

```typescript
import type { CatalogsProductGroupFilters } from ''

// TODO: Update the object below with actual values
const example = {
  "anyOf": null,
  "allOf": null,
} satisfies CatalogsProductGroupFilters

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsProductGroupFilters
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


