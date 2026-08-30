
# PriceFilterPrice


## Properties

Name | Type
------------ | -------------
`currency` | [NonNullableCatalogsCurrency](NonNullableCatalogsCurrency.md)
`negated` | boolean
`operator` | [NumericFilterOperatorType](NumericFilterOperatorType.md)
`value` | number

## Example

```typescript
import type { PriceFilterPrice } from ''

// TODO: Update the object below with actual values
const example = {
  "currency": null,
  "negated": null,
  "operator": null,
  "value": null,
} satisfies PriceFilterPrice

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PriceFilterPrice
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


