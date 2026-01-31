
# LineItem


## Properties

Name | Type
------------ | -------------
`productBrand` | string
`productCategory` | string
`productId` | number
`productName` | string
`productPrice` | string
`productQuantity` | number
`productVariant` | string
`productVariantId` | string

## Example

```typescript
import type { LineItem } from ''

// TODO: Update the object below with actual values
const example = {
  "productBrand": Parker,
  "productCategory": Shoes,
  "productId": 1414,
  "productName": Parker Boots,
  "productPrice": 99.99,
  "productQuantity": 2,
  "productVariant": Red,
  "productVariantId": 1414-34832,
} satisfies LineItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LineItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


