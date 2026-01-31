
# AdvancedAuctionItemsSubmitRecord

Object describing an item bid option operation

## Properties

Name | Type
------------ | -------------
`operation` | [AdvancedAuctionOperation](AdvancedAuctionOperation.md)
`country` | [Country](Country.md)
`itemId` | string
`language` | [Language](Language.md)
`bidOptions` | [AdvancedAuctionBidOptions](AdvancedAuctionBidOptions.md)
`errors` | [Array&lt;AdvancedAuctionOperationError&gt;](AdvancedAuctionOperationError.md)
`updateMask` | [Array&lt;UpdateMaskBidOptionField&gt;](UpdateMaskBidOptionField.md)

## Example

```typescript
import type { AdvancedAuctionItemsSubmitRecord } from ''

// TODO: Update the object below with actual values
const example = {
  "operation": null,
  "country": null,
  "itemId": DS0294-M,
  "language": null,
  "bidOptions": null,
  "errors": null,
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


