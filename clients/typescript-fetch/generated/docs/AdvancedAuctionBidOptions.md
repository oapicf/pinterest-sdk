
# AdvancedAuctionBidOptions

Object describing a retail catalog item\'s bid options (bid price and bid multipliers).

## Properties

Name | Type
------------ | -------------
`appTypeMultipliers` | [AppTypeMultipliers](AppTypeMultipliers.md)
`bidInMicroCurrency` | number
`placementMultipliers` | [PlacementMultipliers](PlacementMultipliers.md)

## Example

```typescript
import type { AdvancedAuctionBidOptions } from ''

// TODO: Update the object below with actual values
const example = {
  "appTypeMultipliers": null,
  "bidInMicroCurrency": 5000000,
  "placementMultipliers": null,
} satisfies AdvancedAuctionBidOptions

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdvancedAuctionBidOptions
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


