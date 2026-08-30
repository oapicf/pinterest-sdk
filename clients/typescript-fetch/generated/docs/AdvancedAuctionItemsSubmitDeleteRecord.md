
# AdvancedAuctionItemsSubmitDeleteRecord

Object describing an item bid option deletion operation

## Properties

Name | Type
------------ | -------------
`country` | [Country](Country.md)
`errors` | [Array&lt;AdvancedAuctionOperationError&gt;](AdvancedAuctionOperationError.md)
`itemId` | string
`language` | [Language](Language.md)
`operation` | string

## Example

```typescript
import type { AdvancedAuctionItemsSubmitDeleteRecord } from ''

// TODO: Update the object below with actual values
const example = {
  "country": null,
  "errors": null,
  "itemId": DS0294-M,
  "language": null,
  "operation": null,
} satisfies AdvancedAuctionItemsSubmitDeleteRecord

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdvancedAuctionItemsSubmitDeleteRecord
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


