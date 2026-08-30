
# CatalogsRetailProductMetadata

Retail product metadata entity

## Properties

Name | Type
------------ | -------------
`availability` | [ProductAvailability](ProductAvailability.md)
`currency` | [NonNullableCatalogsCurrency](NonNullableCatalogsCurrency.md)
`itemGroupId` | string
`itemId` | string
`price` | number
`salePrice` | number

## Example

```typescript
import type { CatalogsRetailProductMetadata } from ''

// TODO: Update the object below with actual values
const example = {
  "availability": null,
  "currency": null,
  "itemGroupId": DS0294,
  "itemId": DS0294-L,
  "price": 24.99,
  "salePrice": 14.99,
} satisfies CatalogsRetailProductMetadata

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsRetailProductMetadata
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


