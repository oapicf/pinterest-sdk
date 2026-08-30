
# LocalInventoryDeleteOperation

Delete operation for local inventory item

## Properties

Name | Type
------------ | -------------
`itemId` | string
`operation` | string
`storeCode` | string

## Example

```typescript
import type { LocalInventoryDeleteOperation } from ''

// TODO: Update the object below with actual values
const example = {
  "itemId": item_id_1,
  "operation": null,
  "storeCode": store_1,
} satisfies LocalInventoryDeleteOperation

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LocalInventoryDeleteOperation
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


