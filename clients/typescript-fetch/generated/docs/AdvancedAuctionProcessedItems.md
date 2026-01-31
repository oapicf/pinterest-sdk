
# AdvancedAuctionProcessedItems

Response object containing the results of an operation on an item bid option

## Properties

Name | Type
------------ | -------------
`catalogId` | string
`items` | [Array&lt;AdvancedAuctionProcessedItem&gt;](AdvancedAuctionProcessedItem.md)

## Example

```typescript
import type { AdvancedAuctionProcessedItems } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": 2680059592705,
  "items": null,
} satisfies AdvancedAuctionProcessedItems

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdvancedAuctionProcessedItems
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


