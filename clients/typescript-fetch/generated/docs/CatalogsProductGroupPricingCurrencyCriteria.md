
# CatalogsProductGroupPricingCurrencyCriteria


## Properties

Name | Type
------------ | -------------
`operator` | string
`value` | number
`currency` | [NonNullableCatalogsCurrency](NonNullableCatalogsCurrency.md)
`negated` | boolean

## Example

```typescript
import type { CatalogsProductGroupPricingCurrencyCriteria } from ''

// TODO: Update the object below with actual values
const example = {
  "operator": null,
  "value": null,
  "currency": null,
  "negated": null,
} satisfies CatalogsProductGroupPricingCurrencyCriteria

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsProductGroupPricingCurrencyCriteria
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


