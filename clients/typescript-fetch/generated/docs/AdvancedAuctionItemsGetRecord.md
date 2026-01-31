
# AdvancedAuctionItemsGetRecord

Object uniquely identifying a retail catalog item

## Properties

Name | Type
------------ | -------------
`itemId` | string
`country` | [Country](Country.md)
`language` | [Language](Language.md)

## Example

```typescript
import type { AdvancedAuctionItemsGetRecord } from ''

// TODO: Update the object below with actual values
const example = {
  "itemId": DS0294-M,
  "country": null,
  "language": null,
} satisfies AdvancedAuctionItemsGetRecord

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdvancedAuctionItemsGetRecord
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


