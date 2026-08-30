
# CartingProduct


## Properties

Name | Type
------------ | -------------
`cartingProductId` | string
`displayPreferredRetailersOnly` | boolean
`displayProductPrice` | boolean
`preferredRetailers` | [Array&lt;CartingRetailer&gt;](CartingRetailer.md)
`randomizePreferredRetailers` | boolean

## Example

```typescript
import type { CartingProduct } from ''

// TODO: Update the object below with actual values
const example = {
  "cartingProductId": null,
  "displayPreferredRetailersOnly": null,
  "displayProductPrice": null,
  "preferredRetailers": null,
  "randomizePreferredRetailers": null,
} satisfies CartingProduct

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CartingProduct
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


