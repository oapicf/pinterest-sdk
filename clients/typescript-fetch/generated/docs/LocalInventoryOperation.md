
# LocalInventoryOperation


## Properties

Name | Type
------------ | -------------
`attributes` | [RetailLocalInventoryItemAttributes](RetailLocalInventoryItemAttributes.md)
`itemId` | string
`operation` | string
`storeCode` | string

## Example

```typescript
import type { LocalInventoryOperation } from ''

// TODO: Update the object below with actual values
const example = {
  "attributes": null,
  "itemId": item_id_1,
  "operation": null,
  "storeCode": store_1,
} satisfies LocalInventoryOperation

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LocalInventoryOperation
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


