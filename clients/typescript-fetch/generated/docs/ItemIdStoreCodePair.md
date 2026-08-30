
# ItemIdStoreCodePair

A pair of item_id and store_code that uniquely identifies a local inventory item

## Properties

Name | Type
------------ | -------------
`itemId` | string
`storeCode` | string

## Example

```typescript
import type { ItemIdStoreCodePair } from ''

// TODO: Update the object below with actual values
const example = {
  "itemId": item_id_1,
  "storeCode": store_1,
} satisfies ItemIdStoreCodePair

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ItemIdStoreCodePair
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


