
# AdvancedAuctionItem


## Properties

Name | Type
------------ | -------------
`bidOptions` | [AdvancedAuctionBidOptions](AdvancedAuctionBidOptions.md)
`country` | [Country](Country.md)
`itemId` | string
`language` | [Language](Language.md)

## Example

```typescript
import type { AdvancedAuctionItem } from ''

// TODO: Update the object below with actual values
const example = {
  "bidOptions": null,
  "country": null,
  "itemId": DS0294-M,
  "language": null,
} satisfies AdvancedAuctionItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdvancedAuctionItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


