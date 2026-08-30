
# AdvancedAuctionItemsSubmitRecord

Object describing an item bid option operation

## Properties

Name | Type
------------ | -------------
`bidOptions` | [AdvancedAuctionBidOptions](AdvancedAuctionBidOptions.md)
`country` | [Country](Country.md)
`errors` | [Array&lt;AdvancedAuctionOperationError&gt;](AdvancedAuctionOperationError.md)
`itemId` | string
`language` | [Language](Language.md)
`operation` | string
`updateMask` | [Array&lt;UpdateMaskBidOptionField&gt;](UpdateMaskBidOptionField.md)

## Example

```typescript
import type { AdvancedAuctionItemsSubmitRecord } from ''

// TODO: Update the object below with actual values
const example = {
  "bidOptions": null,
  "country": null,
  "errors": null,
  "itemId": DS0294-M,
  "language": null,
  "operation": null,
  "updateMask": [BID, APP_TYPE_BID_MULTIPLIER_SET],
} satisfies AdvancedAuctionItemsSubmitRecord

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdvancedAuctionItemsSubmitRecord
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


