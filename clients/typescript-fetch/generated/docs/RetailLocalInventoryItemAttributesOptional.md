
# RetailLocalInventoryItemAttributesOptional

Local inventory attributes for retail items (all fields optional for update/get)

## Properties

Name | Type
------------ | -------------
`adLink` | string
`availability` | [ItemAvailability](ItemAvailability.md)
`price` | string
`salePrice` | string

## Example

```typescript
import type { RetailLocalInventoryItemAttributesOptional } from ''

// TODO: Update the object below with actual values
const example = {
  "adLink": https://examplelink.com,
  "availability": in stock,
  "price": 49.99 USD,
  "salePrice": 24.99 USD,
} satisfies RetailLocalInventoryItemAttributesOptional

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RetailLocalInventoryItemAttributesOptional
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


