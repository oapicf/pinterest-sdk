
# ItemCreateBatchRecord

Object describing an item batch record to create items

## Properties

Name | Type
------------ | -------------
`attributes` | [ItemAttributesRequest](ItemAttributesRequest.md)
`itemId` | string

## Example

```typescript
import type { ItemCreateBatchRecord } from ''

// TODO: Update the object below with actual values
const example = {
  "attributes": null,
  "itemId": DS0294-M,
} satisfies ItemCreateBatchRecord

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ItemCreateBatchRecord
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


