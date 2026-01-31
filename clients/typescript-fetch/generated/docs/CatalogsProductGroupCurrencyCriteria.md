
# CatalogsProductGroupCurrencyCriteria

A currency filter. This filter cannot be negated

## Properties

Name | Type
------------ | -------------
`negated` | boolean
`values` | [NonNullableCatalogsCurrency](NonNullableCatalogsCurrency.md)

## Example

```typescript
import type { CatalogsProductGroupCurrencyCriteria } from ''

// TODO: Update the object below with actual values
const example = {
  "negated": null,
  "values": null,
} satisfies CatalogsProductGroupCurrencyCriteria

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsProductGroupCurrencyCriteria
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


