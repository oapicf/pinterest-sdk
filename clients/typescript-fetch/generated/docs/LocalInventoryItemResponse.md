
# LocalInventoryItemResponse

Local inventory item response

## Properties

Name | Type
------------ | -------------
`adLink` | string
`availability` | [ItemAvailability](ItemAvailability.md)
`createdAt` | number
`itemId` | string
`lastUpdatedTime` | number
`price` | string
`salePrice` | string
`storeMetadata` | [StoreMetadata](StoreMetadata.md)

## Example

```typescript
import type { LocalInventoryItemResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "adLink": https://examplelink.com,
  "availability": in stock,
  "createdAt": 1641483432072,
  "itemId": DS0294-M,
  "lastUpdatedTime": 1641483432072,
  "price": 49.99 USD,
  "salePrice": 24.99 USD,
  "storeMetadata": null,
} satisfies LocalInventoryItemResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LocalInventoryItemResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


