
# CatalogsRetailProductGroupProductCounts

Product counts for a Retail CatalogsProductGroup

## Properties

Name | Type
------------ | -------------
`catalogType` | string
`inStock` | number
`outOfStock` | number
`preorder` | number
`total` | number
`videos` | number

## Example

```typescript
import type { CatalogsRetailProductGroupProductCounts } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "inStock": null,
  "outOfStock": null,
  "preorder": null,
  "total": null,
  "videos": null,
} satisfies CatalogsRetailProductGroupProductCounts

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsRetailProductGroupProductCounts
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


